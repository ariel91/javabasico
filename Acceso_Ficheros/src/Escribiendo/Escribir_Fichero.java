/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escribiendo;

//import java.io.FileWriter;
//import java.io.IOException;
import java.io.*;

/**
 *
 * @author Ariel Chitay
 */
public class Escribir_Fichero {
    public static void main (String[] args){
    Escribiendo accede_es = new Escribiendo();
    accede_es.escribir();
    }
}

class Escribiendo{

	public void escribir(){
		String frase = "Esto es una prueba de escritura";
		
	
                    try {
                        FileWriter escritura = new FileWriter("C:/stream.txt",true);
                        for(int i = 0; i<frase.length();i++){
                            escritura.write(frase.charAt(i));
                        }
                        escritura.close();
                    }
                    catch (IOException e){
			e.printStackTrace();
                        }
	}
}
