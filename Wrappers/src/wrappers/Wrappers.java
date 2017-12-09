/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrappers;

import java.util.ArrayList;

/**
 *
 * @author Ariel Chitay
 */
public class Wrappers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ejemplo de datos primitivos
        int i =15;
        double pi=3.141592;
        char a=34;
        
        System.out.println("integer : " + i);
        System.out.println("double : " + pi);
        System.out.println("char : " + a);
        
        //para que algo se un objeto debe tener java.lang.Object como base class.
        //es decir, super clase
        Integer iWrapper = i;
        Integer jWrapper = 255;
        Double piWrapper = pi;
        
//los objetos se pueden usar como cual otro, por ejemplo, como para de una coleccion de Java
        ArrayList<Integer>  intArray=  new ArrayList();
        intArray.add(iWrapper);
        intArray.add(jWrapper);
        
        
for(Integer k :intArray){
       
     System.out.println(k.toString());
 
       }
        
        
        System.out.println("i Integer : " + iWrapper.toString());
        //tambien provee metodos estaticos
        System.out.println("integer : " + Integer.toHexString(i));
        System.out.println("j Integer : " + jWrapper.toString());
         System.out.println("pi Double : " + piWrapper.toString());
        
    }
    
}
