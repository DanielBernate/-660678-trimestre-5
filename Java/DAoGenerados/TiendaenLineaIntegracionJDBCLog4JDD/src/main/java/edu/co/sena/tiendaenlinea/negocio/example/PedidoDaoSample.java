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
import edu.co.sena.tiendaenlinea.integracion.dao.PedidoDao;
import edu.co.sena.tiendaenlinea.integracion.dto.Pedido;
import edu.co.sena.tiendaenlinea.integracion.exceptions.PedidoDaoException;
import edu.co.sena.tiendaenlinea.integracion.factory.PedidoDaoFactory;

public class PedidoDaoSample
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
		// findByFactura(0);
		// findWhereFacturaIdfacturaEquals(0);
		// findWhereTotalEquals(0);
		// findWhereSubtotalEquals(0);
		// findWhereImpuestosEquals(0);
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			PedidoDao _dao = getPedidoDao();
			Pedido _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByFactura'
	 * 
	 * @param facturaIdfactura
	 */
	public static void findByFactura(int facturaIdfactura)
	{
		try {
			PedidoDao _dao = getPedidoDao();
			Pedido _result[] = _dao.findByFactura(facturaIdfactura);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereFacturaIdfacturaEquals'
	 * 
	 * @param facturaIdfactura
	 */
	public static void findWhereFacturaIdfacturaEquals(int facturaIdfactura)
	{
		try {
			PedidoDao _dao = getPedidoDao();
			Pedido _result[] = _dao.findWhereFacturaIdfacturaEquals(facturaIdfactura);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereTotalEquals'
	 * 
	 * @param total
	 */
	public static void findWhereTotalEquals(float total)
	{
		try {
			PedidoDao _dao = getPedidoDao();
			Pedido _result[] = _dao.findWhereTotalEquals(total);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereSubtotalEquals'
	 * 
	 * @param subtotal
	 */
	public static void findWhereSubtotalEquals(float subtotal)
	{
		try {
			PedidoDao _dao = getPedidoDao();
			Pedido _result[] = _dao.findWhereSubtotalEquals(subtotal);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereImpuestosEquals'
	 * 
	 * @param impuestos
	 */
	public static void findWhereImpuestosEquals(float impuestos)
	{
		try {
			PedidoDao _dao = getPedidoDao();
			Pedido _result[] = _dao.findWhereImpuestosEquals(impuestos);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getPedidoDao'
	 * 
	 * @return PedidoDao
	 */
	public static PedidoDao getPedidoDao()
	{
		return PedidoDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Pedido dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getFacturaIdfactura() );
		buf.append( ", " );
		buf.append( dto.getTotal() );
		buf.append( ", " );
		buf.append( dto.getSubtotal() );
		buf.append( ", " );
		buf.append( dto.getImpuestos() );
		System.out.println( buf.toString() );
	}

}
