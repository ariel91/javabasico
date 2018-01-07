/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Scanner;

/**
 *
 * @author Ariel Chitay
 */
public class Metodos {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre2 = null;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa tu nombre:");
        String ingreso = entrada.nextLine();
        MetodoMensaje(ingreso);  
        //MetodoRetorno(); si dejo esto generara un error de logica.
        System.out.println("Este es metodo con retorno " + MetodoRetorno() );
    }
    
    public static void MetodoMensaje(String ingreso){
    System.out.println("Este es un metodo con parametro, fuera del main " + ingreso );
    }
    
    public static String MetodoRetorno(){
    Scanner entrada2 = new Scanner(System.in);
    System.out.println("Ingrese su nombre otravez:" );
    String nombre2 = entrada2.nextLine();
    return nombre2;
    }
    
     
    
    }
    
