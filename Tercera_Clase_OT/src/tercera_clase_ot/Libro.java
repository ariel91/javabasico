/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tercera_clase_ot;

import javax.swing.JOptionPane;

/**
 *
 * @author Ariel Chitay
 */
public class Tercera_Clase_OT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
    }
    
}

public class Ternario
{
        public static void main (String[] args){
        int x = 5;
        x = (x==100)?0:5;//if ternario
        System.out.println(x);
        }
}

                public class Libro{
                // atributos = variables
                    String estado;
                    double precio;
                    String editorial;
                    String codigo;
                    String nombre;
                    String seccion;
                    int numPaginas;
                    int edicion;// anio
                    String autor;

                    // CONSTRUCTOR
                    public Libro(String codigo, String nombre, String autor, double precio, String seccion, String estado){
                    this.codigo = codigo; // hace rferencia a la clase, para darle lo que esta dentro del metodo.
                    this.nombre = nombre;
                    this.autor = autor;
                    this.precio = precio;
                    this.seccion = seccion;
                    this.estado = estado;                    
                    
                    }
                    
                    
                //Metodos o comprotamiento     
                // Reserva un libro, si esta disponible y se devuelve si se pudo reservar true en caso contrario false.
                    public boolean reservarlo(){
                    if (estado.equals("Disponible")){
                    estado = "reservado";
                    return true;  
                    } else {
                    return false;
                    }}

                    public static void main (String[] args)
                    {
                        Libro miLibro;
                        miLibro = new Libro("123","50 sombras de gray","Gray", 1.00, "Seccion A1","Disponible");
                        boolean sePudo = miLibro.reservarlo();
                        if (sePudo== true){
                        JOptionPane.showMessageDialog(null, "Ha reservado el libro");
                        }
                        sePudo = miLibro.reservarlo();
                        System.out.println(sePudo);
                        
                    }

                
public void consultarUbicacion(){}
public void leerlo(){}
public void aplicarMulta(){}
public void archivar(){}
    
    
}
