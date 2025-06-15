package example.homework1.vehicles;

public abstract class Vehicle {
    private String driver;

    public Vehicle() {
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public abstract void move();

}
