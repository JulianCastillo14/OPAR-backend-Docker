/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backend.demo.repositorio;

import com.backend.demo.modelo.Imagen;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

/**
 *
 * @author julia
 */
public interface ImagenRepositorio extends JpaRepositoryImplementation<Imagen, Integer> {
    
}
