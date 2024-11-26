/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.demo.servicio;

import com.backend.demo.modelo.Ciudadano;
import com.backend.demo.modelo.LoginCiudadano;
import com.backend.demo.repositorio.CiudadanoRepositorio;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author juang
 */
@Service
@Transactional
public class CiudadanoServicio implements ICiudadanoServicio{
    
    @Autowired
    CiudadanoRepositorio ciudadanoRepositorio;

    @Override
    public Ciudadano Login(LoginCiudadano login) {
        return ciudadanoRepositorio.findByUsuarioYContraseña(login.getUsuario(), login.getContraseña());
    }
    
    public Ciudadano getByNumeroDocumento(String numeroDocumento) {
        Optional<Ciudadano> ciudadanoOptional = ciudadanoRepositorio.findByNumeroDocumento(numeroDocumento);
        return ciudadanoOptional.orElse(null);
    }
   
}
