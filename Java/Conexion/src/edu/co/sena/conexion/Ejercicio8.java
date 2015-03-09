/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.conexion;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ColsutecR
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;
        try {
            String url = "jdbc:mysql://localhost/tiendaenlinea?user=root&password=123456789";
            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a mysql");
            sentencia = conexion.createStatement();
            String entrada = JOptionPane.showInputDialog("Digite el ID del Producto");

            rs = sentencia.executeQuery("SELECT * from tiendaenlinea.producto where idProducto = '" + entrada + "';");
            if (!rs.wasNull()) {
                while (rs.next() == true) {
                    System.out.println("Id producto: " + rs.getString("idProducto"));
                    System.out.println("Nombre : " + rs.getString("nombre"));
                    System.out.println("Marca : " + rs.getString("marca"));
                    System.out.println("Referencia : " + rs.getString("referencia"));
                    System.out.println("Descripcion : " + rs.getString("descripcion"));
                    System.out.println("Material : " + rs.getString("material"));
                    System.out.println("Color : " + rs.getString("color"));
                    System.out.println("Cantidad : " + rs.getString("cantidad"));
                    System.out.println("Precio Unitario : " + rs.getString("precioUnitario"));
                    System.out.println("Descuento : " + rs.getString("descuento"));
                    System.out.println("Activo : " + rs.getString("activo"));
                }
            } else {
                System.out.println("No hay datos");
            }

        } catch (SQLException e) {
            System.err.println(e.toString());
        } finally {
            if (sentencia != null) {
                sentencia.close();
                System.out.println("Se cerro el statement de mysql");
            }
            if (rs != null) {
                rs.close();
                System.out.println("Se cerro el rs");
            }
            if (conexion != null) {
                conexion.close();
                System.out.println("Se cerro la conexion de mysql");
            }
        }
    }

}
