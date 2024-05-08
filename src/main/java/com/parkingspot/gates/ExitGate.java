package com.parkingspot.gates;

import com.parkingspot.model.Ticket;

public class ExitGate implements Gate{
    int cost = 20;
    public long calculateCost(Ticket ticket){
        return (System.currentTimeMillis() - ticket.getEntryTime()) * cost;
    }
}
