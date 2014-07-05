/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.exa.web;

/**
 *
 * @author Ruben
 */
public class Evaluacion {
    private String nombre;
    private Float calificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Float calificacion) {
        this.calificacion = calificacion;
    }

    public Evaluacion(String nombre, Float calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }
    
}
