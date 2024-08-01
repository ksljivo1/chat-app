package com.chatapp.domain.userservice.service;

import com.chatapp.domain.userservice.db.UserRepository;
import com.chatapp.domain.userservice.dto.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public void addNewUser(User user) {
        Optional<User> userOptional = userRepository.findByEmail(user.getEmail());
        if (userOptional.isPresent()) {
            throw new IllegalStateException("Email already in use");
        }
        userRepository.save(user);
    }

    @Override
    public User getUser(UUID id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }
}
