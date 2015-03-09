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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;
        String idProdcuto = JOptionPane.showInputDialog("Digite el id que desee modificar");
        String sql2 = "SELECT * FROM tiendaenlinea.producto where producto.idProducto ='" + idProdcuto + "';";
        System.out.println(sql2);

        try {
            String url = "jdbc:mysql://localhost/tiendaenlinea?user=root&password=123456789";
            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a mysql");
            sentencia = conexion.createStatement();

            rs = sentencia.executeQuery(sql2);
            if (rs.next() == true) {
                rs.beforeFirst();
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
                    System.out.println("_____________________________-");

                }
                String nombre = JOptionPane.showInputDialog("Digite el Nombre del producto");
                String marca = JOptionPane.showInputDialog("Digite la Marca del producto");
                String referencia = JOptionPane.showInputDialog("Digite la Referencia del producto");
                String descripcion = JOptionPane.showInputDialog("Digite la descripcio del producto");
                String color = JOptionPane.showInputDialog("Digite el color del producto");
                String material = JOptionPane.showInputDialog("Digite material del producto");
                String cantidad = JOptionPane.showInputDialog("Digite la cantidad del producto");
                String activo = JOptionPane.showInputDialog("Digite el activo del producto");
                String precioUnitario = JOptionPane.showInputDialog("Digite el precio unitario del producto");
                String descuento = JOptionPane.showInputDialog("Digite la descuento del producto");
                String categoriaIdCa = JOptionPane.showInputDialog("Digite la IdCAtegoria");
                String catalogoIdCa = JOptionPane.showInputDialog("Digite la IdCatalogo");
                String sql = "UPDATE tiendaenlinea.producto "
                        + "SET"
                        + " nombre= '" + nombre + "',"
                        + "marca = '" + marca + "',"
                        + "referencia = '" + referencia + "',"
                        + "descripcion= '" + descripcion + "',"
                        + "material= '"+material+"',"
                        + "color = '" + color + "',"
                        + "cantidad= " + cantidad + ","
                        + "activo = " + activo + ","
                        + "precioUnitario= " + precioUnitario + ","
                        + "descuento= " + descuento + ","
                        + "Categoria_idCategoria = " + categoriaIdCa + ","
                        + "Catalogo_idCatalogo = " + catalogoIdCa 
                        + " WHERE idProducto='" + idProdcuto + "';";
                
                System.out.println(sql);

                int resultado = sentencia.executeUpdate(sql);
                if (resultado == 1) {
                    System.out.println("Se insertaron los datos");
                } else {
                    System.out.println("No se insertaron");
                }
            }
        } catch (SQLException e) {
            System.err.println(e.toString());
        } finally {
            if (sentencia != null) {
                sentencia.close();
                System.out.println("Se cerro el statement de mysql");
            }

            if (conexion != null) {
                conexion.close();
                System.out.println("Se cerro la conexion de mysql");
            }
        }
    }
}
