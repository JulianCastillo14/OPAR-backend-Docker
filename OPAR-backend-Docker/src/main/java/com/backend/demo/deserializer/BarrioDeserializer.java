/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.demo.deserializer;

import com.backend.demo.modelo.Barrio;
import com.backend.demo.repositorio.BarrioRepositorio;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author julia
 */
public class BarrioDeserializer extends JsonDeserializer<Barrio> {

    @Autowired
    private BarrioRepositorio barrioRepository;

    @Override
    public Barrio deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Integer id = jsonParser.getIntValue();
        return barrioRepository.findById(id).orElse(null);
    }
}

