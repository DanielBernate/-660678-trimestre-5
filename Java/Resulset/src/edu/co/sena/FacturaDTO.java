/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author BERNATE
 */
public class FacturaDTO implements java.io.Serializable{

    private int idFacura;
    private Date fecha;
    private Time hora;
    private float total;
    private String tipoDocumento;
    private String numeroDocumento;

    public int getIdFacura() {
        return idFacura;
    }

    public void setIdFacura(int idFacura) {
        this.idFacura = idFacura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Override
    public String toString() {
        return "Factura{" + "idFacura=" + idFacura + ", fecha=" + fecha + ", hora=" + hora + ", total=" + total + ", tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento + '}';
    }
    

}
