package pricing.domain;

public class Address {
    private final String firstLine;
    private final String secondLine;
    private final String thirdLine;
    private final String city;
    private final String state;
    private final String pinCode;
    private final GeoCoordinates geoCoordinates;

    public Address(String firstLine, String secondLine, String thirdLine, String city, String state, String pinCode,
                   GeoCoordinates geoCoordinates) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.thirdLine = thirdLine;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.geoCoordinates = geoCoordinates;
    }

    public String getFirstLine() {
        return firstLine;
    }

    public String getSecondLine() {
        return secondLine;
    }

    public String getThirdLine() {
        return thirdLine;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPinCode() {
        return pinCode;
    }

    public GeoCoordinates getGeoCoordinates() {
        return geoCoordinates;
    }

    @Override
    public String toString() {
        return "pricing.domain.Address{" +
                "firstLine='" + firstLine + '\'' +
                ", secondLine='" + secondLine + '\'' +
                ", thirdLine='" + thirdLine + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", geoCoordinates=" + geoCoordinates +
                '}';
    }
}
