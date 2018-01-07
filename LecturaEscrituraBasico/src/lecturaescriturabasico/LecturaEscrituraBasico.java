/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaescriturabasico;
import java.io.*;

/**
 *
 * @author Ariel Chitay
 */
public class LecturaEscrituraBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String MensajeAEscribir = "Esta frase tiene que escribirse y despues leerse, hola hola";
    String MensajeLeido = "";
    // Se le coloca el nombre al ficher y se escribe el mensaje dentro del mismo
        try{
            FileWriter fichero = new FileWriter("CursoBasicoJava.txt");
            fichero.write(MensajeAEscribir);
            fichero.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    //Se busca el fichero, su ubicacion y se lee lo que hay dentro de el. 
        try{
            FileReader lector = new FileReader("CursoBasicoJava.txt");
            BufferedReader BR = new BufferedReader(lector);
            MensajeLeido = BR.readLine();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        System.out.println("El menaje guardado en el texto es: \n" + MensajeLeido);
        }
    
}
