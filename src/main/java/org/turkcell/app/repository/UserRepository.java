package org.turkcell.app.repository;

import org.turkcell.app.entity.User;

import java.util.ArrayList;
import java.util.List;

//UserDal, UserDao
public class UserRepository {

    List<User> users =new ArrayList<>();

    public List<User> findAll(){
        return users;
    }
    public User findById(int id){
        return users.stream().filter(u->u.getId()==id).findFirst().orElse(null);
    }
    public void save(User user){
        users.add(user);
    }
}
