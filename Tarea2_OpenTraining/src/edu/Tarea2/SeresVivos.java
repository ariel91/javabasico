/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.Tarea2;

/**
 *
 * @author Ariel Chitay
 */
public class SeresVivos {
    protected String Nombre;
    protected int edad;
    private int fecha = 2017;

    public SeresVivos(String Nom, int ed) {
        this.Nombre = Nom;
        this.edad = ed;
    }
           
    
    public void razonar(){
        System.out.println("Soy Racional" );
    }
    
    public void hablar(){
        System.out.println("Hola me llamo" + getNombre() + "Y puedo hablar");
    }
    
    public void DecirEdad(){
        System.out.println("Mi edad es " + getEdad()+ " años de edad");
    }
    
    public void DecirFecha(){
        System.out.println("Naci en el año " + (fecha - getEdad()));
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
