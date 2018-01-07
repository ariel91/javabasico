package edu.java1.streams;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria
 */
public class LibroStream {
    
    
    //1. Crear un archivo (File)
    // 2. Escribir texto (procesador)
    public static void escribirArchivo(String nombre, String texto) 
            throws IOException{
        File archivo = new File(nombre);
        // crear el archivo
        if (archivo.exists() == false){
            archivo.createNewFile();
        }
        // Stream para escribir archivo
        FileOutputStream fos = new FileOutputStream(archivo);
        
        // Crear el procesador
        PrintStream proc = new PrintStream(fos);
        // escribir con el procesador
        proc.print(texto);
        // cerrarlo
        proc.close();
        
    }
    
    public static void leerArchivo(String nombre) throws FileNotFoundException, IOException{
        // crear el acceso al archivo
        File archivo = new File(nombre);
        // Fuente de datos 
        FileInputStream fis = new FileInputStream(archivo);
        // procesador
        DataInputStream reader = new DataInputStream(fis);
        //leer
        String linea;
        do{
            linea = reader.readLine();
            System.out.println("** "+linea);
                    
        }while (linea != null);
        
        // cerrar
        reader.close();
        
        
    }
    
    /**Escribir un objeto*/
    public static void escribirLibro(String nombre, Libro miLibro) 
            throws FileNotFoundException, IOException{
        // destino es un archivo
        File archivo = new File(nombre);
        FileOutputStream fos = new FileOutputStream(archivo);
        // procesador es un objeto
        ObjectOutputStream proc = new ObjectOutputStream(fos);
        // escribir el objeto
        proc.writeObject(miLibro);
        // cerrar
        proc.close();
                
    }
    
    
    /**Leer un objeto*/
    public static Libro leerLibro(String nombre) throws FileNotFoundException, IOException, 
            ClassNotFoundException{
        // origen es un archivo
        File archivo = new File(nombre);
        FileInputStream fis = new FileInputStream(archivo);
        // procesador es un objeto
        ObjectInputStream proc = new ObjectInputStream(fis);
        // leer el objeto
        Object objeto = proc.readObject();
        // mostrarlo --> casteo
        Libro miLibro = (Libro)objeto;
        System.out.println(miLibro);
        proc.close();
        return miLibro;
    }
    
    public static void leerArchivoCSV(String nombre) throws FileNotFoundException, IOException{
        // origen archivo de texto
        File archivo = new File(nombre);
        FileInputStream fis = new FileInputStream(archivo);
        // procesador de texto
        DataInputStream proc = new DataInputStream(fis);
        String linea;
        
        do{
            linea = proc.readLine();
            // separarla por tokens
            StringTokenizer tokens;
            if (linea != null){
                // convierte en tokens cada uno de los elementos separados por ;
                tokens = new StringTokenizer(linea, ";");
                while (tokens.hasMoreTokens() == true){
                    System.out.println(tokens.nextToken());
                }
                System.out.println("-------");
            }
            
        }while(linea != null);
        
    }
    
}

