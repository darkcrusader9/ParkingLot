package com.parkingspot.manager;

import com.parkingspot.enums.ParkingSpotType;
import com.parkingspot.model.ParkingSpot;
import com.parkingspot.model.Vehicle;
import com.parkingspot.stratergy.ParkingLotStratergy;

import java.util.HashMap;

public class ParkingSpotManager {
    HashMap<Integer, ParkingSpot> parkingSpotList;
    public ParkingSpotManager(){
        this.parkingSpotList = new HashMap<>();
    }

    public void addParkingSpot(int vacantId, ParkingSpotType parkingSpotType){
        ParkingSpot parkingSpot = new ParkingSpot(vacantId, parkingSpotType);
        this.parkingSpotList.put(vacantId, parkingSpot);
    }

    public void removeParkingSpot(ParkingSpot p){
        this.parkingSpotList.remove(p);
    }

    public int findParkingSpot(ParkingLotStratergy parkingLotStratergy, Vehicle vehicle){
        return parkingLotStratergy.getVacantSlot(parkingSpotList, vehicle);
    }

    public int parkVehicle(ParkingLotStratergy parkingLotStratergy, Vehicle vehicle){
        int vacantId = this.findParkingSpot(parkingLotStratergy, vehicle);
        if(parkingSpotList.containsKey(vacantId)){
            ParkingSpot parkingSpot = parkingSpotList.get(vacantId);
            parkingSpot.setVehicle(vehicle);
            parkingSpot.setEmpty(false);
            return vacantId;
        }
        return -1;
    }

    public void removeVehicle(ParkingSpot parkingSpot){
        parkingSpot.setVehicle(null);
        parkingSpot.setEmpty(true);
    }
}
