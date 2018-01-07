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
public class Streams {

    public void par() throws IOException {
        String num;
        double num1 = 0;
        String nombre = "pares.txt";
        int comando;
        do {
            try {
                num = JOptionPane.showInputDialog(null, "Ingrese el numero limite");
                num1 = Double.parseDouble(num);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "El dato que ingreso no es un numero.");
            }
            File archivo = new File(nombre);
            archivo.createNewFile();
            FileOutputStream fos = new FileOutputStream(archivo);
            PrintStream proc = new PrintStream(fos);
            for (int i = 0; i <= num1; i += 2) {
                proc.print(" " + i + ",");
            }
            proc.close();
            comando = JOptionPane.showConfirmDialog(null, "Desea imprimir otro numero?");
        } while (comando == JOptionPane.OK_OPTION);
    }

    public void canciones() throws IOException {
        String nombre = "canciones.txt";
        int i;
        File archivo = new File(nombre);
        archivo.createNewFile();
        FileOutputStream fos = new FileOutputStream(archivo);
        PrintStream proc = new PrintStream(fos);
        do {
            String nombreC = JOptionPane.showInputDialog(null, "Ingrese el nombre");
            String nombreA = JOptionPane.showInputDialog(null, "Ingrese el nombre del autor");
            String album = JOptionPane.showInputDialog(null, "Ingrese el nombre del album");
            String genero = JOptionPane.showInputDialog(null, "Ingrese el genero");
            String duracion = JOptionPane.showInputDialog(null, "Ingrese la duracion");
            proc.println(nombreC+" - "+nombreA+" - "+album+" - "+genero+" - "+duracion);
            i = JOptionPane.showConfirmDialog(null, "Desea ingresar otra cancion?");
        } while (i == JOptionPane.OK_OPTION);
        {
            proc.close();
        }
    }
}
