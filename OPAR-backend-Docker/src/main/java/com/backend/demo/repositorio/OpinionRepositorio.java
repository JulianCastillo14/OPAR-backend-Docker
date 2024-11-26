/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backend.demo.repositorio;

import com.backend.demo.modelo.Inmueble;
import com.backend.demo.modelo.Opinion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author juang
 */
public interface OpinionRepositorio extends JpaRepository<Opinion, Integer>{
        @Query("SELECT p FROM Opinion p WHERE p.idInmueble.idInmueble = :inmuebleId")
        List<Opinion> findByInmueble(@Param("inmuebleId") Integer inmuebleId);
        
        @Query("SELECT p FROM Opinion p WHERE p.idInmueble.idInmueble = :inmuebleId AND p.numeroDocumento.numeroDocumento = :numeroDocumento")
        Opinion findByUsuario(@Param("inmuebleId") Integer inmuebleId, @Param("numeroDocumento") String numeroDocumento);
}
