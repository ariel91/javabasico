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
public class Auxiliar extends Empleado implements Estudiante {
    protected int cantidadCursos;
    protected double valorPorCurso; // tiene que ver con la herencia solo ciertos lo peuden ver
    String carnet; // agregado despues de los abstacts de abajo
    String carrera;
    boolean inscrito;
    
    public Auxiliar(int codigo, String nombre, String apellido, String nit, String carnet, String carrera) {
        super(codigo, nombre, apellido, nit, 0);
        this.carnet = carnet;
        this.carrera = carrera;
        this.inscrito = false;       
    }

    /**
     * @return the cantidadCursos
     */
    public int getCantidadCursos() {
        return cantidadCursos;
    }

    /**
     * @return the valorPorCurso
     */
    public double getValorPorCurso() {
        return valorPorCurso;
    }

    /**
     * @param valorPorCurso the valorPorCurso to set
     */
    public void setValorPorCurso(double valorPorCurso) {
        this.valorPorCurso = valorPorCurso;
    }
    
    public void agregarCurso(){
        cantidadCursos++;
    }
    
    @Override
    public void mostrarConstancia(){
    System.out.println("monto pagado Q. "+(cantidadCursos*valorPorCurso));
    
    }

    @Override
    public String obtenerCarnet() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return carnet;
    }

    @Override
    public String obtenerCarrera() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return carrera;
    }

    @Override
    public boolean estaInscrito() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return inscrito;
    }

    @Override
    public void inscribir() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        inscrito = true;
    }
    
    
    
 
    
}
