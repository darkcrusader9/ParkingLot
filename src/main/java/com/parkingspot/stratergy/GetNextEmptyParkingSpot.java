package com.parkingspot.stratergy;

import com.parkingspot.model.ParkingSpot;
import com.parkingspot.model.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class GetNextEmptyParkingSpot implements ParkingLotStratergy {
    @Override
    public int getVacantSlot(HashMap<Integer, ParkingSpot> parkingSpotList, Vehicle v){
        for(Map.Entry<Integer, ParkingSpot> mp : parkingSpotList.entrySet()){
            if(mp.getValue().isEmpty && mp.getValue().getParkingSpotType().toString().equals(v.getVehicleType().toString()))
                return mp.getKey();
        }
        return -1;
    }
}
