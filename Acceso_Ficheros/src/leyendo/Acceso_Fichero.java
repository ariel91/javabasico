/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leyendo;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ariel Chitay
 */



public class Acceso_Fichero {
    
    public static void main(String[] args){
    Leer_Fichero accediendo = new Leer_Fichero();
    accediendo.lee();
}}
    
    class Leer_Fichero{
    public void lee(){
        
        try{
        entrada = new FileReader("C:/Cosas/streams.txt");
        
            while (c != -1){
            c = entrada.read();
            char letra = (char)c;
            System.out.print(letra); 
        }     
           
            
        }catch(IOException e){
            System.out.print("No se ha encontrado el archivo");
        }finally{
            try {
                entrada.close();
            } catch (IOException ex) {
                Logger.getLogger(Leer_Fichero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    FileReader entrada;
    
}
