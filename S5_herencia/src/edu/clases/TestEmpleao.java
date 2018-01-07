/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.clases;

/**
 *
 * @author marco
 */
public class TestEmpleao {
    
    public static void imprimirConstancias(Empleado emp){
    System.out.println("Imprimiento constancia" + emp.getNit() + "----" );
    emp.mostrarConstancia();
    
    }
    
    
    public static void main(String [] args){
        Empleado e1= new Empleado(1, "Maria", "Marquez", "222222-1", 50000);
        e1.setHorasTabajadas(40);
        
        
        EmpleadoPorProducto e2= new EmpleadoPorProducto(2, "Marcos", "Santos", "999922-1");
        e2.agregarProducto(500);
        e2.agregarProducto(100);
        e1.mostrarConstancia();
        e2.mostrarConstancia();
        
        imprimirConstancias(e1);
        imprimirConstancias(e2);
        
        Comercial vendedor = new Comercial(33, "Karen", "Castro", "7654-5", 0.10);
        vendedor.vender(10000);
        vendedor.vender(50000);
        System.out.println("Monto Vendido"+ vendedor.getVentasMes());
        imprimirConstancias(vendedor);
        // ver comercial y analizar
        
    }
}
