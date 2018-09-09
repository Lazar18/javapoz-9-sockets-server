package com.sda.chat.domain.port;


import com.sda.chat.domain.model.ChatMessage;
import com.sda.chat.domain.model.ChatUser;

import java.util.List;

public interface MessagesRepository {
    void saveMessage(ChatMessage chatMessage);

    List<ChatMessage> findMessagesFor(ChatUser chatUser);
}
