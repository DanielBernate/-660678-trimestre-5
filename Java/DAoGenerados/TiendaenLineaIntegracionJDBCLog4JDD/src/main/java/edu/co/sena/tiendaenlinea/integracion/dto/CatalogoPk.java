/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.integracion.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the catalogo table.
 */
public class CatalogoPk implements Serializable
{
	protected int idCatalogo;

	/** 
	 * This attribute represents whether the primitive attribute idCatalogo is null.
	 */
	protected boolean idCatalogoNull;

	/** 
	 * Sets the value of idCatalogo
	 */
	public void setIdCatalogo(int idCatalogo)
	{
		this.idCatalogo = idCatalogo;
	}

	/** 
	 * Gets the value of idCatalogo
	 */
	public int getIdCatalogo()
	{
		return idCatalogo;
	}

	/**
	 * Method 'CatalogoPk'
	 * 
	 */
	public CatalogoPk()
	{
	}

	/**
	 * Method 'CatalogoPk'
	 * 
	 * @param idCatalogo
	 */
	public CatalogoPk(final int idCatalogo)
	{
		this.idCatalogo = idCatalogo;
	}

	/** 
	 * Sets the value of idCatalogoNull
	 */
	public void setIdCatalogoNull(boolean idCatalogoNull)
	{
		this.idCatalogoNull = idCatalogoNull;
	}

	/** 
	 * Gets the value of idCatalogoNull
	 */
	public boolean isIdCatalogoNull()
	{
		return idCatalogoNull;
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
		
		if (!(_other instanceof CatalogoPk)) {
			return false;
		}
		
		final CatalogoPk _cast = (CatalogoPk) _other;
		if (idCatalogo != _cast.idCatalogo) {
			return false;
		}
		
		if (idCatalogoNull != _cast.idCatalogoNull) {
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
		_hashCode = 29 * _hashCode + idCatalogo;
		_hashCode = 29 * _hashCode + (idCatalogoNull ? 1 : 0);
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
		ret.append( "edu.co.sena.tiendaenlinea.dto.CatalogoPk: " );
		ret.append( "idCatalogo=" + idCatalogo );
		return ret.toString();
	}

}
