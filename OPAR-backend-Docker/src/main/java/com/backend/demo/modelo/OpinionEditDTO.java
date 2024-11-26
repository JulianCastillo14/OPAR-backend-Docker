/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.demo.modelo;

/**
 *
 * @author juang
 */
public class OpinionEditDTO {
    
    private String numeroDocumento;
    private Integer idInmueble;

    public OpinionEditDTO(String numeroDocumento, Integer idInmueble) {
        this.numeroDocumento = numeroDocumento;
        this.idInmueble = idInmueble;
    }

    
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Integer getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(Integer idInmueble) {
        this.idInmueble = idInmueble;
    }

    @Override
    public String toString() {
        return "OpinionEditDTO{" + "numeroDocumento=" + numeroDocumento + ", idInmueble=" + idInmueble + '}';
    }
    
    
    
}
