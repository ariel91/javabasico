/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.clases;

/**
 *Empleado por Producto gereda de empleado
 * @author marco}
 //1. tiene que tener por lo menos lo mismo que el constructor del padre.
 */
public class EmpleadoPorProducto extends Empleado {
  
    int cantProductos;
    
    public EmpleadoPorProducto(int codigo, String nombre, String apellido, String nit) {
        super(codigo, nombre, apellido, nit, 0);
        //sirve para llamar al construtor de la clase padre
    }
  
            public void agregarProducto(double valor){
                
                cantProductos++;
                salario = salario+valor;
            }
    @Override //metodo sobre escrito de la clase padre
    public void mostrarConstancia(){
        System.out.println("Monto pagado Q. "+ salario + " por " + cantProductos + " realizados ");
    }
}
