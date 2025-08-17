package org.turkcell.app;

import org.turkcell.app.entity.User;
import org.turkcell.app.repository.UserRepository;
import org.turkcell.app.service.UserService;

import java.util.List;
// Presentation

// SOLİD => Dependency Inversion Principle
public class Main {
    public static void main(String[] args) {
        // Genel veritabanı

        // Presentation -> Service -> Entity & Repository
        UserService  userService = new UserService(new UserRepository());

        User user = new User();
        user.setId(1);
        user.setEmail("mfk@gmail.com");
        user.setName("mfk");
        user.setPassword("12345");


        userService.save(user);


        }
    }

