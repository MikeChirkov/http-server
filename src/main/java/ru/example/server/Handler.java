package ru.example.server;

import ru.example.model.Request;

import java.io.BufferedOutputStream;

@FunctionalInterface
public interface Handler {
    void handle(Request request, BufferedOutputStream responseStream);
}
