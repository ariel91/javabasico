/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condiciones_promedio;

/**
 *
 * @author Ariel Chitay
 */
public class Condiciones_Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int m = 6;
    int bio = 10;
    int qui = 6;
    int prom = 0 ;
        prom = (m + bio + qui)/3;
        if (prom >=6)
        {
            System.out.println("Usted aprobo con :" + prom);
        }
                System.out.print("Ingrese su nombre : ");
                String Nombre = tecla.readLine();
                System.out.print("Ingrese su edad : ");
                int num = Integer.parseInt(tecla.readLine( ));          
    }
    
}
