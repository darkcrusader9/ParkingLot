package com.parkingspot.stratergy;

import com.parkingspot.model.ParkingSpot;
import com.parkingspot.model.Vehicle;

import java.util.HashMap;

public interface ParkingLotStratergy {
    int getVacantSlot(HashMap<Integer, ParkingSpot> parkingSpotList, Vehicle vehicle);
}
