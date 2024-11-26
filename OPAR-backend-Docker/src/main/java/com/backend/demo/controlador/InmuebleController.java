/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.demo.controlador;

import com.backend.demo.modelo.Inmueble;
import com.backend.demo.servicio.InmuebleServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/api/inmuebles")
public class InmuebleController {
    
    @Autowired
    InmuebleServicio inmuebleServicio;
    
    @GetMapping("/list")
    public List<Inmueble> ObtenerInmuebles(){
        return inmuebleServicio.ObtenerInmuebles();
    }
    
    @GetMapping("/arrendador/{numeroDocumento}")
    public List<Inmueble> getInmueblesByNumeroDocumento(@PathVariable String numeroDocumento) {
        return inmuebleServicio.getInmueblesByNumeroDocumento(numeroDocumento);
    }
    
    @PostMapping("/agregar")
    public ResponseEntity<Inmueble> agregar(@RequestBody Inmueble inmueble){
        Inmueble obj = inmuebleServicio.nuevoInmueble(inmueble);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }  
}
