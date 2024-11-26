/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.demo.servicio;

import org.springframework.stereotype.Service;
import com.backend.demo.modelo.Barrio;
import com.backend.demo.repositorio.BarrioRepositorio;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * @author julia
 */
@Service
@Transactional
public class BarrioServicio implements IBarrioServicio {
    
    @Autowired
    private BarrioRepositorio barrioRepo;

    @Override
    public List<Barrio> getBarrios() {
        return barrioRepo.findAll();
    }
    
}
