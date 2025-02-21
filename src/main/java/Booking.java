public class Booking {
    private String customerName;
    private String pickupLocation;
    private String destination;

    public Booking(String customerName, String pickupLocation, String destination) {
        this.customerName = customerName;
        this.pickupLocation = pickupLocation;
        this.destination = destination;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public String getDestination() {
        return destination;
    }
}
