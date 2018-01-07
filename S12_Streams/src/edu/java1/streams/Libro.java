/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.java1.streams;

import java.io.Serializable;

/**
 *
 * @author maria
 */
public class Libro implements Serializable{
    protected int codigo;
    protected String titulo;
    protected boolean vendido;

    public Libro(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        vendido = false;
    }

    public void vender(){
        if (vendido == false){
            vendido = true;
        }
    }

    @Override
    public String toString() {
        return "Libro{" + "codigo=" + codigo + ", titulo=" + titulo + ", vendido=" + vendido + '}';
    }
    
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the vendido
     */
    public boolean isVendido() {
        return vendido;
    }
    
    
    
    
    
}
