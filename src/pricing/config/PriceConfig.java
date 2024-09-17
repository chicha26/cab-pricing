package pricing.config;

import pricing.domain.VehicleType;

import java.util.HashMap;
import java.util.Map;

public class PriceConfig {
    private static final Map<VehicleType, Double> pricePerKMMap = new HashMap<>();

    public static void setRate(VehicleType type, double rate) {
        pricePerKMMap.put(type, rate);
    }

    public static double getRate(VehicleType type) {
        return pricePerKMMap.get(type);
    }
}
