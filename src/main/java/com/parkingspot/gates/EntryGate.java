package com.parkingspot.gates;

import com.parkingspot.manager.ParkingSpotManager;
import com.parkingspot.model.Ticket;
import com.parkingspot.model.Vehicle;
import com.parkingspot.stratergy.ParkingLotStratergy;

import java.util.UUID;

public class EntryGate implements Gate{
    public ParkingSpotManager parkingSpotManager;
    public EntryGate(){
        this.parkingSpotManager = new ParkingSpotManager();
    }

    public int bookParkingSpot(ParkingLotStratergy parkingLotStratergy, Vehicle v){
        return parkingSpotManager.parkVehicle(parkingLotStratergy,v);
    }

    public Ticket createTicket(ParkingLotStratergy parkingLotStratergy, Vehicle vehicle){
        return new Ticket(UUID.randomUUID().toString(), System.currentTimeMillis(),
                vehicle, bookParkingSpot(parkingLotStratergy, vehicle));
    }
}
