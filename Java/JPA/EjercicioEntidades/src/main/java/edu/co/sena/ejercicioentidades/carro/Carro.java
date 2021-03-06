/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicioentidades.carro;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ColsutecR
 */
@Entity
@Table(name = "carro",schema = "ejerciciocarr")
@XmlRootElement
public class Carro implements Serializable{
  @Id
    @Basic(optional = false)
    @Column(name = "placa")
    private String id;
    
    @Basic(optional = false)
    @Column(name = "modelo")
    private String modelo;
    
    @Basic(optional = false)
    @Column(name = "marca")
    private String marca;  
    
     @Basic(optional = false)
    @Column(name = "color")
    private String color;
    
    @Basic(optional = false)
    @Column(name = "puesto")
    private int puesto;  

    public Carro() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }
    
    
    
}
