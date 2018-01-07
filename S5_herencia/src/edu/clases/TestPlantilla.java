/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.clases;

/**
 *
 * @author Ariel Chitay
 */
public class TestPlantilla {
    
    public static void main(String[] args){
    Planilla miPlanilla= new Planilla(10);
    Empleado asistente = new Empleado(1, "lucia","lopez","12123-1",3000.00);
    Comercial vendedor = new Comercial (2,"Carlos","Colinders","899912919912-1",0.10);
    vendedor.vender(40000.00);
    
    EmpleadoPorProducto consultor = new EmpleadoPorProducto(3,"Jose", "Juarez", "56565-k");
    consultor.agregarProducto(3500.00);
    
    Auxiliar auxMate = new Auxiliar (4, "Mario", "Morales", "12123-1","2010120", Estudiante.DERECHO);
    
    
    miPlanilla.agregarEmpleado(asistente);
    miPlanilla.agregarEmpleado(vendedor);
    miPlanilla.agregarEmpleado(consultor);
    miPlanilla.agregarEmpleado(auxMate);
    
        System.out.println(miPlanilla.obtenerEmpleado(2));
        System.out.println(miPlanilla.obtenerEmpleado(100));// esto es para buscar     
    }
    
}
