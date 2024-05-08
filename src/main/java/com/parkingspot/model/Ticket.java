package com.parkingspot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Ticket {
    String ticketId;
    long entryTime;
    Vehicle vehicle;
    int parkingSpotId;

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", entryTime=" + entryTime +
                ", vehicle=" + vehicle +
                ", parkingSpotId=" + parkingSpotId +
                '}';
    }
}
