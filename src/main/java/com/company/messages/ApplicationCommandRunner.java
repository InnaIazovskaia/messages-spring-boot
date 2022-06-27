package com.company.messages;

import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.company.messages.repository.MessageRepository;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


@Component
@EnableMongoRepositories
public  class ApplicationCommandRunner implements CommandLineRunner {

  protected final Log logger = LogFactory.getLog(getClass());

  @Autowired
  MessageRepository productRepository;

  @Override
  public void run(String... args) throws Exception {}
}
