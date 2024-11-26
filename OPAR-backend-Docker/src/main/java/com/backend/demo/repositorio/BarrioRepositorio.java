package com.backend.demo.repositorio;

/**
 *
 * @author julia
 */


import org.springframework.data.jpa.repository.JpaRepository;
import com.backend.demo.modelo.Barrio;

public interface BarrioRepositorio extends JpaRepository<Barrio, Integer> {
    
}
