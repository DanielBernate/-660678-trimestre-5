/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.negocio.example;

import java.math.*;
import java.util.Date;
import java.util.Collection;
import edu.co.sena.tiendaenlinea.integracion.dao.ItemDao;
import edu.co.sena.tiendaenlinea.integracion.dto.Item;
import edu.co.sena.tiendaenlinea.integracion.exceptions.ItemDaoException;
import edu.co.sena.tiendaenlinea.integracion.factory.ItemDaoFactory;

public class ItemDaoSample
{
	/**
	 * Method 'main'
	 * 
	 * @param arg
	 * @throws Exception
	 */
	public static void main(String[] arg) throws Exception
	{
		// Uncomment one of the lines below to test the generated code
		
		// findAll();
		// findByPedido(0);
		// findByProducto("");
		// findWhereProductoIdproductoEquals("");
		// findWherePedidoFacturaIdfacturaEquals(0);
		// findWhereCantidadEquals(0);
		// findWhereCostoUnitarioEquals(0);
		// findWhereCostoTotalEquals(0);
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			ItemDao _dao = getItemDao();
			Item _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByPedido'
	 * 
	 * @param pedidoFacturaIdfactura
	 */
	public static void findByPedido(int pedidoFacturaIdfactura)
	{
		try {
			ItemDao _dao = getItemDao();
			Item _result[] = _dao.findByPedido(pedidoFacturaIdfactura);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByProducto'
	 * 
	 * @param productoIdproducto
	 */
	public static void findByProducto(String productoIdproducto)
	{
		try {
			ItemDao _dao = getItemDao();
			Item _result[] = _dao.findByProducto(productoIdproducto);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereProductoIdproductoEquals'
	 * 
	 * @param productoIdproducto
	 */
	public static void findWhereProductoIdproductoEquals(String productoIdproducto)
	{
		try {
			ItemDao _dao = getItemDao();
			Item _result[] = _dao.findWhereProductoIdproductoEquals(productoIdproducto);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWherePedidoFacturaIdfacturaEquals'
	 * 
	 * @param pedidoFacturaIdfactura
	 */
	public static void findWherePedidoFacturaIdfacturaEquals(int pedidoFacturaIdfactura)
	{
		try {
			ItemDao _dao = getItemDao();
			Item _result[] = _dao.findWherePedidoFacturaIdfacturaEquals(pedidoFacturaIdfactura);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCantidadEquals'
	 * 
	 * @param cantidad
	 */
	public static void findWhereCantidadEquals(int cantidad)
	{
		try {
			ItemDao _dao = getItemDao();
			Item _result[] = _dao.findWhereCantidadEquals(cantidad);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCostoUnitarioEquals'
	 * 
	 * @param costoUnitario
	 */
	public static void findWhereCostoUnitarioEquals(float costoUnitario)
	{
		try {
			ItemDao _dao = getItemDao();
			Item _result[] = _dao.findWhereCostoUnitarioEquals(costoUnitario);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCostoTotalEquals'
	 * 
	 * @param costoTotal
	 */
	public static void findWhereCostoTotalEquals(float costoTotal)
	{
		try {
			ItemDao _dao = getItemDao();
			Item _result[] = _dao.findWhereCostoTotalEquals(costoTotal);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getItemDao'
	 * 
	 * @return ItemDao
	 */
	public static ItemDao getItemDao()
	{
		return ItemDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Item dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getProductoIdproducto() );
		buf.append( ", " );
		buf.append( dto.getPedidoFacturaIdfactura() );
		buf.append( ", " );
		buf.append( dto.getCantidad() );
		buf.append( ", " );
		buf.append( dto.getCostoUnitario() );
		buf.append( ", " );
		buf.append( dto.getCostoTotal() );
		System.out.println( buf.toString() );
	}

}
