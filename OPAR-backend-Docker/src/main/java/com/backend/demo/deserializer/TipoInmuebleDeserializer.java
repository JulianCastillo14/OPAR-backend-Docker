package com.backend.demo.deserializer;

import com.fasterxml.jackson.databind.JsonDeserializer;
import  com.backend.demo.modelo.Tipo_Inmueble;
import  com.backend.demo.repositorio.TipoInmuebleRepositorio;
import com.fasterxml.jackson.databind.DeserializationContext;
import org.springframework.beans.factory.annotation.Autowired;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

/**
 *
 * @author julia
 */
public class TipoInmuebleDeserializer extends JsonDeserializer<Tipo_Inmueble> {

    @Autowired
    private TipoInmuebleRepositorio tipoInmuebleRepository;

    @Override
    public Tipo_Inmueble deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Integer id = jsonParser.getIntValue();
        return tipoInmuebleRepository.findById(id).orElse(null);
    }
}
