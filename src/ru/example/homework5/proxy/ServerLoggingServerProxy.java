package ru.example.homework5.proxy;

public class ServerLoggingServerProxy implements LoggingService{

    private ServerLoggingService serverLoggingService = new ServerLoggingService();

    @Override
    public void logIn() {
        serverLoggingService.logIn();
    }

    @Override
    public void logOut() {
        serverLoggingService.logOut();
    }
}
