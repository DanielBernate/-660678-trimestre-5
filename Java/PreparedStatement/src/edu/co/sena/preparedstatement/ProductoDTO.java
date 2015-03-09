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
public class ProductoDTO implements  java.io.Serializable {
    private String idProdcuto;
    private String nombre;
    private String marca;
    private String referencia;
    private String descripcion;
    private String material;
    private String color;
    private int cantidad;
    private Short activo;
    private float precioUnitario;
    private float descuento;
    private int categoriaIdCategoria;
    private int catalogoIdCatalogo;

    public String getIdProdcuto() {
        return idProdcuto;
    }

    public void setIdProdcuto(String idProdcuto) {
        this.idProdcuto = idProdcuto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Short getActivo() {
        return activo;
    }

    public void setActivo(Short activo) {
        this.activo = activo;
    }
  

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public int getCategoriaIdCategoria() {
        return categoriaIdCategoria;
    }

    public void setCategoriaIdCategoria(int categoriaIdCategoria) {
        this.categoriaIdCategoria = categoriaIdCategoria;
    }

    public int getCatalogoIdCatalogo() {
        return catalogoIdCatalogo;
    }

    public void setCatalogoIdCatalogo(int catalogoIdCatalogo) {
        this.catalogoIdCatalogo = catalogoIdCatalogo;
    }

    @Override
    public String toString() {
        return "ProductoDTO{" + "idProdcuto=" + idProdcuto + ", nombre=" + nombre + ", marca=" + marca + ", referencia=" + referencia + ", descripcion=" + descripcion + ", material=" + material + ", color=" + color + ", cantidad=" + cantidad + ", activo=" + activo + ", precioUnitario=" + precioUnitario + ", descuento=" + descuento + ", categoriaIdCategoria=" + categoriaIdCategoria + ", catalogoIdCatalogo=" + catalogoIdCatalogo + '}';
    }

  
    
}
