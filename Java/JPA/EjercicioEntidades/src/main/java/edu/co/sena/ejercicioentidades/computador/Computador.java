/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicioentidades.computador;

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
@Table(name = "computador", schema = "ejerciciopc")
@XmlRootElement
public class Computador implements Serializable{
    @Id
    @Basic(optional = false)
    @Column(name = "referencia")
    private String referencia;
    
    @Basic(optional = false)
    @Column(name = "procesador")
    private String procesador;
    
    @Basic(optional = false)
    @Column(name = "marca")
    private String marca;  
    
     @Basic(optional = false)
    @Column(name = "color")
    private String color;
    
    @Basic(optional = false)
    @Column(name = "discoDuro")
    private String discoduro;  
    
    @Basic(optional = false)
    @Column(name = "monitor")
    private String monitor;  

    public Computador() {
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
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

    public void getDiscoduro() {
       this.discoduro = discoduro;
    }

    public void setDiscoduro(String discoduro) {
        this.discoduro = discoduro;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }
    
    

    
    
}
