/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backend.demo.servicio;

import com.backend.demo.modelo.Ciudadano;
import com.backend.demo.modelo.LoginCiudadano;

/**
 *
 * @author juang
 */
public interface ICiudadanoServicio {
    
    Ciudadano Login(LoginCiudadano login);
    
}
