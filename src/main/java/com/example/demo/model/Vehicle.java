package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {

    String modelName="";

    String licenceNumber="";

    float maximumTirePressure = 0;

    Wheels wheels;

    EnergySource energySource;

    float availableEnergyPercentage ;

    String type=""; //  Options: RegularCar/ElectricCar/RegularMotorcycle/ElectricMotorcycle/Truck





    public Vehicle(@JsonProperty("type") String type, @JsonProperty("modelName") String modelName, @JsonProperty("licenceNumber") String licenceNumber, @JsonProperty("availableEnergyPercentage") float availableEnergyPercentage, @JsonProperty("maximumTirePressure") float maximumTirePressure) {
        this.type = type;
        this.modelName = modelName;
        this.licenceNumber = licenceNumber;
        this.availableEnergyPercentage = availableEnergyPercentage;
        this.maximumTirePressure = maximumTirePressure;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public EnergySource getEnergySource() {
        return energySource;
    }

    public void setEnergySource(EnergySource energySource) {
        this.energySource = energySource;
    }

    public void rechargeEnergy()
    {
        this.energySource.setEnergyLeft(100);
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public void inflateTiresToMax(){
        this.wheels.tiresPressure=this.maximumTirePressure;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public float getMaximumTirePressure() {
        return maximumTirePressure;
    }

    public void setMaximumTirePressure(float maximumTirePressure) {
        this.maximumTirePressure = maximumTirePressure;
    }

    public float getAvailableEnergyPercentage() {
        return availableEnergyPercentage;
    }

    public void setAvailableEnergyPercentage(float availableEnergyPercentage) {
        this.availableEnergyPercentage = availableEnergyPercentage;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "modelName='" + modelName + '\'' +
                ", licenceNumber='" + licenceNumber + '\'' +
                ", maximumTirePressure=" + maximumTirePressure +
                ", wheels=" + wheels +
                ", energySource=" + energySource +
                ", availableEnergyPercentage=" + availableEnergyPercentage +
                ", type='" + type + '\'' +
                '}';
    }






    ////////////////////////////////////////////////////  Wheels class - START  ////////////////////////////////////////////////////

    public class Wheels {

        int numberOfWheels=0;
        float tiresPressure=0;

        public Wheels(int numberOfWheels,float tiresPressure) {
            this.numberOfWheels = numberOfWheels;
            this.tiresPressure = tiresPressure;
        }

        public int getNumberOfWheels() {
            return numberOfWheels;
        }

        public void setNumberOfWheels(int numberOfWheels) {
            this.numberOfWheels = numberOfWheels;
        }

        public float getTirePressure() {
            return tiresPressure;
        }

        public void setTirePressure(float tiresPressure) {
            this.tiresPressure = tiresPressure;
        }

        @Override
        public String toString() {
            return "Wheels{" +
                    "numberOfWheels=" + numberOfWheels +
                    ", tiresPressure=" + tiresPressure +
                    '}';
        }
    }

    ////////////////////////////////////////////////////  Wheels class  - END  ////////////////////////////////////////////////////



    ////////////////////////////////////////////////////  EnergySource class - START  ////////////////////////////////////////////////////

    public class EnergySource {

        String sourceType=""; // "Battery" or "Fuel Tank"

        float energyLeft=0;

        public EnergySource(String sourceType, float energyLeft) {
            this.sourceType = sourceType;
            this.energyLeft = energyLeft;
        }

        public String getSourceType() {
            return sourceType;
        }

        public void setSourceType(String sourceType) {
            this.sourceType = sourceType;
        }

        public float getEnergyLeft() {
            return energyLeft;
        }

        public void setEnergyLeft(float energyLeft) {
            this.energyLeft = energyLeft;
        }


        @Override
        public String toString() {
            return "EnergySource{" +
                    "sourceType='" + sourceType + '\'' +
                    ", energyLeft=" + energyLeft +
                    '}';
        }
    }

    ////////////////////////////////////////////////////  EnergySource class - END  ////////////////////////////////////////////////////





}
