/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backend.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.backend.demo.modelo.Tipo_Inmueble;

/**
 *
 * @author julia
 */
public interface TipoInmuebleRepositorio extends JpaRepository<Tipo_Inmueble, Integer> {
    
}
