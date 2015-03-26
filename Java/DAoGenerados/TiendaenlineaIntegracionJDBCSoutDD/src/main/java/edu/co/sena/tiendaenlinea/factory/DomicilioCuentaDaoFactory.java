/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.factory;

import java.sql.Connection;
import edu.co.sena.tiendaenlinea.dao.*;
import edu.co.sena.tiendaenlinea.jdbc.*;

public class DomicilioCuentaDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return DomicilioCuentaDao
	 */
	public static DomicilioCuentaDao create()
	{
		return new DomicilioCuentaDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return DomicilioCuentaDao
	 */
	public static DomicilioCuentaDao create(Connection conn)
	{
		return new DomicilioCuentaDaoImpl( conn );
	}

}