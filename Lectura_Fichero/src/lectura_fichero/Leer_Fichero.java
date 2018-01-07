/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura_fichero;

/**
 *
 * @author Ariel Chitay
 */
class Leer_Fichero {
 

public void lee(){
	try{
			FileReader entrada = new FileReader("Direccion/doc.txt");
			int c = entrada.read();
			while (c!=-1){
				c = entrada.read();
				char letra =(char)c;
				System.out.print(letra);			
			}
			entrada.close();
	} catch (IOException e) {
	//Todo Auto-generated catch block
	System.out.println("No se ha encontrado el archivo");
	}
}
}
    
    
    
    
    
}
