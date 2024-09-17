package pricing.domain;

public class Ride {
    private final Person customer;
    private final Vehicle vehicle;
    private final Address pickup;
    private final Address dropOff;

    public Ride(Person customer, Vehicle vehicle, Address pickup, Address dropOff) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.pickup = pickup;
        this.dropOff = dropOff;
    }

    public Person getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Address getPickup() {
        return pickup;
    }

    public Address getDropOff() {
        return dropOff;
    }

}
