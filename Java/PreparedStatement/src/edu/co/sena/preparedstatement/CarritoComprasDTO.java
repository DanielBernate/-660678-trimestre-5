/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.preparedstatement;

/**
 *
 * @author ColsutecR
 */
public class CarritoComprasDTO {
    private int idCarritoDeCompras;
    private float subTotal;
    private float precioTotal;
    private float impuestos;

    public int getIdCarritoDeCompras() {
        return idCarritoDeCompras;
    }

    public void setIdCarritoDeCompras(int idCarritoDeCompras) {
        this.idCarritoDeCompras = idCarritoDeCompras;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public float getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(float impuestos) {
        this.impuestos = impuestos;
    }

    @Override
    public String toString() {
        return "CarritoComprasDTO{" + "idCarritoDeCompras=" + idCarritoDeCompras + ", subTotal=" + subTotal + ", precioTotal=" + precioTotal + ", impuestos=" + impuestos + '}';
    }
    
}
