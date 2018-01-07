/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.prueba;

/**
 *
 * @author Ariel Chitay
 */
public class Linea {
    
        private double segundos;
        private String Nombre;
        private String Dpi;
    // creacion de constructor
    //public Linea(String nombre, String dpi) {
      //  this.nombre = nombre;
       // this.dpi = dpi;
    //}
    public void variables(String nombre, String dpi){
        Nombre = nombre;
        Dpi = dpi;
    }    
    
            public boolean conectar(double segundos){
            // aqui uso variables que me tiran desde el main principal
            if (segundos > 0){
           // System.out.println("Usted ha consumido" + segundos + "Segundos" );
            return true;
            }else{
            System.out.println("Numero invalido");
            return false;
            }
                                                }   
    
            public double CalcularImporte(double segundos){
            double calculo = segundos*0.5;
            return calculo;         
            }
            
            public void reiniciar(){
            segundos = 0;
            Nombre = "";
            Dpi = "";
            }
            
}
