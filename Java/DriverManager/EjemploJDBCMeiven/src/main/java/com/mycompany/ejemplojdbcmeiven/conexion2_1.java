/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplojdbcmeiven;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ColsutecR
 */
public class conexion2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        java.sql.Connection conexion = null ;
        
        try{
            conexion
                    =DriverManager.getConnection("jdbc:mysql://localhost/instrumentos?"+"user=root&password=123456789");
            System.out.println("se conecto");
        }catch(SQLException e){
            System.err.println(e.toString());
        }finally {
            if (conexion != null) {
                conexion.close();
                System.out.println("Se cerro la conexion correctamnete");
            }
        }
    }
    
}
