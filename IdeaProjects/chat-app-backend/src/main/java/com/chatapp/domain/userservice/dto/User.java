package com.chatapp.domain.userservice.dto;

import com.chatapp.domain.messageservice.dto.Message;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "\"user\"")
public class User {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;
    private String username;
    private String password;
    private String email;
    @OneToMany
    @JoinColumn(name = "sender_id")
    private List<Message> messages;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.messages = new ArrayList<>();
    }
}
