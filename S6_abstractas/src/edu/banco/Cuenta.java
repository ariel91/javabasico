/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.banco;

/**
 *
 * @author Ariel Chitay
 */
public abstract class Cuenta {
    protected long numero;
    protected String nombre;
    protected double saldo;
    protected double tasaInteres;

    
    /**
     * @return the numero
     */
    public long getNumero() {
        return numero;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @return the tasaInteres
     */
    public double getTasaInteres() {
        return tasaInteres;
    }

    /**
     * @param tasaInteres the tasaInteres to set
     */
    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
    
    public void depositar(double monto){
        saldo += monto;
            }
    
    public void retirar(double monto){
    if (saldo >= monto){
        saldo -=monto; // lo puedo debitar
        }
    }

    @Override // este insert code es con clic derecho e insert  code, para que no tire la direccion
    public String toString() {
        return "Cuenta{" + "numero=" + numero + ", nombre=" + nombre + ", saldo=" + saldo + ", tasaInteres=" + tasaInteres + '}';
    }
    
    public abstract void cierreMensual(); // aqui aplicamos el abstract, debido a que 
    
    
}
