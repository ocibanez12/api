package com.example.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.model.Vehiculo;
import com.example.api.repository.VehiculoRepository;

@RestController
@RequestMapping("/vehiculo")
public class VehiculoController {

    @Autowired
    private VehiculoRepository vehiculoRepository;
    
    @GetMapping
    public List<Vehiculo> obtenerVehiculos(){
        //o SELECT * FROM VEHICULO;
        return vehiculoRepository.findAll();
    }
}
