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
 * This class represents the primary key of the pago table.
 */
public class PagoPk implements Serializable
{
	protected int facturaIdfactura;

	/** 
	 * This attribute represents whether the primitive attribute facturaIdfactura is null.
	 */
	protected boolean facturaIdfacturaNull;

	/** 
	 * Sets the value of facturaIdfactura
	 */
	public void setFacturaIdfactura(int facturaIdfactura)
	{
		this.facturaIdfactura = facturaIdfactura;
	}

	/** 
	 * Gets the value of facturaIdfactura
	 */
	public int getFacturaIdfactura()
	{
		return facturaIdfactura;
	}

	/**
	 * Method 'PagoPk'
	 * 
	 */
	public PagoPk()
	{
	}

	/**
	 * Method 'PagoPk'
	 * 
	 * @param facturaIdfactura
	 */
	public PagoPk(final int facturaIdfactura)
	{
		this.facturaIdfactura = facturaIdfactura;
	}

	/** 
	 * Sets the value of facturaIdfacturaNull
	 */
	public void setFacturaIdfacturaNull(boolean facturaIdfacturaNull)
	{
		this.facturaIdfacturaNull = facturaIdfacturaNull;
	}

	/** 
	 * Gets the value of facturaIdfacturaNull
	 */
	public boolean isFacturaIdfacturaNull()
	{
		return facturaIdfacturaNull;
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
		
		if (!(_other instanceof PagoPk)) {
			return false;
		}
		
		final PagoPk _cast = (PagoPk) _other;
		if (facturaIdfactura != _cast.facturaIdfactura) {
			return false;
		}
		
		if (facturaIdfacturaNull != _cast.facturaIdfacturaNull) {
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
		_hashCode = 29 * _hashCode + facturaIdfactura;
		_hashCode = 29 * _hashCode + (facturaIdfacturaNull ? 1 : 0);
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
		ret.append( "edu.co.sena.tiendaenlinea.dto.PagoPk: " );
		ret.append( "facturaIdfactura=" + facturaIdfactura );
		return ret.toString();
	}

}
