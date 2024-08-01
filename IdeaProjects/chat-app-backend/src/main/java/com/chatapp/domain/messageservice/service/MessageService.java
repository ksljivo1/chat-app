package com.chatapp.domain.messageservice.service;

import com.chatapp.domain.messageservice.dto.Message;

import java.util.List;
import java.util.UUID;

public interface MessageService {

    List<Message> getMessages();

    Message findMessageById(UUID id);
}
