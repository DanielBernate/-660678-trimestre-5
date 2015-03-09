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
public class Ejercicio7 {

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
            String entrada = JOptionPane.showInputDialog("Digite el Tipo de Documento");
            String entrada1 = JOptionPane.showInputDialog("Digite el numero Documento");

            rs = sentencia.executeQuery("SELECT * from tiendaenlinea.cuenta where tipoDocumento= '" + entrada + "' and numeroDocumento = '" + entrada1 + "'");
            if (!rs.wasNull()) {
                while (rs.next() == true) {
                    System.out.println("Tipo documento: " + rs.getString("tipoDocumento"));
                    System.out.println("Numero documento : " + rs.getString("numeroDocumento"));
                    System.out.println("Primer nombre: " + rs.getString("primerNombre"));
                    System.out.println("Segundo nombre : " + rs.getString("segundoNombre"));
                    System.out.println("Primer apellido : " + rs.getString("primerApellido"));
                    System.out.println("Segundo apellido : " + rs.getString("segundoApellido"));
                    System.out.println("Contrasena: " + rs.getString("contrasena"));
                    System.out.println("email : " + rs.getString("email"));
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
