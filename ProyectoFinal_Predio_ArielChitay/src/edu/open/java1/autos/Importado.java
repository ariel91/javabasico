package edu.open.java1.autos;


//CLASE QUE HEREDA DE VehiculoAbstract
public class Importado extends VehiculoAbstract {
    
    //ATRIBUTOS POR SER ASEGURABLES
    private int numero_seguro;
    private double valor_deducible;
    private int tiempo_asegurado;
    
    //CONSTRUCTOR DE LA CLASE IMPORTADO
    public Importado(String nombre, int chasis, int modelo, String marca, double precio, double impuesto){
        this.nombre = nombre;
        this.setChasis(chasis);
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.setPrecio_total(impuesto + this.precio + this.precio * 0.12);
    }
    
    //METODOS PARA OBTENER LOS DATOS POR SER ASEGURABLES
    public int getNumero_seguro(){
        return numero_seguro;
    }
    
    public double getValor_deducible(){
        return valor_deducible;
    }
    
    public int getTiempo_asegurado(){
        return tiempo_asegurado;
    }
    
    //METODOS PARA MODIFICAR LOS DATOS POR SER ASEGURABLES
    public void setNumero_seguro(int num){
        this.numero_seguro = num;
    }
    
    public void setValor_deducible(double valor){
        this.valor_deducible = valor;
    }
    
    public void setTiempo_asegurado(int tiempo){
        this.tiempo_asegurado = tiempo;
    }
}
