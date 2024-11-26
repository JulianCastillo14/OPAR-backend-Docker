/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backend.demo.servicio;

import com.backend.demo.modelo.Opinion;
import com.backend.demo.modelo.OpinionEditDTO;
import java.util.List;

/**
 *
 * @author juang
 */
public interface IOpinionServicio {
        List<Opinion> ObtenerOpinionesInmueble(Integer inmueble);
        Opinion AgregarOpinion(Opinion opinion);
        Opinion ObtenerOpinionUsuario(OpinionEditDTO opinionEdit);
        Opinion EditarOpinion(Opinion opinion);
        Opinion EliminarOpinion(Integer idOpinion);
}
