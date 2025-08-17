package org.turkcell.app.service;

import org.turkcell.app.entity.User;
import org.turkcell.app.repository.BaseRepository;
import org.turkcell.app.repository.UserRepository;

import java.util.List;

public class UserService {
    // Bağımlılık - Dependency Injection
    BaseRepository<User> userRepository;
    public UserService(BaseRepository<User> userRepository) {
        this.userRepository = userRepository;
    }
    // Bu servisi kullanacak sayfa, reposunu kendi seçsin...

    public void save(User user){
        if (user.getEmail().length()<4)
            return;
        if (!user.getEmail().contains("@"))
            return;
        if (user.getPassword().length()<4)
            return;

        // Repository
        userRepository.save(user);
        System.out.println("Kayıt başarılı...");
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }
}
