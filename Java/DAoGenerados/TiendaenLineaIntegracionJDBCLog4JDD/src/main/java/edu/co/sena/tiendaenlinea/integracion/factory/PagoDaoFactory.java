/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.integracion.factory;

import edu.co.sena.tiendaenlinea.integracion.jdbc.PagoDaoImpl;
import edu.co.sena.tiendaenlinea.integracion.dao.PagoDao;
import java.sql.Connection;

public class PagoDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return PagoDao
	 */
	public static PagoDao create()
	{
		return new PagoDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return PagoDao
	 */
	public static PagoDao create(Connection conn)
	{
		return new PagoDaoImpl( conn );
	}

}