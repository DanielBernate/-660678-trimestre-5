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
public class Ejemplo7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;
        String idProducto = JOptionPane.showInputDialog("Digite el Id del producto");
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
        String sql = "INSERT INTO tiendaenlinea.producto"
                + "(idProducto,"
                + "nombre,"
                + "marca,"
                + "referencia,"
                + "descripcion,"
                + "material,"
                + "color,"
                
                + "cantidad,"
                + "activo,"
                + "precioUnitario,"
                + "descuento,"
                + "Categoria_idCategoria,"
                + "Catalogo_idCatalogo)"
                + "VALUES"
                + "('"+idProducto+"',"
                + "'"+nombre+"',"
                + "'"+marca+"',"
                + "'"+referencia+"',"
                + "'"+descripcion+"',"
                + "'"+material+"',"
                + "'"+color+"',"
               
                + cantidad+","
                + activo+","
                + precioUnitario+","
                + descuento+","
                + categoriaIdCa+","
                + ""+catalogoIdCa+");";
        System.out.println(sql);
        try {
            String url = "jdbc:mysql://localhost/tiendaenlinea?user=root&password=123456789";
            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a mysql");
            sentencia = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
            boolean resultado=sentencia.execute(sql);
            if (resultado=true) {
                System.out.println("Se insertaron los datos");
            } else {
                System.out.println("No se insertaron");
            }
//
//            
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
