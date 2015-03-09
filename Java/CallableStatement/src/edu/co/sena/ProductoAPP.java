/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena;

import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ColsutecR
 */
public class ProductoAPP {

    java.sql.Connection conexion = null;
    private CallableStatement sentencia = null;
    private ResultSet rs = null;
    private String url = "jdbc:mysql://localhost/tiendaenlinea?user=root&password=123456789";

    public void insertProceCuenta(ProductoDTO producto) throws SQLException {
        String sql = " call tiendaenlinea.Insert_producto(?,?,?,?,?,?,?,?,?,?,?,?,?) ";

        try {
            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a mysql");
            sentencia = conexion.prepareCall(sql);
            sentencia.setString(1, producto.getIdProdcuto());
            sentencia.setString(2, producto.getNombre());
            sentencia.setString(3, producto.getMarca());
            sentencia.setString(4, producto.getReferencia());
            sentencia.setString(5, producto.getDescripcion());
            sentencia.setString(6, producto.getMaterial());
            sentencia.setString(7, producto.getColor());
            sentencia.setInt(8, producto.getCantidad());
            sentencia.setShort(9, producto.getActivo());
            sentencia.setFloat(10, producto.getPrecioUnitario());
            sentencia.setFloat(11, producto.getDescuento());
            sentencia.setInt(12, producto.getCategoriaIdCategoria());
            sentencia.setInt(13, producto.getCatalogoIdCatalogo());
            
            System.out.println("sentencia ejecutada " + sql);

            int resultado = sentencia.executeUpdate();
            if (resultado > 0) {
                System.out.println("Se ejecuto el procedimiento");
            } else {
                System.out.println("No se ejecuto");
            }

        } catch (SQLException e) {
            System.err.println("error: " + e.toString());
        } finally {
            if (sentencia != null) {
                sentencia.close();
                System.out.println("Se cerro el statement");
            }

            if (conexion != null) {
                conexion.close();
                System.out.println("Se cerro la conexion  correctamente");
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
       
        ProductoDTO prod1 = new ProductoDTO();
        ProductoAPP app = new ProductoAPP();
        prod1.setIdProdcuto("T123");
        prod1.setNombre("Bajo");
        prod1.setMarca("Yamaha");
        prod1.setReferencia("St2300");
        prod1.setDescripcion("Es un bajo acustico para buenos temas");
        prod1.setMaterial("Concabo");
        prod1.setColor("Roja");
        prod1.setCantidad(3);
        prod1.setActivo(new Short("1"));
        prod1.setPrecioUnitario(250000);
        prod1.setDescuento(0);
        prod1.setCategoriaIdCategoria(7);
        prod1.setCatalogoIdCatalogo(1);
        app.insertProceCuenta(prod1);
    }

}
