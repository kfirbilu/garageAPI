package com.example.demo.model;

import java.util.List;

public class ElectricMotorcycle extends Motorcycle{

    public ElectricMotorcycle(String type,String modelName, String licenceNumber, float availableEnergyPercentage, float maximumTirePressure) {
        super(type = "ElectricMotorcycle",modelName, licenceNumber, availableEnergyPercentage, maximumTirePressure);
        this.energySource = new EnergySource("Battery",0);
        this.availableEnergyPercentage = energySource.getEnergyLeft();
        this.wheels = new Wheels(2,0);

    }


    @Override
    public String toString() {
        return "ElectricMotorcycle{" +
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
