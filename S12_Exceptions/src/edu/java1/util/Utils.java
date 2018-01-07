/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.java1.util;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maria
 */
public class Utils {
    
    
    /**Recibe un valor en string y lo devuelve convertido a in
     * @param valor string a convertir
     * @return entero convertido*/
    public static int convertirAInt(String valor){
        int valorInt;
        try{
            valorInt = Integer.parseInt(valor);
        }catch (NumberFormatException nfe){
            System.out.println("Valor no es un entero "+nfe.getMessage());
            return 0;
        }
        return valorInt;
    }
    
    
    public static void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try {
            archivo.createNewFile();
            System.out.println("Archivo creado satisfactoriamente");
        } catch (IOException ex) {
            //ex.printStackTrace();
            System.out.println("No se pudo crear el archivo: "+nombre+ " debido a: "+ex.getMessage());
        }
        
    }
    
    
    // throws
    public static double convertirADouble(String valor) throws NumberFormatException{
        double valorDouble = Double.parseDouble(valor);
        return valorDouble;
    }
    
    
    public static void crearArchivo2(String nombre) throws IOException{
        File archivo = new File(nombre);
        archivo.createNewFile();
    }
    
    public static double obtenerNuevoSaldo(double saldo, double valor) 
            throws SaldoInsuficienteException{
        
        if (saldo<valor){
            throw new SaldoInsuficienteException(saldo);
        }
       
        return (saldo - valor);
        
    }
    
}
