/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.negocio.example2;

import java.math.*;
import java.util.Date;
import java.util.Collection;
import edu.co.sena.tiendaenlinea.integracion.dao.ItemCarritoDao;
import edu.co.sena.tiendaenlinea.integracion.dto.ItemCarrito;
import edu.co.sena.tiendaenlinea.integracion.exceptions.ItemCarritoDaoException;
import edu.co.sena.tiendaenlinea.integracion.factory.ItemCarritoDaoFactory;

public class ItemCarritoDaoSample
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
		// findByCarritodecompras("");
		// findByProducto("");
		// findWhereProductoIdproductoEquals("");
		// findWhereCarritodecomprasIdcarritodecomprasEquals("");
		// findWhereCantidadEquals(0);
		// findWhereCostoUnitarioEquals(0);
		// findWhereCostoTotalEquals(0);
            ItemCarrito itemCarr1 = new ItemCarrito();
            itemCarr1.setProductoIdproducto("A001");
            itemCarr1.setCarritodecomprasIdcarritodecompras("4");
            itemCarr1.setCantidad(6);
            itemCarr1.setCostoUnitario(150000);
            itemCarr1.setCostoTotal(900000);
            
            ItemCarritoDao daoItemCarrito = getItemCarritoDao();
            daoItemCarrito.insert(itemCarr1);
            findAll();
            
            
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			ItemCarritoDao _dao = getItemCarritoDao();
			ItemCarrito _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByCarritodecompras'
	 * 
	 * @param carritodecomprasIdcarritodecompras
	 */
	public static void findByCarritodecompras(String carritodecomprasIdcarritodecompras)
	{
		try {
			ItemCarritoDao _dao = getItemCarritoDao();
			ItemCarrito _result[] = _dao.findByCarritodecompras(carritodecomprasIdcarritodecompras);
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
			ItemCarritoDao _dao = getItemCarritoDao();
			ItemCarrito _result[] = _dao.findByProducto(productoIdproducto);
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
			ItemCarritoDao _dao = getItemCarritoDao();
			ItemCarrito _result[] = _dao.findWhereProductoIdproductoEquals(productoIdproducto);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCarritodecomprasIdcarritodecomprasEquals'
	 * 
	 * @param carritodecomprasIdcarritodecompras
	 */
	public static void findWhereCarritodecomprasIdcarritodecomprasEquals(String carritodecomprasIdcarritodecompras)
	{
		try {
			ItemCarritoDao _dao = getItemCarritoDao();
			ItemCarrito _result[] = _dao.findWhereCarritodecomprasIdcarritodecomprasEquals(carritodecomprasIdcarritodecompras);
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
			ItemCarritoDao _dao = getItemCarritoDao();
			ItemCarrito _result[] = _dao.findWhereCantidadEquals(cantidad);
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
			ItemCarritoDao _dao = getItemCarritoDao();
			ItemCarrito _result[] = _dao.findWhereCostoUnitarioEquals(costoUnitario);
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
			ItemCarritoDao _dao = getItemCarritoDao();
			ItemCarrito _result[] = _dao.findWhereCostoTotalEquals(costoTotal);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getItemCarritoDao'
	 * 
	 * @return ItemCarritoDao
	 */
	public static ItemCarritoDao getItemCarritoDao()
	{
		return ItemCarritoDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(ItemCarrito dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getProductoIdproducto() );
		buf.append( ", " );
		buf.append( dto.getCarritodecomprasIdcarritodecompras() );
		buf.append( ", " );
		buf.append( dto.getCantidad() );
		buf.append( ", " );
		buf.append( dto.getCostoUnitario() );
		buf.append( ", " );
		buf.append( dto.getCostoTotal() );
		System.out.println( buf.toString() );
	}

}
