package com.sda.chat;

import com.sda.chat.api.ChatServer;
import com.sda.chat.domain.ChatService;
import com.sda.chat.domain.port.MessagesRepository;
import com.sda.chat.domain.port.UsersRepository;
import com.sda.chat.infrastructure.file.InTextFileMessageRepository;
import com.sda.chat.infrastructure.memory.InMemoryMessagesRepository;
import com.sda.chat.infrastructure.memory.InMemoryUsersRepository;

import java.io.IOException;

public class ChatApplication {
    public static void main(String[] args) throws IOException {
        UsersRepository usersRepository = new InMemoryUsersRepository();
        MessagesRepository messagesRepository = new InTextFileMessageRepository(
                "D:\\Amazon\\Kurs SDA\\JAVA od podstaw\\sockets\\javapoz-9-sockets-server\\messages.txt",
                usersRepository
        );
        ChatService chatService = new ChatService(usersRepository, messagesRepository);
        ChatServer chatServer = new ChatServer(chatService);

        chatServer.startServer();
    }
}
