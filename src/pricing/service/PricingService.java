package pricing.service;

import pricing.domain.Ride;

public interface PricingService {
    double getFare(Ride ride);
}
