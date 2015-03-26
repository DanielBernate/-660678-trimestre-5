/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.conexion;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ColsutecR
 */
public class conexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.sql.Connection conexion = null;

        try {
          
            String servidor = "jdbc:mysql://localhost/instrumentos";
            String usuarioDB = "root";
            String passwordDB = "123456789";
            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto");
        } catch (SQLException  e) {
            System.err.println(e.toString());
        }

    }

}
