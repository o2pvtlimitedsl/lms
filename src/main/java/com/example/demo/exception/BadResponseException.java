package com.example.demo.exception;

public class BadResponseException extends RuntimeException {
    public BadResponseException(String message) {
        super(message);
    }
}