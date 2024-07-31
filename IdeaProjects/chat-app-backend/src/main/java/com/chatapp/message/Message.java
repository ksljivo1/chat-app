package com.chatapp.message;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import java.time.Instant;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "\"message\"")
public class Message {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;
    private UUID sender_id;
    private UUID receiver_id;
    private String content;
    private Instant send_at;

    public Message(UUID sender_id, UUID receiver_id, String content, Instant send_at) {
        this.sender_id = sender_id;
        this.receiver_id = receiver_id;
        this.content = content;
        this.send_at = send_at;
    }
}
