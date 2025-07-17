package ru.example.homework5.proxy;

public class Main {
    public static void main(String[] args) {
        ServerLoggingServerProxy serverLoggingServerProxy = new ServerLoggingServerProxy();
        serverLoggingServerProxy.logIn();
        serverLoggingServerProxy.logOut();
    }
}
