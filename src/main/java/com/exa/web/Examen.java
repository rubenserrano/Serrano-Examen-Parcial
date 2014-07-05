/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.exa.web;

import java.util.ArrayList;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Ruben
 */
@Controller
@RequestMapping("/servicio-calificaciones")
public class Examen {
    @RequestMapping(value="/alumno",method = RequestMethod.GET,headers = {"Accept=Application/json"})
    @ResponseBody ArrayList<Evaluacion> examen(){
        ObjectMapper mid= new ObjectMapper();
        
        return GeneradorCalificaciones.generarCalificaciones();
    }
    
}
