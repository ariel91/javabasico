/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1_opentraining;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ariel Chitay
 */
public class Formulas {
    
    public static void main(String[] args)
    {
        
        String dato= JOptionPane.showInputDialog("Introducir valor");
        double conversion1 = Double.parseDouble(dato);
        double f = 9/5*conversion1 + 32;
        System.out.println("Dato en Farenheit:" + " " + f);
        
        String sx = JOptionPane.showInputDialog("Ingrese valor en x:");
        String sy = JOptionPane.showInputDialog("Ingrese valor en y:");
        double x = Double.parseDouble(sx);
        double y = Double.parseDouble(sy);
        double funcion = ((1+ ((x*x)/y))/((x*x*x)/(1+y)));
        System.out.println("valor de f(x,y)" + " " + funcion);
        
        
        String shoras = JOptionPane.showInputDialog("Ingrese cantidad de horas:");
        int vhoras = Integer.parseInt(shoras);
        int semanas = vhoras /168;
        int vdias = vhoras % 168; 
        int dias = vdias / 24;
        int horas = vdias % 24;
        System.out.println("Cantidad de semanas" + " " + semanas);
        System.out.println("Cantidad de dias" + " " + dias);
        System.out.println("Cantidad de horas" + " " + horas);
             
    }
    
   
    
    
}
