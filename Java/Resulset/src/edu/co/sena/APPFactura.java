/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ColsutecR
 */
public class APPFactura {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) throws SQLException {
        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;
        String idFactura = JOptionPane.showInputDialog("Digite el Id Factura");
       
        
        String sql2 = "SELECT * FROM tiendaenlinea.factura where factura.idFactura ='" + idFactura + "';";
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
                    FacturaDTO factura1 = new FacturaDTO();
                    factura1.setIdFacura(rs.getInt("idFactura"));
                    factura1.setFecha(rs.getDate("fecha"));
                    factura1.setHora(rs.getTime("fecha"));
                    factura1.setTotal(rs.getFloat("total"));
                    factura1.setTipoDocumento(rs.getString("Cuenta_tipoDocumento"));
                    factura1.setNumeroDocumento(rs.getString("Cuenta_numeroDocumento"));
                   
                    System.out.println(factura1.toString());

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
