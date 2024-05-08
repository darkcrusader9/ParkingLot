package com.parkingspot.model;

import com.parkingspot.enums.ParkingSpotType;
import com.parkingspot.model.Vehicle;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingSpot {
    int id;
    ParkingSpotType parkingSpotType;
    Vehicle vehicle;
    public boolean isEmpty;
    int price;
    public ParkingSpot(int id, ParkingSpotType parkingSpotType){
        this.id = id;
        this.parkingSpotType = parkingSpotType;
        this.vehicle = null;
        this.isEmpty = true;
    }

}
