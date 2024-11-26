/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.demo.servicio;

import com.backend.demo.modelo.Ciudadano;
import com.backend.demo.modelo.Inmueble;
import com.backend.demo.repositorio.InmuebleRepositorio;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author juang
 */
@Service
@Transactional
public class InmuebleServicio implements IInmuebleServicio{
    
    @Autowired
    InmuebleRepositorio inmueblerepositorio;
    
    @Autowired
    CiudadanoServicio ciudadanoServicio;

    @Override
    public List<Inmueble> ObtenerInmuebles() {
        return inmueblerepositorio.findAll();
    }
    
    public List<Inmueble> getInmueblesByNumeroDocumento(String numeroDocumento) {
        Ciudadano ciudadano = ciudadanoServicio.getByNumeroDocumento(numeroDocumento);
        return inmueblerepositorio.findByNumeroDocumento(ciudadano);
    }

    @Override
    public Inmueble nuevoInmueble(Inmueble inmueble) {
        return inmueblerepositorio.save(inmueble);
    }  
}
