/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author juang
 */
@Entity
@Table(name=Tipo_Inmueble.TABLE_NAME)
public class Tipo_Inmueble {
    public static final String TABLE_NAME = "Tipo_Inmueble";
    
    @Id
    @Column(name="Id_Tipo_Inmueble")
    private Integer idTipoInmueble;
    
    @Column(name="Tipo_Inmueble")
    private String TipoInmueble;

    public Tipo_Inmueble() {
    }

    public Tipo_Inmueble(Integer idTipoInmueble, String TipoInmueble) {
        this.idTipoInmueble = idTipoInmueble;
        this.TipoInmueble = TipoInmueble;
    }

    public Integer getIdTipoInmueble() {
        return idTipoInmueble;
    }

    public void setIdTipoInmueble(Integer idTipoInmueble) {
        this.idTipoInmueble = idTipoInmueble;
    }

    public String getTipoInmueble() {
        return TipoInmueble;
    }

    public void setTipoInmueble(String TipoInmueble) {
        this.TipoInmueble = TipoInmueble;
    }
    
    
}
