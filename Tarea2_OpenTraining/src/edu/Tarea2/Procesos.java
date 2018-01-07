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
public class Procesos {
    public void iniciar(){
    
        Profesores JulioProfe = new Profesores("nombre", 0);
         JulioProfe.setNombre(" Julio Profe ");
         JulioProfe.setEdad(40);
         JulioProfe.DecirFecha();
         JulioProfe.razonar();
         JulioProfe.hablar();
         JulioProfe.DecirEdad();
         JulioProfe.Profesion();
         System.out.println("---------------------------------------------");
         
         Alumnos IngStudent = new Alumnos("Nombre", 0);
         IngStudent.setEdad(26);
         IngStudent.setNombre(" Ariel ");
         IngStudent.DecirEdad();
         IngStudent.DecirFecha();
         IngStudent.razonar();
         IngStudent.hablar();
         IngStudent.Carrera();
         System.out.println("---------------------------------------------");
         
         Loros LoroVerde = new Loros("Nombre",0);
         LoroVerde.setEdad(3);
         LoroVerde.setNombre(" Paquito ");
         LoroVerde.DecirEdad();
         LoroVerde.hablar();
        
    }
    
}
