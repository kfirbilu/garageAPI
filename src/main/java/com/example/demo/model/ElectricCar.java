package com.example.demo.model;

import java.util.List;

public class ElectricCar extends Car{

    public ElectricCar(String type,String modelName, String licenceNumber, float availableEnergyPercentage, float maximumTirePressure) {
        super(type = "ElectricCar",modelName, licenceNumber, availableEnergyPercentage, maximumTirePressure);
        this.energySource = new EnergySource("Battery",0);
        this.availableEnergyPercentage = energySource.getEnergyLeft();
        this.wheels = new Wheels(4,0);

    }


    @Override
    public String toString() {
        return "ElectricCar{" +
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
