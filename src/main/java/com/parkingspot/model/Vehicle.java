package com.parkingspot.model;

import com.parkingspot.enums.VehicleType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Vehicle {
    String vehicleId;
    VehicleType vehicleType;

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId='" + vehicleId + '\'' +
                ", vehicleType=" + vehicleType +
                '}';
    }
}
