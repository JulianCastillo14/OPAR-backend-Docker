/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.demo.repositorio;

import com.backend.demo.modelo.Ciudadano;
import com.backend.demo.modelo.Inmueble;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author juang
 */
public interface InmuebleRepositorio extends JpaRepository<Inmueble, Integer>{
    List<Inmueble> findByNumeroDocumento(Ciudadano numeroDocumento);
}
