package edu.open.java1.autos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public abstract class VehiculoAbstract {
    //INFORMACION DEL AUTOMOVIL (Atributos)
    String nombre, marca;
    private int chasis;
    int modelo;
    double precio;
    private double precio_total;
    private double reserva;
    private String estado;  //valores: apartado, vendido
    private int codigo_cliente = -1;
    
    
    //METODOS REQUERIDOS
    public void CambiarIva(double iva){
        this.setPrecio_total(this.precio + this.precio * iva);
    }
    
    public String mostrarAutomovil(){
        String automovil = this.nombre + " : " + this.getPrecio_total();
        return automovil;
    }
    
    public void CrearFicha(){
        FileOutputStream ficha = null;
        File archivo;
        
        try{
          
            archivo = new File("Colocar direccion del archivo" + this.getChasis() + ".txt");
           
            ficha = new FileOutputStream(archivo);
            
            if(!archivo.exists()){
                archivo.createNewFile();
            }
            
            String informacion = "nombre: " + this.nombre + "\nmarca: " + this.marca + "\nchasis: " + this.getChasis() + "\nmodelo: " + this.modelo + "\nprecio: " + this.precio + "\nprecio total: " + this.getPrecio_total();
            ficha.write(informacion.getBytes());
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    
    //GETTER Y SETTER PARA ENCAPSULAR LA INFORMACION DEL AUTOMOVIL
    public int getChasis() {
        return chasis;
    }

    public void setChasis(int chasis) {
        this.chasis = chasis;
    }

    public int getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(int codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getReserva() {
        return reserva;
    }

    public void setReserva(double reserva) {
        this.reserva = reserva;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }
}
