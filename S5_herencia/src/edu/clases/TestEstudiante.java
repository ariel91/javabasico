/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.clases;

/**
 *
 * @author Ariel Chitay
 */
public class TestEstudiante {
    
    public static void inscribirEstudiante(Estudiante e){
    e.inscribir();
    System.out.println("Estudiante con carnet" + e.obtenerCarnet()+"inscrito");
    }
    
    public static void main(String[] args){
    Auxiliar aux = new Auxiliar(123,"Jose","Juarez","1324442-k","201114550", Estudiante.INGENIERIA);//ver clase auxiliar
    aux.agregarCurso();
    //aux.mostrarConstancia();
    aux.setValorPorCurso(500);
    aux.mostrarConstancia();
    inscribirEstudiante(aux);
    }
    
}
