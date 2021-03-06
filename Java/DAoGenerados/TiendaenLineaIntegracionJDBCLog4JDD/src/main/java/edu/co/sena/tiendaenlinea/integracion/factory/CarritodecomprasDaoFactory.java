/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.integracion.factory;

import edu.co.sena.tiendaenlinea.integracion.jdbc.CarritodecomprasDaoImpl;
import edu.co.sena.tiendaenlinea.integracion.dao.CarritodecomprasDao;
import java.sql.Connection;

public class CarritodecomprasDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return CarritodecomprasDao
	 */
	public static CarritodecomprasDao create()
	{
		return new CarritodecomprasDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return CarritodecomprasDao
	 */
	public static CarritodecomprasDao create(Connection conn)
	{
		return new CarritodecomprasDaoImpl( conn );
	}

}
