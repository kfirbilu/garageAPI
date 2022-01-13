package com.example.demo.model;

import java.util.List;

public class RegularCar extends Car{
    public RegularCar(String type,String modelName, String licenceNumber, float availableEnergyPercentage, float maximumTirePressure) {
        super( type = "RegularCar",modelName, licenceNumber, availableEnergyPercentage, maximumTirePressure);
        this.energySource = new EnergySource("Fuel Tank",0);
        this.availableEnergyPercentage = energySource.getEnergyLeft();
        this.wheels = new Wheels(4,0);

    }


    @Override
    public String toString() {
        return "RegularCar{" +
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
