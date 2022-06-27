package com.company.messages.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.company.messages.model.Message;

@Repository
public interface MessageRepository extends MongoRepository<Message, String> {

  
}
