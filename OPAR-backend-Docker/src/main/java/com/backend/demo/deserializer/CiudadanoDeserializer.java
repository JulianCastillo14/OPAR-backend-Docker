/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.demo.deserializer;

import com.backend.demo.modelo.Ciudadano;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.springframework.beans.factory.annotation.Autowired;
import com.backend.demo.repositorio.CiudadanoRepositorio;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.IOException;
import java.util.Optional;

/**
 *
 * @author julia
 */
public class CiudadanoDeserializer extends JsonDeserializer<Ciudadano> {

    @Autowired
    private CiudadanoRepositorio ciudadanoRepository;

    @Override
    public Ciudadano deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String numeroDocumento = jsonParser.getText();
        Optional<Ciudadano> ciudadanoOptional = ciudadanoRepository.findByNumeroDocumento(numeroDocumento);
        return ciudadanoOptional.orElse(null);
    }

}

