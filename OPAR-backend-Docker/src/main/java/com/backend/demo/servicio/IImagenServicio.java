/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backend.demo.servicio;

import com.backend.demo.modelo.Imagen;
import java.util.List;

/**
 *
 * @author julia
 */
public interface IImagenServicio {
    //Listar todos los barrios
    public List<Imagen> getImagenes();
    Imagen nuevaImagen(Imagen imagen);    
}
