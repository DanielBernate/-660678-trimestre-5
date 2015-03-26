/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.integracion.factory;

import edu.co.sena.tiendaenlinea.integracion.jdbc.DepartamentoDaoImpl;
import edu.co.sena.tiendaenlinea.integracion.dao.DepartamentoDao;
import java.sql.Connection;

public class DepartamentoDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return DepartamentoDao
	 */
	public static DepartamentoDao create()
	{
		return new DepartamentoDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return DepartamentoDao
	 */
	public static DepartamentoDao create(Connection conn)
	{
		return new DepartamentoDaoImpl( conn );
	}

}