/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.demo.controlador;

import com.backend.demo.modelo.Ciudadano;
import com.backend.demo.modelo.LoginCiudadano;
import com.backend.demo.servicio.CiudadanoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author juang
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/api/ciudadanos")
public class CiudadanoController {
    
    @Autowired
    CiudadanoServicio ciudadanoServicio;
    
    @PostMapping("/login")
    public Ciudadano Login(@RequestBody LoginCiudadano login){
        System.out.println(login.getContraseña());
        System.out.println(login.getUsuario());
        return ciudadanoServicio.Login(login);
    }
    
    
}
