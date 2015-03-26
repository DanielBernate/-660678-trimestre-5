/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.integracion.factory;

import edu.co.sena.tiendaenlinea.integracion.jdbc.DomicilioProveedorDaoImpl;
import edu.co.sena.tiendaenlinea.integracion.dao.DomicilioProveedorDao;
import java.sql.Connection;

public class DomicilioProveedorDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return DomicilioProveedorDao
	 */
	public static DomicilioProveedorDao create()
	{
		return new DomicilioProveedorDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return DomicilioProveedorDao
	 */
	public static DomicilioProveedorDao create(Connection conn)
	{
		return new DomicilioProveedorDaoImpl( conn );
	}

}
