package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Truck extends Vehicle{


    public Truck(String type,String modelName, String licenceNumber, float availableEnergyPercentage, float maximumTirePressure) {
        super( type="Truck",modelName, licenceNumber, availableEnergyPercentage, maximumTirePressure);
        this.energySource = new EnergySource("Fuel Tank",0);
        this.availableEnergyPercentage = energySource.getEnergyLeft();
        this.wheels = new Wheels(16,0);

    }


    @Override
    public String toString() {
        return "Truck{" +
                "modelName='" + modelName + '\'' +
                ", licenceNumber='" + licenceNumber + '\'' +
                ", maximumTirePressure=" + maximumTirePressure +
                ", wheels=" + wheels +
                ", energySource=" + energySource +
                ", availableEnergyPercentage=" + availableEnergyPercentage +
                ", type='" + type + '\'' +
                '}';
    }
}
