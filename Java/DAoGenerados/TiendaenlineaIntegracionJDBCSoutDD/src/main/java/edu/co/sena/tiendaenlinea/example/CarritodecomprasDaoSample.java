/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.example;

import java.math.*;
import java.util.Date;
import java.util.Collection;
import edu.co.sena.tiendaenlinea.dao.CarritodecomprasDao;
import edu.co.sena.tiendaenlinea.dto.Carritodecompras;
import edu.co.sena.tiendaenlinea.exceptions.CarritodecomprasDaoException;
import edu.co.sena.tiendaenlinea.factory.CarritodecomprasDaoFactory;

public class CarritodecomprasDaoSample
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
		// findWhereIdCarritoDeComprasEquals("");
		// findWhereSubtotalEquals(0);
		// findWherePrecioTotalEquals(0);
		// findWhereImpuestosEquals(0);
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			CarritodecomprasDao _dao = getCarritodecomprasDao();
			Carritodecompras _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereIdCarritoDeComprasEquals'
	 * 
	 * @param idCarritoDeCompras
	 */
	public static void findWhereIdCarritoDeComprasEquals(String idCarritoDeCompras)
	{
		try {
			CarritodecomprasDao _dao = getCarritodecomprasDao();
			Carritodecompras _result[] = _dao.findWhereIdCarritoDeComprasEquals(idCarritoDeCompras);
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
			CarritodecomprasDao _dao = getCarritodecomprasDao();
			Carritodecompras _result[] = _dao.findWhereSubtotalEquals(subtotal);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWherePrecioTotalEquals'
	 * 
	 * @param precioTotal
	 */
	public static void findWherePrecioTotalEquals(float precioTotal)
	{
		try {
			CarritodecomprasDao _dao = getCarritodecomprasDao();
			Carritodecompras _result[] = _dao.findWherePrecioTotalEquals(precioTotal);
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
			CarritodecomprasDao _dao = getCarritodecomprasDao();
			Carritodecompras _result[] = _dao.findWhereImpuestosEquals(impuestos);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getCarritodecomprasDao'
	 * 
	 * @return CarritodecomprasDao
	 */
	public static CarritodecomprasDao getCarritodecomprasDao()
	{
		return CarritodecomprasDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Carritodecompras dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getIdCarritoDeCompras() );
		buf.append( ", " );
		buf.append( dto.getSubtotal() );
		buf.append( ", " );
		buf.append( dto.getPrecioTotal() );
		buf.append( ", " );
		buf.append( dto.getImpuestos() );
		System.out.println( buf.toString() );
	}

}
