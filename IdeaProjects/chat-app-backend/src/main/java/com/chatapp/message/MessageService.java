package com.chatapp.user;

import com.chatapp.message.Message;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.UUID;

@Service
public class MessageService {
    public Message getMessage() {
        return new Message(UUID.randomUUID(), UUID.randomUUID(), "dummy message", Instant.now());
    }
}
