package com.example.demo.api;

import com.example.demo.model.Vehicle;
import com.example.demo.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/vehicle")
@RestController
public class VehicleController {

    private final VehicleService vehicleService;

    @Autowired
    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }


    @PostMapping
    public void addVehicle(@RequestBody Vehicle vehicle){
        vehicleService.addVehicle(vehicle);
    }

    @GetMapping
    public List<Vehicle> getAllVehicles(){
        return vehicleService.getAllVehicles();
    }

    @GetMapping(path="{licenceNumber}")
    public Vehicle getVehicleByLicenceNumber(@PathVariable("licenceNumber") String licenceNumber){
        return vehicleService.getVehicleByLicenceNumber(licenceNumber).orElse(null);
    }

    @DeleteMapping(path ="{licenceNumber}")
    public void deleteVehicleByLicenceNumber(@PathVariable("licenceNumber") String licenceNumber){
        vehicleService.deleteVehicleLicenceNumber(licenceNumber);
    }


//check


    @PutMapping(path ="{licenceNumber}")
    @RequestMapping(value = "/inflate/{licenceNumber}")
    public void inflateTiresBtLicenceNumber(@PathVariable String licenceNumber)
    {
        vehicleService.inflateTiresByLicenceNumber(licenceNumber);
    }



    @PutMapping(path ="{licenceNumber}")
    @RequestMapping("/recharge/{licenceNumber}")
    public void rechargeVehicleByLicenceNumber(@PathVariable String licenceNumber)
    {
        vehicleService.rechargeVehicleByLicenceNumber(licenceNumber);
    }



}
