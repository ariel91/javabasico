/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.clases;

/**
 *
 * @author maria
 */
public class Computadora {
    private String codigo;
    private String modelo;
    private String marca;
    private String caracteristicas;
    private double precio, descuento;
    private int estado;
    private boolean tieneGarantia;
    private int tiempoGarantia;
    
    public static final int DISPONIBLE = 1;
    public static final int AGOTADA = 2;
    public static final int VENDIDA = 3;
    public static final int DANIADA = 4;
    public static final int EN_BODEGA = 2;
    

    public Computadora(String codigo, String modelo, String marca, String caracteristicas, double precio) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.marca = marca;
        this.caracteristicas = caracteristicas;
        this.precio = precio;
        this.estado = DISPONIBLE;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public double getPrecio() {
        return precio;
    }

    public int getEstado() {
        return estado;
    }

    public boolean isTieneGarantia() {
        return tieneGarantia;
    }

    public int getTiempoGarantia() {
        return tiempoGarantia;
    }
    
    /**Permite vender la computadora, dejandola en estado VENDIDO, si no está disponible devuelve false
     */
    public boolean vender(){
        if (estado != DISPONIBLE){
            return false;
        }else{
            estado = VENDIDA;
            return true;
        }
    }
    
    /**al enviarle un codigo de parametro, revisa que sea el codigo de esta computadora y de ser asi muestra la informacion, en caso contrario muestra un mensaje
     de error*/
    public void consultar(String codigo){
        if (this.codigo.equals(codigo)){
            mostrar();
        }else{
            System.out.println("No corresponde al codigo");
        }
    }
    
    /**Muestra la informacion de la computadora, reutilizando el método toString() de la clase computadora*/
    public void mostrar(){
        System.out.println(this);
    }
    
    /**permite aplicar el valorDescuento al precio de la computadora*/
    public void promocionar(double valorDescuento){
        this.descuento = valorDescuento;
        this.precio = precio - descuento;
    }
    
    /**Indica que la computadora tendrá garantia, y el tiempo de garantia que tendra.*/
    public void aplicarGarantia(int tiempo){
        this.tiempoGarantia = tiempo;
        this.tieneGarantia = true;
        
    }
    
    /**Cuando la computadora la devuelven por garantia, se valida que el tiempo en el cual se envia todavia sea el tiempo que la garantia soporta
     devolviendo true si se puede aplicar y false si no se puede aplicar*/
    public boolean validarGarantia(int tiempo){
        if (tiempoGarantia >=tiempo){
            return true;
        }else{
            return false;
        }
    }
    
    /**Devuelve la computadora, siempre que este en estado vendido, si la computadora no ha sido vendida, devuelve false, en estado contrario devuelve true*/
    public boolean devolver(){
        if (estado == VENDIDA){
            estado = DANIADA;
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString() {
        return "Computadora{" + "codigo=" + codigo + ", modelo=" + modelo + ", marca=" + marca + ", caracteristicas=" + caracteristicas + ", precio=" + precio + ", estado=" + estado + ", tieneGarantia=" + tieneGarantia + ", tiempoGarantia=" + tiempoGarantia + '}';
    }
    
    public static void main(String[] args){
        Computadora miCompu = new Computadora("A100", "5140", "Lenovo", "8G RAM Intel Core i5-4430", 3250.00);
        miCompu.aplicarGarantia(3); // años
        miCompu.consultar("A101");
        miCompu.consultar("A100");
        miCompu.vender();
        System.out.println("Todavia aplica mi garantia?"+miCompu.validarGarantia(1));
        miCompu.devolver();
        miCompu.mostrar();
        
    }
}