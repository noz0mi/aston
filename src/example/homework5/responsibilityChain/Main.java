package example.homework5.responsibilityChain;

public class Main {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment();
        Shipment shipment2 = new Shipment();
        Shipment shipment3 = new Shipment();
        Shipment shipment4 = new Shipment();
        AbstractShipmentHandler warehouseHandler = new WarehouseHandler();
        AbstractShipmentHandler deliveryServiceHandler = new DeliveryServiceHandler();
        deliveryServiceHandler.setNextHandler(warehouseHandler);
        AbstractShipmentHandler postalOfficeHandler = new PostalOfficeHandler();
        postalOfficeHandler.setNextHandler(deliveryServiceHandler);

        shipment2.setState(State.COLLECTED_AT_WAREHOUSE);
        shipment3.setState(State.TRANSFERRED_FOR_DELIVERY);
        shipment4.setState(State.READY_FOR_PICKUP);

        postalOfficeHandler.handleShipment(shipment1);
        postalOfficeHandler.handleShipment(shipment2);
        postalOfficeHandler.handleShipment(shipment3);
        postalOfficeHandler.handleShipment(shipment4);
    }
}
