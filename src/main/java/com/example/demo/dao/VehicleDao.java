package com.example.demo.dao;

import com.example.demo.model.Vehicle;

import java.util.List;
import java.util.Optional;

public interface VehicleDao {

    int insertVehicle(String licenceNumber, Vehicle vehicle);

    default int insertVehicle(Vehicle vehicle){
        String licenceNumber = vehicle.getLicenceNumber();
        return insertVehicle(licenceNumber,vehicle);
    }

    List<Vehicle> selectAllVehicles();

    Optional<Vehicle> getVehicleByLicenceNumber(String licenceNumber);

    int deleteVehicleByLicenceNumber(String licenceNumber);

    int inflateVehicleByLicenceNumber(String licenceNumber);

    int refillEnergyByLicenceNumber(String licenceNumber);




}
