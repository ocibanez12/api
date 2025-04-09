package com.example.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.model.Vehiculo;

public interface VehiculoRepository extends JpaRepository <Vehiculo, String>{
}
