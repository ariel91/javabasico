/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.java1.util;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author maria
 */
public class TestUtils {
    
    public static void main(String[] args){
        int valor = Utils.convertirAInt("100");
        System.out.println(valor);
        valor = Utils.convertirAInt("xxxx");
        System.out.println(valor);
        
        Utils.crearArchivo("hola.txt");
        
        // 
        String numero = JOptionPane.showInputDialog(null, "Ingrese un valor decimal");
        try{
            Utils.convertirADouble(numero);
            String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre del archivo");
            Utils.crearArchivo2(nombre);
            JOptionPane.showMessageDialog(null, "Archivo creado ");
            
            Utils.obtenerNuevoSaldo(500, 600);
            
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null,  "Valor invalido para convertir", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo crear el archivo : "+ex.getMessage());
            
        } catch (SaldoInsuficienteException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            
        } 
        
        
    }
}
