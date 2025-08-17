package org.turkcell.app;

import org.turkcell.app.entity.User;
import org.turkcell.app.repository.UserRepository;

public class Main {
    public static void main(String[] args) {
        // Genel veritabanı
        UserRepository userRepository = new UserRepository();

        User user = new User();
        user.setId(1);
        user.setEmail("mfk@gmail.com");
        user.setName("mfk");

        userRepository.save(user);

        User user1 = new User();
        user.setId(2);
        user.setEmail("mfk1@gmail.com");
        user.setName("mfk1");

        userRepository.save(user1);
    }
}
