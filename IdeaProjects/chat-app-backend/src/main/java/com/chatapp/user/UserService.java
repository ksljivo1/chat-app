package com.chatapp.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User getUser() {
        return new User("Hamo", "222", "aaa");
    }
}
