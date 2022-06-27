package com.company.messages.model;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

import javax.persistence.Id;
import lombok.*;

@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
@Document("messages")
public class Message {

  @Id
  private String messageId;
  private LocalDate date;
  private String text;
  private String sender;
  private String recipient;

  public Message (String text, String sender, String recipient) {
      this.text = text;
      this.sender = sender;
      this.recipient = recipient;
    }
}
