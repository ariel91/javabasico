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
public class Planilla {
    //declaramos empleados de planilla
    Empleado[] empleados;
    int actual = 0;
    public Planilla(int cant){
        //2. inicializamos el arreglo de empleados
    empleados = new Empleado[cant];
    
    }
    
    public boolean agregarEmpleado(Empleado emp){
        if(actual<empleados.length-1){
        empleados[actual] = emp;
        actual++;
            System.out.println("Actual:" + actual);
            System.out.println(toString());
            return true;
        }else{
        return false;
        }
        
    }
    
    public String toString(){
        String mensaje= " ";
        for(int i = 0; i < empleados.length; i++){
            if(empleados[i] != null){
                mensaje +=empleados[i]+",";
                            }else{
            mensaje += "null";
            }
                    }
        return mensaje;
    }
    
    public Empleado obtenerEmpleado(int codigo){
        for (int i=0; i<empleados.length; i++){
            if (empleados[i] != null && empleados[i].getCodigo()==codigo){
            return empleados[i];
            }
        }
        return null;
    }
    
    
    
}
