package pricing.service;

import pricing.config.PriceConfig;
import pricing.domain.Ride;

public class PricingServiceImpl implements PricingService {

    private final GoogleMapService googleMapService;

    public PricingServiceImpl(GoogleMapService googleMapService) {
        this.googleMapService = googleMapService;
    }

    @Override
    public double getFare(Ride ride) {
        return googleMapService.getDistance(ride.getPickup(), ride.getDropOff())
                * PriceConfig.getRate(ride.getVehicle().getType());
    }
}
