/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.procesos;

/**
 *
 * @author maria
 */
public class TestEquipo {
    
    public static void main(String[] args){
        Equipo barcelona = new Equipo("Barcelona");
        Equipo milan = new Equipo("Milan");
        Equipo manchester = new Equipo("Manchester City");
        barcelona.setPriority(Thread.MAX_PRIORITY);
        barcelona.start();
        milan.start();
        manchester.start();
    }
    
}
