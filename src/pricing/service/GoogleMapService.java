package pricing.service;

import pricing.domain.Address;

public interface GoogleMapService {
    double getDistance(Address pickup, Address dropOff);
}
