package com.chatapp.domain.messageservice.service;

import com.chatapp.domain.messageservice.db.MessageRepository;
import com.chatapp.domain.messageservice.dto.Message;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;

    @Override
    public List<Message> getMessages() {
        return messageRepository.findAll();
    }

    @Override
    public Message findMessageById(UUID id) {
        Optional<Message> message = messageRepository.findById(id);
        return message.orElse(null);
    }
}
