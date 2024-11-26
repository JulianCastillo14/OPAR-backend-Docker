/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backend.demo.servicio;

import com.backend.demo.modelo.Inmueble;
import java.util.List;

/**
 *
 * @author juang
 */
public interface IInmuebleServicio {
    List<Inmueble> ObtenerInmuebles();
    Inmueble nuevoInmueble(Inmueble inmueble);
}
