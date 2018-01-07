package edu.open.java1.autos;

//CLASE QUE HEREDA DE VehiculoAbstract
public class Consignacion extends VehiculoAbstract {
    
    //CONSTRUCTOR DE CLASE CONSIGNACION
    public Consignacion(String nombre, int chasis, int modelo, String marca, double precio){
        this.nombre = nombre;
        this.setChasis(chasis);
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.setPrecio_total(this.precio + this.precio * 0.12);
    }
    
    //METODO PARA AGREGAR UN PORCENTAJE DEL 15% DE COMISION
    public void vender(){
        this.setPrecio_total(this.getPrecio_total() + this.getPrecio_total() * 0.15);
    }
}
