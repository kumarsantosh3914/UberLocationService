package org.example.locationservice.services;

import org.example.locationservice.dtos.DriverLocationDto;

import java.util.List;

public interface LocationService {

    Boolean saveDriverLocation(String driverId, Double latitude, Double longitude);

    List<DriverLocationDto> getNearByDrivers(Double latitude, Double longitude);
}
