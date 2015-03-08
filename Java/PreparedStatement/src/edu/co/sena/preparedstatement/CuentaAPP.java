/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.preparedstatement;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author BERNATE
 */
public class CuentaAPP {

    java.sql.Connection conexion = null;
    private PreparedStatement sentencia = null;
    private ResultSet rs = null;
    private String url = "jdbc:mysql://localhost/tiendaenlinea?user=root&password=123456789";

    private void insertCuenta(CuentaDTO cuenta) throws SQLException {
        String sqlc = "INSERT INTO tiendaenlinea.cuenta "
                + "( tipoDocumento,"
                + " numeroDocumento,"
                + " primerNombre,"
                + " segundoNombre,"
                + " primerApellido,"
                + " segundoApellido,"
                + " contrasena,"
                + " email,"
                + " Usuario_idUsuario ) "
                + " VALUES (?,?,?,?,?,?,?,?,?) ;";
        System.out.println(sqlc);
        try {

            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a mysql");
            sentencia = conexion.prepareStatement(sqlc);

            sentencia.setString(1, cuenta.getTipoDocumento());
            sentencia.setString(2, cuenta.getNumeroDocumento());
            sentencia.setString(3, cuenta.getPrimerNombre());
            sentencia.setString(4, cuenta.getSegundoNombre());
            sentencia.setString(5, cuenta.getPrimerApellido());
            sentencia.setString(6, cuenta.getSegundoApellido());
            sentencia.setString(7, cuenta.getContasena());
            sentencia.setString(8, cuenta.getEmail());
            sentencia.setString(9, cuenta.getUsuario_idUsuario());

            int resultado = sentencia.executeUpdate();
            if (resultado > 0) {
                System.out.println("Se insertaron " + resultado);
            } else {
                System.out.println("No se inserto");
            }

//            
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

    private void actualizarcCuenta(CuentaDTO cuenta) throws SQLException {
        String sqlc2 = "UPDATE tiendaenlinea.cuenta "
                + "SET "
                + " primerNombre = ?, "
                + " segundoNombre = ?, "
                + " primerApellido = ?, "
                + " segundoApellido = ?,"
                + " contrasena = ?,"
                + " email = ?, "
                + " Usuario_idUsuario  = ? "
                + "WHERE tipoDocumento  = ? AND numeroDocumento = ? ; ";
        System.out.println(sqlc2);
        try {

            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a mysql");
            sentencia = conexion.prepareStatement(sqlc2);

            sentencia.setString(1, cuenta.getPrimerNombre());
            sentencia.setString(2, cuenta.getSegundoNombre());
            sentencia.setString(3, cuenta.getPrimerApellido());
            sentencia.setString(4, cuenta.getSegundoApellido());
            sentencia.setString(5, cuenta.getContasena());
            sentencia.setString(6, cuenta.getEmail());
            sentencia.setString(7, cuenta.getUsuario_idUsuario());
            sentencia.setString(8, cuenta.getTipoDocumento());
            sentencia.setString(9, cuenta.getNumeroDocumento());

            int resultado = sentencia.executeUpdate();
            if (resultado > 0) {
                System.out.println("Se insertaron " + resultado);
            } else {
                System.out.println("No se inserto");
            }

//            
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

    private void eliminarCuenta(CuentaDTO cuenta) throws SQLException {
        String sqlc3 = "DELETE FROM tiendaenlinea.cuenta "
                + "WHERE tipoDocumento = ? AND numeroDocumento = ? ; ";
        System.out.println(sqlc3);
        try {

            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a mysql");
            sentencia = conexion.prepareStatement(sqlc3);

            sentencia.setString(1, cuenta.getTipoDocumento());
            sentencia.setString(2, cuenta.getNumeroDocumento());

            int resultado = sentencia.executeUpdate();
            if (resultado > 0) {
                System.out.println("se elimino " + resultado);
            } else {
                System.out.println("No se pudo eliminar");
            }

//            
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
    
    private CuentaDTO buscarCuenta(CuentaDTO cuenta) throws SQLException{
    CuentaDTO cuentaTemporal = new CuentaDTO();
        ResultSet rs = null;
        String sqlc4 = "SELECT * FROM tiendaenlinea.cuenta WHERE tipoDocumento = ? AND numeroDocumento = ? ;";
        System.out.println(sqlc4);
         try {
            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a mysql");
            sentencia = conexion.prepareStatement(sqlc4);
            sentencia.setString(1, cuenta.getTipoDocumento());
            sentencia.setString(2, cuenta.getNumeroDocumento());
            rs = sentencia.executeQuery();
                  if (rs.next() == true) {
                rs.beforeFirst();
                while (rs.next() == true) {
                   cuentaTemporal.setTipoDocumento(rs.getString("tipoDocumento"));
                   cuentaTemporal.setNumeroDocumento(rs.getString("numeroDocumento"));
                   cuentaTemporal.setPrimerNombre(rs.getString("primerNombre"));
                   cuentaTemporal.setSegundoNombre(rs.getString("segundoNombre"));
                   cuentaTemporal.setPrimerApellido(rs.getString("primerApellido"));
                   cuentaTemporal.setSegundoApellido(rs.getString("segundoApellido"));
                   cuentaTemporal.setContasena(rs.getString("contrasena"));
                   cuentaTemporal.setEmail(rs.getString("email"));
                   cuentaTemporal.setUsuario_idUsuario(rs.getString("Usuario_idUsuario"));
                }
           
            }

          
//            
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
        return cuentaTemporal;
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        CuentaDTO cuenta1 = new CuentaDTO();
        CuentaAPP app = new CuentaAPP();
        cuenta1.setTipoDocumento("CC");
        cuenta1.setNumeroDocumento("32456778");
        cuenta1.setPrimerNombre("Sandra");
        cuenta1.setSegundoNombre("Milena");
        cuenta1.setPrimerApellido("Giraldo");
        cuenta1.setSegundoApellido("Torres");
        cuenta1.setContasena("12334454");
        cuenta1.setEmail("sami@hotmail.com");
        cuenta1.setUsuario_idUsuario("mile");
        app.insertCuenta(cuenta1);
        System.out.println("_______________________");
        cuenta1.setPrimerNombre("Angie");
        cuenta1.setSegundoNombre("Viviana");
        cuenta1.setPrimerApellido("Porras");
        cuenta1.setSegundoApellido("Sanches");
        cuenta1.setContasena("2344556");
        cuenta1.setEmail("anvi@hotmail.com");
        cuenta1.setUsuario_idUsuario("mile");
        app.actualizarcCuenta(cuenta1);
        System.out.println("_________________");
        app.eliminarCuenta(cuenta1);
        System.out.println("___________");
        CuentaDTO cuentaBusque = app.buscarCuenta(cuenta1);
        System.out.println(cuentaBusque.toString());

    }

}
