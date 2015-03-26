/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.integracion.factory;

import edu.co.sena.tiendaenlinea.integracion.jdbc.MunicipioDaoImpl;
import edu.co.sena.tiendaenlinea.integracion.dao.MunicipioDao;
import java.sql.Connection;

public class MunicipioDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return MunicipioDao
	 */
	public static MunicipioDao create()
	{
		return new MunicipioDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return MunicipioDao
	 */
	public static MunicipioDao create(Connection conn)
	{
		return new MunicipioDaoImpl( conn );
	}

}
