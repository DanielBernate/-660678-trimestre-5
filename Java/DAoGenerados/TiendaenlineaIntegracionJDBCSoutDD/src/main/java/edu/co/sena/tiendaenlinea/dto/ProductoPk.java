/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the producto table.
 */
public class ProductoPk implements Serializable
{
	protected String idProducto;

	/** 
	 * Sets the value of idProducto
	 */
	public void setIdProducto(String idProducto)
	{
		this.idProducto = idProducto;
	}

	/** 
	 * Gets the value of idProducto
	 */
	public String getIdProducto()
	{
		return idProducto;
	}

	/**
	 * Method 'ProductoPk'
	 * 
	 */
	public ProductoPk()
	{
	}

	/**
	 * Method 'ProductoPk'
	 * 
	 * @param idProducto
	 */
	public ProductoPk(final String idProducto)
	{
		this.idProducto = idProducto;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof ProductoPk)) {
			return false;
		}
		
		final ProductoPk _cast = (ProductoPk) _other;
		if (idProducto == null ? _cast.idProducto != idProducto : !idProducto.equals( _cast.idProducto )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		if (idProducto != null) {
			_hashCode = 29 * _hashCode + idProducto.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.tiendaenlinea.dto.ProductoPk: " );
		ret.append( "idProducto=" + idProducto );
		return ret.toString();
	}

}
