/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.demo.modelo;

import com.backend.demo.deserializer.InmuebleDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author juang
 */
    @Entity
    @Table(name=Opinion.TABLE_NAME)
    public class Opinion {
        public static final String TABLE_NAME = "Opinion";

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "Id_Opinion")
        private Integer idOpinion;

        @ManyToOne
        @JoinColumn(name="Id_Inmueble")
        @JsonDeserialize(using = InmuebleDeserializer.class)
        private Inmueble idInmueble;

        @ManyToOne
        @JoinColumn(name="Numero_Documento")
        private Ciudadano numeroDocumento;

        @Column(name = "Comentario")
        private String comentario;

        @Column(name = "Calificacion")
        private float calificacion;

        public Opinion() {
        }


        public Opinion(Inmueble idInmueble, Ciudadano numeroDocumento, String comentario, float calificacion) {
            this.idInmueble = idInmueble;
            this.numeroDocumento = numeroDocumento;
            this.comentario = comentario;
            this.calificacion = calificacion;
        }



        public Integer getIdOpinion() {
            return idOpinion;
        }

        public void setIdOpinion(Integer idOpinion) {
            this.idOpinion = idOpinion;
        }

        public Inmueble getInmueble() {
            return idInmueble;
        }

        public void setInmueble(Inmueble inmueble) {
            this.idInmueble = inmueble;
        }

        public Ciudadano getNumeroDocumento() {
            return numeroDocumento;
        }

        public void setNumeroDocumento(Ciudadano numeroDocumento) {
            this.numeroDocumento = numeroDocumento;
        }

        public String getComentario() {
            return comentario;
        }

        public void setComentario(String comentario) {
            this.comentario = comentario;
        }

        public float getCalificacion() {
            return calificacion;
        }

        public void setCalificacion(float calificacion) {
            this.calificacion = calificacion;
        }

        @Override
        public String toString() {
            return "Opinion{" + "idOpinion=" + idOpinion + ", idInmueble=" + idInmueble + ", numeroDocumento=" + numeroDocumento + ", comentario=" + comentario + ", calificacion=" + calificacion + '}';
        }


    }
