
package com.backend.demo.modelo;

import com.backend.demo.deserializer.BarrioDeserializer;
import com.backend.demo.deserializer.CiudadanoDeserializer;
import com.backend.demo.deserializer.TipoInmuebleDeserializer;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

/**
 *
 * @author juang
 */
@Entity
@Table(name= Inmueble.TABLE_NAME)
public class Inmueble {
    public static final String TABLE_NAME = "Inmueble";
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Inmueble")
    private Integer idInmueble;
             
    @ManyToOne
    @JoinColumn(name="Id_Tipo_Inmueble")
    @JsonDeserialize(using = TipoInmuebleDeserializer.class)
    private Tipo_Inmueble idTipoInmueble;
     
    @ManyToOne
    @JoinColumn(name="Id_Barrio")
    @JsonDeserialize(using = BarrioDeserializer.class)
    private Barrio idBarrio;
    
    @OneToMany(mappedBy = "inmueble")
    @JsonManagedReference
    private List<Imagen> imagenes;
    
    @ManyToOne
    @JoinColumn(name="Numero_Documento")
    @JsonDeserialize(using = CiudadanoDeserializer.class)
    private Ciudadano numeroDocumento;
     
    @Column(name="Cantidad_Habitaciones")
    private Integer cantidadHabitaciones;
     
    @Column(name="Servicios_Publicos")
    private Integer serviciosPublicos;
      
    @Column(name="Area")
    private float area;
    
    @Column(name="Descripcion")
    private String descripcion;
    
    @Column(name="Direccion")
    private String direccion;
    
    @Column(name="Precio")
    private float precio;

    public Inmueble() {
    }
    
    public Inmueble(Integer idInmueble, Tipo_Inmueble idTipoInmueble, Barrio idBarrio, Ciudadano numeroDocumento, Integer cantidadHabitaciones, Integer serviciosPublicos, float area, String descripcion, String direccion, float precio) {
        this.idInmueble = idInmueble;
        this.idTipoInmueble = idTipoInmueble;
        this.idBarrio = idBarrio;
        this.numeroDocumento = numeroDocumento;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.serviciosPublicos = serviciosPublicos;
        this.area = area;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.precio = precio;
    }

    public Inmueble(Integer idInmueble, Tipo_Inmueble idTipoInmueble, Barrio idBarrio, Ciudadano numeroDocumento, Integer cantidadHabitaciones, Integer serviciosPublicos, float area, String descripcion, String direccion, float precio, List<Imagen> imagenes) {
        this.idInmueble = idInmueble;
        this.idTipoInmueble = idTipoInmueble;
        this.idBarrio = idBarrio;
        this.numeroDocumento = numeroDocumento;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.serviciosPublicos = serviciosPublicos;
        this.area = area;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.precio = precio;
        this.imagenes = imagenes;
    }
    
    

    public Integer getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(Integer idInmueble) {
        this.idInmueble = idInmueble;
    }

    public Tipo_Inmueble getIdTipoInmueble() {
        return idTipoInmueble;
    }

    public void setIdTipoInmueble(Tipo_Inmueble idTipoInmueble) {
        this.idTipoInmueble = idTipoInmueble;
    }

    public Barrio getIdBarrio() {
        return idBarrio;
    }

    public void setIdBarrio(Barrio idBarrio) {
        this.idBarrio = idBarrio;
    }

    public Ciudadano getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Ciudadano numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public Integer getServiciosPublicos() {
        return serviciosPublicos;
    }

    public void setServiciosPublicos(Integer serviciosPublicos) {
        this.serviciosPublicos = serviciosPublicos;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public List<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<Imagen> imagenes) {
        this.imagenes = imagenes;
    }
    
}
