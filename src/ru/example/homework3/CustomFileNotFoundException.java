package ru.example.homework3;

import java.io.IOException;

public class CustomFileNotFoundException extends IOException {

    public CustomFileNotFoundException(String message) {
        super(message);
    }
}
