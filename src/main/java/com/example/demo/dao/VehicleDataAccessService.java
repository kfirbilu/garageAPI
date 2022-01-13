package com.example.demo.dao;

import com.example.demo.model.*;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository("Dao")
public class VehicleDataAccessService implements VehicleDao{


    private static List<Vehicle> DB = new ArrayList<>();




    @Override
    public int insertVehicle(String licenceNumber, Vehicle vehicle) {
        String type = vehicle.getType().toLowerCase(Locale.ROOT);

        Optional<Vehicle> v =  getVehicleByLicenceNumber(licenceNumber);  // if vehicle already exists won't create a new one
        if(!v.isEmpty())
            return 0;

        switch (type){

            case "regularcar":
                DB.add(new RegularCar("",vehicle.getModelName(),vehicle.getLicenceNumber(),vehicle.getAvailableEnergyPercentage(),vehicle.getMaximumTirePressure()));
                break;

            case "electriccar":
                DB.add(new ElectricCar("",vehicle.getModelName(),vehicle.getLicenceNumber(),vehicle.getAvailableEnergyPercentage(),vehicle.getMaximumTirePressure()));
                break;

            case "regularmotorcycle":
                DB.add(new RegularMotorcycle("",vehicle.getModelName(),vehicle.getLicenceNumber(),vehicle.getAvailableEnergyPercentage(),vehicle.getMaximumTirePressure()));
                break;

            case "electricmotorcycle":
                DB.add(new ElectricMotorcycle("",vehicle.getModelName(),vehicle.getLicenceNumber(),vehicle.getAvailableEnergyPercentage(),vehicle.getMaximumTirePressure()));
                break;

            case "truck":
                DB.add(new Truck("",vehicle.getModelName(),vehicle.getLicenceNumber(),vehicle.getAvailableEnergyPercentage(),vehicle.getMaximumTirePressure()));
        }

        return 1;
    }

    @Override
    public List<Vehicle> selectAllVehicles() {
        return DB;
    }

    @Override
    public int deleteVehicleByLicenceNumber(String licenceNumber) {
        Optional<Vehicle> vehicle =  getVehicleByLicenceNumber(licenceNumber);
        if(vehicle.isEmpty()) // if vehicle does not already exist won't delete anything
            return 0;
        DB.remove(vehicle.get());
        return 1;
    }

    @Override
    public Optional<Vehicle> getVehicleByLicenceNumber(String licenceNumber) {
        return DB.stream().filter(vehicle -> vehicle.getLicenceNumber().equalsIgnoreCase(licenceNumber)).findFirst();
    }

    @Override
    public int inflateVehicleByLicenceNumber(String licenceNumber) {

        return getVehicleByLicenceNumber(licenceNumber).map(vehicle1 -> {
            int indexOfVehicle = DB.indexOf(vehicle1);
            if(indexOfVehicle>=0)
            {
                DB.get(indexOfVehicle).inflateTiresToMax();
                return 1;
            }
            return 0;
        } )
                .orElse(0);
    }

    @Override
    public int refillEnergyByLicenceNumber(String licenceNumber) {
        return getVehicleByLicenceNumber(licenceNumber).map(vehicle1 -> {
                    int indexOfVehicle = DB.indexOf(vehicle1);
                    if(indexOfVehicle>=0)
                    {
                        DB.get(indexOfVehicle).rechargeEnergy();
                        return 1;
                    }
                    return 0;
                } )
                .orElse(0);
    }
}

