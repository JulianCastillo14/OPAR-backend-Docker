package com.backend.demo.controlador;

import com.backend.demo.modelo.Barrio;
import com.backend.demo.servicio.BarrioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author julia
 */

@RestController
@CrossOrigin("*")
@RequestMapping("/api/barrios")
public class BarrioController {
    
    @Autowired
    private BarrioServicio barrioService;
    
    @GetMapping("/list")
    public List<Barrio> consultarBarrios(){
        return (barrioService.getBarrios());
    }  
}
