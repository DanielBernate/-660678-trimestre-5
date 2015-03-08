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
import java.sql.Statement;

/**
 *
 * @author ColsutecR
 */
public class ProductoAPP {

    java.sql.Connection conexion = null;
    private PreparedStatement sentencia = null;
    private ResultSet rs = null;
    private String url = "jdbc:mysql://localhost/tiendaenlinea?user=root&password=123456789";

    private void insertarProducto(ProductoDTO producto) throws SQLException {
        String sql1 = "INSERT INTO tiendaenlinea.producto "
                + "(idProducto,"
                + "nombre, "
                + "marca, "
                + "referencia, "
                + "descripcion, "
                + "material, "
                + "color, "
                + "cantidad, "
                + "activo, "
                + "precioUnitario, "
                + "descuento, "
                + "Categoria_idCategoria, "
                + "Catalogo_idCatalogo ) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,? );";
        System.out.println(sql1);
        try {

            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a mysql");
            sentencia = conexion.prepareStatement(sql1);

            sentencia.setString(1, producto.getIdProdcuto());
            sentencia.setString(2, producto.getNombre());
            sentencia.setString(3, producto.getMarca());
            sentencia.setString(4, producto.getReferencia());
            sentencia.setString(5, producto.getDescripcion());
            sentencia.setString(6, producto.getMaterial());
            sentencia.setString(7, producto.getColor());
            sentencia.setInt(8, producto.getCantidad());
            sentencia.setShort(9, producto.getActivo());
            sentencia.setFloat(10, producto.getPrecioUnitario());
            sentencia.setFloat(11, producto.getDescuento());
            sentencia.setInt(12, producto.getCategoriaIdCategoria());
            sentencia.setInt(13, producto.getCatalogoIdCatalogo());

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

    private void actualizarProducto(ProductoDTO producto) throws SQLException {
        String sql2 = "UPDATE tiendaenlinea.producto "
                + "SET "
                + "nombre = ?, "
                + "marca = ?, "
                + "referencia = ?, "
                + "descripcion =?, "
                + "material = ?, "
                + "color = ?, "
                + "cantidad= ?, "
                + "activo = ?, "
                + "precioUnitario = ?, "
                + "descuento = ?, "
                + "Categoria_idCategoria = ?, "
                + "Catalogo_idCatalogo = ? "
                + "WHERE idProducto = ? ; ";
        System.out.println(sql2);
        try {

            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a mysql");
            sentencia = conexion.prepareStatement(sql2);

            sentencia.setString(1, producto.getNombre());
            sentencia.setString(2, producto.getMarca());
            sentencia.setString(3, producto.getReferencia());
            sentencia.setString(4, producto.getDescripcion());
            sentencia.setString(5, producto.getMaterial());
            sentencia.setString(6, producto.getColor());
            sentencia.setInt(7, producto.getCantidad());
            sentencia.setShort(8, producto.getActivo());
            sentencia.setFloat(9, producto.getPrecioUnitario());
            sentencia.setFloat(10, producto.getDescuento());
            sentencia.setInt(11, producto.getCategoriaIdCategoria());
            sentencia.setInt(12, producto.getCatalogoIdCatalogo());
            sentencia.setString(13, producto.getIdProdcuto());

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

    private void eliminarProducto(ProductoDTO producto) throws SQLException {
        String sql3 = "DELETE FROM tiendaenlinea.producto "
                + "WHERE idProducto= ? ;";
        System.out.println(sql3);
        try {

            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a mysql");
            sentencia = conexion.prepareStatement(sql3);

            sentencia.setString(1, producto.getIdProdcuto());

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

    private ProductoDTO buscarDatos(ProductoDTO producto) throws SQLException {
        ProductoDTO prodcutoTemporal = new ProductoDTO();
        ResultSet rs = null;
        String sql4 = "SELECT * FROM tiendaenlinea.producto WHERE idProducto= ? ;";
        System.out.println(sql4);
        try {
            conexion = DriverManager.getConnection(url);
            System.out.println("Se conecto a mysql");
            sentencia = conexion.prepareStatement(sql4);
            sentencia.setString(1, producto.getIdProdcuto());
            rs = sentencia.executeQuery();
                  if (rs.next() == true) {
                rs.beforeFirst();
                while (rs.next() == true) {
                   prodcutoTemporal.setIdProdcuto(rs.getString("idProducto"));
                   prodcutoTemporal.setNombre(rs.getString("nombre"));
                   prodcutoTemporal.setMarca(rs.getString("marca"));
                   prodcutoTemporal.setReferencia(rs.getString("referencia"));
                   prodcutoTemporal.setDescripcion(rs.getString("descripcion"));
                   prodcutoTemporal.setMaterial(rs.getString("material"));
                   prodcutoTemporal.setColor(rs.getString("color"));
                   prodcutoTemporal.setCantidad(rs.getInt("cantidad"));
                   prodcutoTemporal.setActivo(rs.getShort("activo"));
                   prodcutoTemporal.setPrecioUnitario(rs.getFloat("precioUnitario"));
                   prodcutoTemporal.setDescuento(rs.getFloat("descuento"));
                   prodcutoTemporal.setCategoriaIdCategoria(rs.getInt("Categoria_idCategoria"));
                   prodcutoTemporal.setCatalogoIdCatalogo(rs.getInt("Catalogo_idCatalogo"));

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
        return prodcutoTemporal;
    }

    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        ProductoDTO prod1 = new ProductoDTO();
        ProductoAPP app = new ProductoAPP();
        prod1.setIdProdcuto("123");
        prod1.setNombre("Bateria");
        prod1.setMarca("Jazz");
        prod1.setReferencia("Fs1234");
        prod1.setDescripcion("Es una bateria de tipo de buena percusion");
        prod1.setMaterial("koa");
        prod1.setColor("Verde");
        prod1.setCantidad(5);
        prod1.setActivo(new Short("1"));
        prod1.setPrecioUnitario(1300000);
        prod1.setDescuento(0);
        prod1.setCategoriaIdCategoria(7);
        prod1.setCatalogoIdCatalogo(1);
        app.insertarProducto(prod1);
        System.out.println("_________________________");
        prod1.setNombre("Saxofon");
        prod1.setMarca("Yamaha");
        prod1.setReferencia("125");
        prod1.setDescripcion("Es un saxofon reconocido mundial mente");
        prod1.setMaterial("Metal");
        prod1.setColor("Plateado");
        prod1.setCantidad(2);
        prod1.setActivo(new Short("1"));
        prod1.setPrecioUnitario(120000);
        prod1.setDescuento(0);
        prod1.setCategoriaIdCategoria(7);
        prod1.setCatalogoIdCatalogo(1);
        app.actualizarProducto(prod1);
        System.out.println("__________________");
        app.eliminarProducto(prod1);
        System.out.println("______________");
        ProductoDTO pruductoBusq = app.buscarDatos(prod1);
        System.out.println(pruductoBusq.toString());
      
    }

}
