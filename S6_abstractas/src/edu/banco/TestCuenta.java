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
public class TestCuenta {
    public static  void main (String[] args){
    //Cuenta c = new Cuenta(); aca se aplica la herencia y le dice que no se puede usar.
        
        CuentaMonetaria miCuenta = new CuentaMonetaria(123456, "Claudia Gomez",0.01,500);
    miCuenta.depositar(400);
    System.out.println(miCuenta);
    miCuenta.retirar(20000);
        System.out.println(miCuenta);
        miCuenta.solicitarChequera();
        miCuenta.cierreMensual();
        System.out.println(miCuenta);
        miCuenta.cierreMensual();
        System.out.println(miCuenta);
            }
    
}
