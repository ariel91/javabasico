/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.clases;

/**aaa
 *
 * @author Ariel Chitay
 */
public class Comercial extends Empleado{
    
    private double comision;
    private double ventasMes;
    
    public Comercial (int codigo, String nombre, String apellido, String nit, double comision){
        super(codigo,nombre,apellido,nit,0);//llamando al padre
        this.comision = comision;
            }

    /**
     * @return the comision
     */
    public double getComision() {
        return comision;
    }

    /**
     * @param comision the comision to set
     */
    public void setComision(double comision) {
        this.comision = comision;
    }

    /**
     * @return the ventasMes
     */
    public double getVentasMes() {
        return ventasMes;
    }
    
    public void inicioMes(){
        ventasMes= 0 ;
    }
    
    public void vender(double monto){
    ventasMes += monto*comision;
}
    
    @Override
    public void mostrarConstancia(){
    System.out.println("Ventas pagadas: Q" + ventasMes);
    }// quitar esto para probar
    
    
}
