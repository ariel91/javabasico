/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.streams;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Eandrade
 */
public class TestStreams {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException {
        Streams miStream = new Streams();
        int p;
       try{
        do {
            String o = JOptionPane.showInputDialog(null, "Ingrese el numero o nombre de la accion que desa realizar" + "\n" + "\n 1.Pares" + "\n 2.Cancion");
            if (o.equalsIgnoreCase("Pares") || o.equalsIgnoreCase("1")) {
                miStream.par();
            } else if (o.equalsIgnoreCase("Cancion") || o.equalsIgnoreCase("2")) {
                miStream.canciones();
            } else if (o.equals(JOptionPane.CANCEL_OPTION) || o.equals(JOptionPane.CLOSED_OPTION)) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "El argumento que ha ingresado no corresponde a ninguna opcion");
            }
            p = JOptionPane.showConfirmDialog(null, "Desea realizar otra accion");
        } while (p == JOptionPane.OK_OPTION);
       }catch(NullPointerException ex){
           
       }
    }
}
