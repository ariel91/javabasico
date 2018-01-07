/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream_propiedadesficheros;

/**
 *
 * @author Ariel Chitay
 */
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;


 

 class Stream_PropiedadesFicheros {

    /**
     * @param args the command line arguments
     *En este ejemplo se presentan algunos metodos que la clase FIle
     * nos proporciona para conocer los detalles de un fichero.
     */
    
        static void imprimir(String s){
        System.out.println(s);
        }
    
    
    public static void main(String[] args) {
        //abrimos el documento txt de la carpeta cosas
        File fich = new File("C://Cosas/streams.txt" );
        imprimir("Nombre del fichero:" + fich.getName());
        imprimir("Es de escritura? " + fich.canWrite());
        imprimir("Tamaño del fichero:" + fich.length() + "Bytes");
        try{
        imprimir("URL del fichero:" + fich.toURL());
        }
        catch(MalformedURLException urle){imprimir(urle.getMessage());
        }
    }
    
}
