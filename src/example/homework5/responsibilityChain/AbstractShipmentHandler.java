package example.homework5.responsibilityChain;

public abstract class AbstractShipmentHandler {

    protected AbstractShipmentHandler nextHandler;

    public void setNextHandler(AbstractShipmentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleShipment(Shipment shipment);
}
