package com.company.messages.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import com.company.messages.model.Message;
import com.company.messages.repository.MessageRepository;

@RestController
@RequestMapping("messages")
@ComponentScan("com.company.messages.repository;")
public class MessageRestController {

  @Autowired
  MessageRepository messageRepository;

  @GetMapping("all")
  public List<Message> getAllMessages() {
    return messageRepository.findAll();
  }

  @PostMapping(path="create", consumes = "application/JSON")
  public Message createMessage(@RequestBody Message message) {
    Message createdMessage = messageRepository.save(message);
    return createdMessage;
  }

}
