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
 * @author BERNATE
 */
public class APPCuenta {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws SQLException {
        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;
        String tipoDocumento = JOptionPane.showInputDialog("Digite el Tipo documento");
        String numeroDocumento = JOptionPane.showInputDialog("Digite el Numero Documento");
        
        String sql2 = "SELECT * FROM tiendaenlinea.cuenta where cuenta.tipoDocumento ='" + tipoDocumento + "' and  "
                + "cuenta.numeroDocumento ='"+numeroDocumento+"';";
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
                    CuentaDTO cuenta1 = new CuentaDTO();
                    cuenta1.setTipoDocumento(rs.getString("tipoDocumento"));
                    cuenta1.setNumeroDocumento(rs.getString("numeroDocumento"));
                    cuenta1.setPrimerNombre(rs.getString("primerNombre"));
                    cuenta1.setSegundoNombre(rs.getString("segundoNombre"));
                    cuenta1.setPrimerApellido(rs.getString("primerApellido"));
                    cuenta1.setSegundoApellido(rs.getString("segundoApellido"));
                    cuenta1.setEmail(rs.getString("email"));
                    cuenta1.setContrasena(rs.getString("contrasena"));
                    cuenta1.setUsuarioIdUsuario(rs.getString("Usuario_idUsuario"));
                    System.out.println(cuenta1.toString());

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
