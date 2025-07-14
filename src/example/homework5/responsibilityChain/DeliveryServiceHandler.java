package example.homework5.responsibilityChain;

public class DeliveryServiceHandler extends AbstractShipmentHandler {

    @Override
    public void handleShipment(Shipment shipment) {
        if ((shipment.getState() == null) && nextHandler != null) {
            nextHandler.handleShipment(shipment);
        } else if (shipment.getState().equals(State.COLLECTED_AT_WAREHOUSE)) {
            shipment.setState(State.TRANSFERRED_FOR_DELIVERY);
            System.out.println("Shipment is transferred for delivery");
        }
    }
}
