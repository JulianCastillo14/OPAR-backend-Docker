/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.demo.deserializer;

import com.backend.demo.modelo.Inmueble;
import com.backend.demo.repositorio.InmuebleRepositorio;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author julia
 */
public class InmuebleDeserializer extends JsonDeserializer<Inmueble> {
    
     @Autowired
    private InmuebleRepositorio inmuebleRepository;
    
     @Override
    public Inmueble deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Integer id = jsonParser.getIntValue();
         System.out.println("este es el id: "+ id);
        return inmuebleRepository.findById(id).orElse(null);
    }
    
}
