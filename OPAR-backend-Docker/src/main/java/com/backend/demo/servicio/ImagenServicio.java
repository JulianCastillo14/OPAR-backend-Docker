package com.backend.demo.servicio;

import com.backend.demo.modelo.Imagen;
import com.backend.demo.repositorio.ImagenRepositorio;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author julia
 */
@Service
@Transactional
public class ImagenServicio implements IImagenServicio{
    
    @Autowired
    ImagenRepositorio imagenRepositorio;

    @Override
    public Imagen nuevaImagen(Imagen imagen) {
        return imagenRepositorio.save(imagen);
    }

    @Override
    public List<Imagen> getImagenes() {
        return imagenRepositorio.findAll();
    }
}
