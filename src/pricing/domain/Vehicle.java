package pricing.domain;

public class Vehicle {
    private final String registrationNumber;

    private final VehicleType type;

    private final Person driver;

    private final int seatingCapacity;

    public Vehicle(String registrationNumber, String type, Person driver, int seatingCapacity) {
        this.registrationNumber = registrationNumber;
        this.type = VehicleType.valueOf(type);
        this.driver = driver;
        this.seatingCapacity = seatingCapacity;
    }

    public Person getDriver() {
        return driver;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public VehicleType getType() {
        return type;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }
}
