/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.tiendaenlinea.negocio.example3;

import edu.co.sena.tiendaenlinea.integracion.dao.CuentaDao;
import edu.co.sena.tiendaenlinea.integracion.dao.UsuarioDao;
import edu.co.sena.tiendaenlinea.integracion.dto.Cuenta;
import edu.co.sena.tiendaenlinea.integracion.dto.CuentaPk;
import edu.co.sena.tiendaenlinea.integracion.dto.Usuario;
import edu.co.sena.tiendaenlinea.integracion.exceptions.CuentaDaoException;
import edu.co.sena.tiendaenlinea.integracion.exceptions.UsuarioDaoException;
import edu.co.sena.tiendaenlinea.integracion.factory.CuentaDaoFactory;
import edu.co.sena.tiendaenlinea.integracion.factory.UsuarioDaoFactory;

/**
 *
 * @author ColsutecR
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UsuarioDaoException, CuentaDaoException {
        // TODO code application logic here
        Usuario user1 = new Usuario();
        user1.setIdUsuario("Da147");
        user1.setContrasena("147258");
        user1.setRol("cliente");
        user1.setEstado("Activo");

//        UsuarioDao daoUsuario = UsuarioDaoFactory.create();
//        daoUsuario.insert(user1);

        Cuenta c1 = new Cuenta();
        c1.setTipoDocumento("CC");
        c1.setNumeroDocumento("1023088273");
        c1.setPrimerNombre("Andra");
        c1.setSegundoNombre("Sofia");
        c1.setPrimerApellido("Gomez");
        c1.setSegundoApellido("Lara");
        c1.setContrasena(user1.getContrasena());
        c1.setEmail("dan@hotmail.com");
        c1.setUsuarioIdusuario(user1.getIdUsuario());

        CuentaDao daocuenta1 = CuentaDaoFactory.create();
//        daocuenta1.insert(c1);

        Cuenta arreglo1Cuentas[] = daocuenta1.findAll();
        for (int i = 0; i < arreglo1Cuentas.length; i++) {
            System.out.println(arreglo1Cuentas[i].toString());

        }

//        c1.setEmail("nose@gmail.com");
//        daocuenta1.update(c1.createPk(), c1);
//
//        String sql = "Select * from tiendaenlinea.cuenta c where c.tipoDocumento =?"
//                + "and c.numeroDocumento = ?;";
//        String parametro[] = new String[2];
//        parametro[0] = c1.getTipoDocumento();
//        parametro[1] = c1.getNumeroDocumento();
//
//        Cuenta arregloCuentas2[] = daocuenta1.findByDynamicSelect(sql, parametro);
//        for (int i = 0; i < arregloCuentas2.length; i++) {
//            System.out.println(arregloCuentas2.toString());
//   }
//        
//        String sql2 ="numeroDocumento = ?;";
//        String param[] = new String[1];
//          param[0]= c1.getNumeroDocumento();
//        
//        Cuenta arreCuenta3[] = daocuenta1.findByDynamicWhere(sql2, param);
//        for (int i = 0; i < arreCuenta3.length; i++) {
//            System.out.println(arreCuenta3[i].toString());
//        }
// 
//        Cuenta arregloCuenta4[] = daocuenta1.findByUsuario(c1.getUsuarioIdusuario());
//        for (int i = 0; i < arregloCuenta4.length; i++) {
//            System.out.println(arregloCuenta4[i].toString());
//        }
//          Cuenta arreCuenta5[] = daocuenta1.findWhereContrasenaEquals(c1.getContrasena());
//        for (int i = 0; i < arreCuenta5.length; i++) {
//            System.out.println(arreCuenta5[i].toString());
//        }
//        
//        
//        
//        
        
//        Cuenta arregloCuenta7[] = daocuenta1.findWhereEmailEquals(c1.getEmail());
//        for (int i = 0; i < arregloCuenta7.length; i++) {
//            System.out.println(arregloCuenta7[i].toString());
//            
//        }
//        Cuenta arregloCuenta8[] = daocuenta1.findWhereNumeroDocumentoEquals(c1.getNumeroDocumento());
//        for (int i = 0; i < arregloCuenta8.length; i++) {
//            System.out.println(arregloCuenta8[i].toString());
//        }
//        Cuenta arregloCuenta9[] = daocuenta1.findWherePrimerApellidoEquals(c1.getPrimerApellido());
//        for (int i = 0; i <arregloCuenta9.length ; i++) {
//            System.out.println(arregloCuenta9[i].toString());
//            
//        }
//        Cuenta arregloCuenta10[] = daocuenta1.findWhereSegundoApellidoEquals(c1.getSegundoApellido());
//        for (int i = 0; i <arregloCuenta10.length ; i++) {
//            System.out.println(arregloCuenta10[i].toString());
//            
//        }
//        Cuenta arregloCuenta11[] = daocuenta1.findWherePrimerNombreEquals(c1.getPrimerNombre());
//        for (int i = 0; i <arregloCuenta11.length ; i++) {
//            System.out.println(arregloCuenta11[i].toString());
//            
//        }
//        
//        Cuenta arregloCuenta12[] = daocuenta1.findWhereSegundoNombreEquals(c1.getSegundoNombre());
//        for (int i = 0; i <arregloCuenta12.length ; i++) {
//            System.out.println(arregloCuenta12[i].toString());
//            
////        }
//          Cuenta arregloCuenta13[] = daocuenta1.findWhereNumeroDocumentoEquals(c1.getNumeroDocumento());
//        for (int i = 0; i <arregloCuenta13.length ; i++) {
//            System.out.println(arregloCuenta13[i].toString());
//            
//        }
//          Cuenta arregloCuenta14[] = daocuenta1.findWhereTipoDocumentoEquals(c1.getTipoDocumento());
//        for (int i = 0; i <arregloCuenta14.length ; i++) {
//            System.out.println(arregloCuenta14[i].toString());
//            
//        }
//        CuentaPk cuentapk = c1.createPk();
//        Cuenta cuentaTemporal =daocuenta1.findByPrimaryKey(cuentapk);
//        System.out.println(cuentaTemporal.toString());
//        
//        Cuenta cuentaTemporal2 = daocuenta1.findByPrimaryKey(c1.getTipoDocumento(),c1.getNumeroDocumento());
//        System.out.println(cuentaTemporal2.toString());
        
        int maxRow = daocuenta1.getMaxRows();
    }

}
