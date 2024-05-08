package com.parkingspot;

import com.parkingspot.enums.ParkingSpotType;
import com.parkingspot.enums.VehicleType;
import com.parkingspot.gates.EntryGate;
import com.parkingspot.gates.ExitGate;
import com.parkingspot.manager.ParkingSpotManager;
import com.parkingspot.model.ParkingSpot;
import com.parkingspot.model.Ticket;
import com.parkingspot.model.Vehicle;
import com.parkingspot.stratergy.GetNextEmptyParkingSpot;

public class App {
    public static void main(String[] args) {
        EntryGate entryGate = new EntryGate();
        addParkingSpots(entryGate);
        ExitGate exitGate = new ExitGate();

        Vehicle vehicle = new Vehicle("OD10A7621", VehicleType.TWO_WHEELER);
        Ticket ticket = entryGate.createTicket(new GetNextEmptyParkingSpot(), vehicle);
        long parkingCharges = exitGate.calculateCost(ticket);
        System.out.println(ticket.toString() + " " + parkingCharges);

        Vehicle vehicle1 = new Vehicle("MP10G5151", VehicleType.FOUR_WHEELER);
        Ticket ticket1 = entryGate.createTicket(new GetNextEmptyParkingSpot(), vehicle1);
        System.out.println(ticket1.toString());

        Vehicle vehicle2 = new Vehicle("KA05D6181", VehicleType.TWO_WHEELER);
        Ticket ticket2 = entryGate.createTicket(new GetNextEmptyParkingSpot(), vehicle2);
        System.out.println(ticket2.toString());
    }

    private static void addParkingSpots(EntryGate entryGate) {
        entryGate.parkingSpotManager.addParkingSpot(1, ParkingSpotType.TWO_WHEELER);
        entryGate.parkingSpotManager.addParkingSpot(2, ParkingSpotType.FOUR_WHEELER);
        entryGate.parkingSpotManager.addParkingSpot(3, ParkingSpotType.FOUR_WHEELER);
        entryGate.parkingSpotManager.addParkingSpot(4, ParkingSpotType.FOUR_WHEELER);
        entryGate.parkingSpotManager.addParkingSpot(5, ParkingSpotType.TWO_WHEELER);
    }
}
