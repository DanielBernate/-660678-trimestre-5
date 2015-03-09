/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena;

import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ColsutecR
 */
public class CuentaAPP {

    java.sql.Connection conexion = null;
    private CallableStatement sentencia = null;
    private ResultSet rs = null;
    private String url = "jdbc:mysql://localhost/tiendaenlinea?user=root&password=123456789";

    public void insertarProcedimientoCuenta(CuentaDTO cuenta) throws SQLException {
        String sql = "call tiendaenlinea.insert_cuenta "
                +" ( ?,?,?,?,?,?,?,?,?) ";
        try {
            
            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a mysql");
            sentencia = conexion.prepareCall(sql);
             sentencia.setString(1, cuenta.getTipoDocumento());
             sentencia.setString(2, cuenta.getNumeroDocumento());
             sentencia.setString(3, cuenta.getPrimerNombre());
             sentencia.setString(4, cuenta.getSegundoNombre());
             sentencia.setString(5, cuenta.getPrimerApellido());
             sentencia.setString(6, cuenta.getSegundoApellido());
             sentencia.setString(7, cuenta.getContasena());
             sentencia.setString(8, cuenta.getEmail());
             sentencia.setString(9, cuenta.getUsuario_idUsuario());
            
           System.out.println("sentencia ejecutada " + sql );
            

            int resultado = sentencia.executeUpdate();
            if (resultado>0) {
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
        // TODO code application logic here
        CuentaDTO cuenta1 = new CuentaDTO();
        CuentaAPP app = new CuentaAPP();
        cuenta1.setTipoDocumento("CC");
        cuenta1.setNumeroDocumento("852136");
        cuenta1.setPrimerNombre("Juan");
        cuenta1.setSegundoNombre("Carlos");
        cuenta1.setPrimerApellido("Sanches");
        cuenta1.setSegundoApellido("Sambrano");
        cuenta1.setContasena("12334454");
        cuenta1.setEmail("juanca@hotmail.com");
        cuenta1.setUsuario_idUsuario("juanca");
        app.insertarProcedimientoCuenta(cuenta1);
        
    }

}
