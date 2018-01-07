/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.java1.streams;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maria
 */
public class TestStream {
    
    public static void main(String[] args){
        try {
//            LibroStream.escribirArchivo("miarchivo.txt",
//                    "Mi primer archivo de texto, escrito desde un "
//                            + "stream de java. ");
        //LibroStream.leerArchivo("miarchivo.txt");
        //Libro miLibro = new Libro(1, "La Odisea");
        //LibroStream.escribirLibro("miLibro.obj", miLibro);
        //miLibro = LibroStream.leerLibro("miLibro.obj");
        //miLibro.vender();
        //LibroStream.escribirLibro("miLibro.obj", miLibro);
        LibroStream.leerArchivoCSV("libros.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestStream.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
}
