/*
 * To change this license header, choose License Headers in Project Properties. 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.procesos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maria
 */
// 1. heredar de Thread
public class Equipo extends Thread {
    String nombre;
    
    public Equipo(String nombre){
        super(nombre);
        this.nombre = nombre;
    }
    
    // 2. sobreescribir el run
    @Override
    public void run(){
        System.out.println("Iniciando mi equipo: "+nombre);
        for (int i=0; i<10; i++){
            long milis = (long) (Math.random()*1000);
            try {
                Thread.sleep(milis);
            } catch (InterruptedException ex) {
                Logger.getLogger(Equipo.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Equipo va por "+i+" "+nombre);
        }
        System.out.println("EL EQUIPO HA TERMINADO "+nombre);
    }
    
}
