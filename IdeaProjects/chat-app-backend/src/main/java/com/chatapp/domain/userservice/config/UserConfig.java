package com.chatapp.domain.userservice.config;

import com.chatapp.domain.userservice.dto.User;
import com.chatapp.domain.userservice.db.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return args -> {
            User user = new User("test", "test", "test@gmail.com");
            userRepository.save(user);
        };
    }
}
