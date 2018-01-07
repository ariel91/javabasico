/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.clases;

/**
 *
 * a
 * @author Eandrade
 */
public interface Estudiante {
    
    public static final String INGENIERIA= "ingenieria";
    public static final String DERECHO = "derecho";
    public static final String ARQUITECTURA = "arquitectura";
// se pueden usar en otro lado pero no se les puede cambiar valor    
    
    String obtenerCarnet();
    String obtenerCarrera();
    boolean estaInscrito();
    void inscribir();
    
    
}
