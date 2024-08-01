package com.chatapp.domain.userservice.service;

import com.chatapp.domain.userservice.dto.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    List<User> getUsers();

    void addNewUser(User user);

    User getUser(UUID id);
}
