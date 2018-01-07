/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.clases;

/**
 *
 * @author marco
 */
public class Empleado {
    private int codigo;
    private String nombre;
    private String apellido;
    private String nit;
    protected double salario;
    private int horasTabajadas;
    
    //constructor 
   //gets y sets
    //to string

    public Empleado(int codigo, String nombre, String apellido, String nit, double salario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nit = nit;
        this.salario = salario;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the horasTabajadas
     */
    public int getHorasTabajadas() {
        return horasTabajadas;
    }

    /**
     * @param horasTabajadas the horasTabajadas to set
     */
    public void setHorasTabajadas(int horasTabajadas) {
        this.horasTabajadas = horasTabajadas;
    }

    @Override
    public String toString() {
        return "Empleado{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", nit=" + nit + ", salario=" + salario + ", horasTabajadas=" + horasTabajadas + '}';
    }
        public void mostrarConstancia(){
            System.out.println("Monton pagado: Q" + salario+" por "+ horasTabajadas+ " horas. ");
        }
}
