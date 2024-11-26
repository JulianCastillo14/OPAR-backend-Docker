/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.demo.controlador;

import com.backend.demo.modelo.Imagen;
import com.backend.demo.servicio.ImagenServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author julia
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/api/imagenes")
public class ImagenController {
    
    @Autowired
    ImagenServicio imagenService;
    
    @GetMapping("/list")
    public List<Imagen> consultarBarrios(){
        return (imagenService.getImagenes());
    }  
    
    @PostMapping("/agregar")
    public ResponseEntity<Imagen> agregar(@RequestBody Imagen imagen){
        System.out.println(imagen.toString());
        Imagen obj = imagenService.nuevaImagen(imagen);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }   
}
