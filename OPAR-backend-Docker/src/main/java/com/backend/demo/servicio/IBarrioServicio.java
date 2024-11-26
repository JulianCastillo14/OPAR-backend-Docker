package com.backend.demo.servicio;


import java.util.List;
import com.backend.demo.modelo.Barrio;
/**
 *
 * @author julia
 */
public interface IBarrioServicio {
    
    //Listar todos los barrios
    public List<Barrio> getBarrios();
}
