package ru.example.homework5.responsibilityChain;

public class PostalOfficeHandler extends AbstractShipmentHandler {

    @Override
    public void handleShipment(Shipment shipment) {
        if (shipment.getState() != null) {
            if (shipment.getState().equals(State.TRANSFERRED_FOR_DELIVERY)) {
                shipment.setState(State.READY_FOR_PICKUP);
                System.out.println("Shipment is ready for pickup at the post office");
            } else if (shipment.getState().equals(State.READY_FOR_PICKUP)) {
                System.out.println("Shipment is already delivered to the post office");
            } else if (nextHandler != null) {
                nextHandler.handleShipment(shipment);
            }
        } else if (nextHandler != null) {
            nextHandler.handleShipment(shipment);
        }
    }
}
