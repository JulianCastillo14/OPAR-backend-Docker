/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backend.demo.repositorio;

import com.backend.demo.modelo.Ciudadano;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author juang
 */
public interface CiudadanoRepositorio extends JpaRepository<Ciudadano, String> {
    @Query("select count(*) from Ciudadano as p where p.usuario = :usuario and p.contraseña = :contraseña")
    Integer findByUsuarioYContraseñaCount(@Param("usuario") String usuario, @Param("contraseña") String contraseña);
    
    @Query("select p from Ciudadano as p where p.usuario = :usuario and p.contraseña = :contraseña")
    Ciudadano findByUsuarioYContraseña(@Param("usuario") String usuario, @Param("contraseña") String contraseña);
    
    Optional<Ciudadano> findByNumeroDocumento(String numeroDocumento);


}
