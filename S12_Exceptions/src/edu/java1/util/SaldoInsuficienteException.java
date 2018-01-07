/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.java1.util;

/**
 *
 * @author maria
 */
public class SaldoInsuficienteException extends Exception {
    double saldo;
    
    public SaldoInsuficienteException(double saldo){
        this.saldo = saldo;
    }
    
    @Override
    public String getMessage(){
        return "Valor "+saldo+" es un saldo insuficiente";
    }
    
}
