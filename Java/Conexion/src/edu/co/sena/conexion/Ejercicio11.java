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
 * @author BERNATE
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;
        String idFactura = JOptionPane.showInputDialog("Digite el id de la factura");

        try {
            String url = "jdbc:mysql://localhost/tiendaenlinea?user=root&password=123456789";
            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a mysql");
            sentencia = conexion.createStatement();

            String sql = "select producto.nombre, item.cantidad, item.costoUnitario, item.costoTotal "
                    + "from tiendaenlinea.factura factura, tiendaenlinea.pedido pedido, tiendaenlinea.item item, tiendaenlinea.producto producto "
                    + "where factura.idFactura = pedido.Factura_idFactura and pedido.Factura_idFactura =item.Pedido_Factura_idFactura "
                    + "and item.Producto_idProducto = producto.idProducto and factura.idFactura ='" + idFactura + "';";
            sentencia = conexion.createStatement();

            System.out.println(sql);
            
            rs = sentencia.executeQuery(sql);
            if (rs.next() == true) {
                rs.beforeFirst();
                while (rs.next() == true) {
                    System.out.println("Nombre del producto: " + rs.getString("producto.nombre"));
                    System.out.println("Cantidad : " + rs.getString("item.cantidad"));
                    System.out.println("Costo Unitario : " + rs.getString("item.costoUnitario"));
                    System.out.println("Costo Total : " + rs.getString("item.costoTotal")+"\n");
                    

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
