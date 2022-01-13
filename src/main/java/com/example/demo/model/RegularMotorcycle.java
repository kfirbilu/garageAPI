package com.example.demo.model;

import java.util.List;

public class RegularMotorcycle extends Motorcycle{

    public RegularMotorcycle(String type,String modelName, String licenceNumber, float availableEnergyPercentage, float maximumTirePressure) {
        super(type="RegularMotorcycle",modelName, licenceNumber, availableEnergyPercentage, maximumTirePressure);
        this.energySource = new EnergySource("Fuel Tank",0);
        this.availableEnergyPercentage = energySource.getEnergyLeft();
        this.wheels = new Wheels(2,0);

    }


    @Override
    public String toString() {
        return "RegularMotorcycle{" +
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
