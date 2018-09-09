package com.sda.chat.domain.model;

import java.time.Instant;

public class ChatMessage {
    private ChatUser receiver;
    private ChatUser sender;
    private String message;
    private Instant date;

    public ChatMessage(ChatUser receiver, ChatUser sender, String message, Instant date) {
        this.receiver = receiver;
        this.sender = sender;
        this.message = message;
        this.date = date;
    }

    public ChatMessage(ChatUser receiver, ChatUser sender, String message) {
        this(receiver, sender, message, Instant.now());
    }

    public ChatUser getReceiver() {
        return receiver;
    }

    public void setReceiver(ChatUser receiver) {
        this.receiver = receiver;
    }

    public ChatUser getSender() {
        return sender;
    }

    public void setSender(ChatUser sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }
}
