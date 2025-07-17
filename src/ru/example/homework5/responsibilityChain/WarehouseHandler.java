package ru.example.homework5.responsibilityChain;

public class WarehouseHandler extends AbstractShipmentHandler {

    @Override
    public void handleShipment(Shipment shipment) {
        if (shipment.getState() == null) {
            shipment.setState(State.COLLECTED_AT_WAREHOUSE);
            System.out.println("Shipment is collected at the warehouse");
        }
    }
}
