/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicioentidades.arbol;

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
@Table(name = "arbol",schema = "ejercicioarbol")
@XmlRootElement
public class Arbol implements Serializable{
    @Id
    @Basic(optional = false)
    @Column(name = "referencia")
    private String referencia;
    
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    
    @Basic(optional = false)
    @Column(name = "diametro")
    private float diamentro;  
    
     @Basic(optional = false)
    @Column(name = "fruto")
    private String fruto;
    
    @Basic(optional = false)
    @Column(name = "edad")
    private int edad;  
    
     @Basic(optional = false)
    @Column(name = "altura")
    private float altura;  

    public Arbol() {
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDiamentro() {
        return diamentro;
    }

    public void setDiamentro(float diamentro) {
        this.diamentro = diamentro;
    }

    public String getFruto() {
        return fruto;
    }

    public void setFruto(String fruto) {
        this.fruto = fruto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
     
     
     
     
    
    

    
}
