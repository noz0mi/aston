package example.homework5.proxy;

public class ServerLoggingService implements LoggingService{

    @Override
    public void logIn() {
        System.out.println("Server log in operation succeeded");
    }

    @Override
    public void logOut() {
        System.out.println("Server log out operation succeeded");
    }
}
