package com.sda.chat.api;

public class InvalidComandException extends RuntimeException {

    public InvalidComandException(String message) {
        super(message);
    }
}
