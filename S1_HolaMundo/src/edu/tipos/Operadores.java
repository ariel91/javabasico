/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tipos;

/**
 *
 * @author Ariel Chitay
 */
public class Operadores {
        public static void main(String[] args)
        {
            int x=10;
            int y = 2;
            double resultado = x/y;
            System.out.println(resultado);
            int w = 1;
            resultado = w/y; // si los dos operandos son int, el resultado es int
            System.out.println(resultado);
            double z=1;
            resultado = z/y;// debe tener al menos una variable tipo decimal
            System.out.println(resultado);
            
                //10/2
                int result2 = x/y++;
                System.out.println(result2);
                System.out.println(y);
                
                // 10/4
                result2 = x/++y;
                System.out.println(result2);
                System.out.println(y);
                
                int valor = 13;
                System.out.println(valor%2);
        }
}
