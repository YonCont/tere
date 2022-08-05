/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuentabancaria;

/**
 *
 * @author StudioOne
 */
public class Cuenta {
   //atributos
    private String titular;
    private double cantidad;
    
    // constructor

    /**
     *
     * @param titular
     */

    public Cuenta(String titular) {
        this.titular = titular;
    }

    //metodo

    /**
     *
     * @param titular
     * @param cantidad
     */
    
    public Cuenta(String titular, double cantidad) {

        if (cantidad < 0) {

            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;

        }
    }

    /**
     *
     * @return
     */
    public String getTitular() {
        return titular;
    }

    /**
     *
     * @param titular
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     *
     * @return
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     *
     * @param cantidad
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {

            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }

    }
// metodo por defecto que imprime los datos de la clase
    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
    
    
}