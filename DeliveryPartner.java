package fooddelivery;

public class DeliveryPartner {
    public String partnerId;
    public String name;
    public String phone;
    public String vehicleNumber;
    public boolean isAvailable;

    public DeliveryPartner(String partnerId, String name, String phone, String vehicleNumber) {
        this.partnerId = partnerId;
        this.name = name;
        this.phone = phone;
        this.vehicleNumber = vehicleNumber;
        this.isAvailable = true;
    }

    public void acceptOrder(String orderId) {
        System.out.println("Order accepted: " + orderId);
        this.isAvailable = false;
    }

    public void updateLocation(String location) {
        System.out.println("Current location: " + location);
    }

    public void completeDelivery(String orderId) {
        System.out.println("Delivery completed: " + orderId);
        this.isAvailable = true;
    }
}
