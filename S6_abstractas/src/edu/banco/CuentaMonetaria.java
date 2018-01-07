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
public class CuentaMonetaria extends Cuenta {

    int cantChequeras;
    
    public CuentaMonetaria(long numero, String nombre, double tasaInteres, double saldoInicial){
    
        this.numero = numero;
        this.nombre = nombre;
        this.tasaInteres = tasaInteres;
        this.saldo = saldoInicial;
            
    }
    // Si el saldo es menor de 1000 se le cobran las chequeras solicitaas a 50 c/u y luego se calcula el interes a sumar al saldo.
    @Override
    public void cierreMensual() {
       
        if (saldo < 1000){
            saldo -= (cantChequeras*50);
        }       
        saldo = saldo + (saldo*tasaInteres);
        cantChequeras = 0;
        
        }
    public void solicitarChequera(){
            cantChequeras++;
    }
        
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
   
