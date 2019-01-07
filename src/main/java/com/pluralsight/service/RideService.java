package com.pluralsight.service;

import com.pluralsight.model.Ride;

import java.util.List;

public interface RideService {

    Ride createRide(Ride ride);

    List<Ride> getRides();

}