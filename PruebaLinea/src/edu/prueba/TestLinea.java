/*
En un sistema Java que gestiona los usuarios de un servicio telefónico se utiliza una clase Linea,
el cual lleva el control de la conexion y acciones realizadas por la linea teléfonica la cual está asociada
a un usuario, almacenando como información de la linea, el DPI (String), el nombre de la persona o
usuario, ademas de contabilizar la cantidad de segundos acumulador en la cuenta.
Para ello cuenta con los siguientes métodos:
1. Constructor con la información básica de la Linea, es decir, DPI y nombre.
2. conectar(int segundos), el cual contabiliza los segundo de conexion, agregandolo a la
cantidad de segundos totales, requiere que la cantidad de segundos sea mayor a cero,
devuelve true si pudo agregar los segundos y false en caso contrario.
3. CalcularImporte(), el cual devuelve la cantidad a pagar, el importe a pagar, es calculado
por los minutos consumidos de conexion por la tarifa la cual es de Q0.50 por segundo.
4. Reiniciar(), pone en cero la cantidad de segundos de la linea.

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.prueba;

import java.util.Scanner;

/**
 *
 * @author Ariel Chitay
 */
public class TestLinea {
    
    public static void main(String[] args){
        Linea li = new Linea();
        System.out.println("Ingrese nombre");
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.nextLine();
        System.out.println("Ingrese dpi");
        Scanner entrada2 = new Scanner(System.in);
        String dpi = entrada.nextLine();
        li.variables(nombre, dpi);
        System.out.println("Cuantos segundos quiere navegar?");
        Scanner entrada3 = new Scanner(System.in);
        double tiempo = Double.parseDouble(entrada3.nextLine());
        System.out.println(li.conectar(tiempo));
        System.out.println("El total de su factura es de:" + li.CalcularImporte(tiempo)+ "Quetzales");
        System.out.println("desea reiniciar el sistema?");
        Scanner entrada4 = new Scanner(System.in);
        String reinicio = entrada4.nextLine();
        if (reinicio.equals("si")){
            System.out.println("Variables limpias");
             li.reiniciar();
        }
       
       }
}
