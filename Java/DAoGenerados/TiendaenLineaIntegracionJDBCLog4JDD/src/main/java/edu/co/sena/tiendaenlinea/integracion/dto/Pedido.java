/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.integracion.dto;

import java.io.Serializable;
import java.util.*;

public class Pedido implements Serializable
{
	/** 
	 * This attribute maps to the column Factura_idFactura in the pedido table.
	 */
	protected int facturaIdfactura;

	/** 
	 * This attribute represents whether the attribute facturaIdfactura has been modified since being read from the database.
	 */
	protected boolean facturaIdfacturaModified = false;

	/** 
	 * This attribute maps to the column total in the pedido table.
	 */
	protected float total;

	/** 
	 * This attribute represents whether the attribute total has been modified since being read from the database.
	 */
	protected boolean totalModified = false;

	/** 
	 * This attribute maps to the column subtotal in the pedido table.
	 */
	protected float subtotal;

	/** 
	 * This attribute represents whether the attribute subtotal has been modified since being read from the database.
	 */
	protected boolean subtotalModified = false;

	/** 
	 * This attribute maps to the column impuestos in the pedido table.
	 */
	protected float impuestos;

	/** 
	 * This attribute represents whether the attribute impuestos has been modified since being read from the database.
	 */
	protected boolean impuestosModified = false;

	/**
	 * Method 'Pedido'
	 * 
	 */
	public Pedido()
	{
	}

	/**
	 * Method 'getFacturaIdfactura'
	 * 
	 * @return int
	 */
	public int getFacturaIdfactura()
	{
		return facturaIdfactura;
	}

	/**
	 * Method 'setFacturaIdfactura'
	 * 
	 * @param facturaIdfactura
	 */
	public void setFacturaIdfactura(int facturaIdfactura)
	{
		this.facturaIdfactura = facturaIdfactura;
		this.facturaIdfacturaModified = true;
	}

	/** 
	 * Sets the value of facturaIdfacturaModified
	 */
	public void setFacturaIdfacturaModified(boolean facturaIdfacturaModified)
	{
		this.facturaIdfacturaModified = facturaIdfacturaModified;
	}

	/** 
	 * Gets the value of facturaIdfacturaModified
	 */
	public boolean isFacturaIdfacturaModified()
	{
		return facturaIdfacturaModified;
	}

	/**
	 * Method 'getTotal'
	 * 
	 * @return float
	 */
	public float getTotal()
	{
		return total;
	}

	/**
	 * Method 'setTotal'
	 * 
	 * @param total
	 */
	public void setTotal(float total)
	{
		this.total = total;
		this.totalModified = true;
	}

	/** 
	 * Sets the value of totalModified
	 */
	public void setTotalModified(boolean totalModified)
	{
		this.totalModified = totalModified;
	}

	/** 
	 * Gets the value of totalModified
	 */
	public boolean isTotalModified()
	{
		return totalModified;
	}

	/**
	 * Method 'getSubtotal'
	 * 
	 * @return float
	 */
	public float getSubtotal()
	{
		return subtotal;
	}

	/**
	 * Method 'setSubtotal'
	 * 
	 * @param subtotal
	 */
	public void setSubtotal(float subtotal)
	{
		this.subtotal = subtotal;
		this.subtotalModified = true;
	}

	/** 
	 * Sets the value of subtotalModified
	 */
	public void setSubtotalModified(boolean subtotalModified)
	{
		this.subtotalModified = subtotalModified;
	}

	/** 
	 * Gets the value of subtotalModified
	 */
	public boolean isSubtotalModified()
	{
		return subtotalModified;
	}

	/**
	 * Method 'getImpuestos'
	 * 
	 * @return float
	 */
	public float getImpuestos()
	{
		return impuestos;
	}

	/**
	 * Method 'setImpuestos'
	 * 
	 * @param impuestos
	 */
	public void setImpuestos(float impuestos)
	{
		this.impuestos = impuestos;
		this.impuestosModified = true;
	}

	/** 
	 * Sets the value of impuestosModified
	 */
	public void setImpuestosModified(boolean impuestosModified)
	{
		this.impuestosModified = impuestosModified;
	}

	/** 
	 * Gets the value of impuestosModified
	 */
	public boolean isImpuestosModified()
	{
		return impuestosModified;
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
		
		if (!(_other instanceof Pedido)) {
			return false;
		}
		
		final Pedido _cast = (Pedido) _other;
		if (facturaIdfactura != _cast.facturaIdfactura) {
			return false;
		}
		
		if (facturaIdfacturaModified != _cast.facturaIdfacturaModified) {
			return false;
		}
		
		if (total != _cast.total) {
			return false;
		}
		
		if (totalModified != _cast.totalModified) {
			return false;
		}
		
		if (subtotal != _cast.subtotal) {
			return false;
		}
		
		if (subtotalModified != _cast.subtotalModified) {
			return false;
		}
		
		if (impuestos != _cast.impuestos) {
			return false;
		}
		
		if (impuestosModified != _cast.impuestosModified) {
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
		_hashCode = 29 * _hashCode + (facturaIdfacturaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(total);
		_hashCode = 29 * _hashCode + (totalModified ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(subtotal);
		_hashCode = 29 * _hashCode + (subtotalModified ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(impuestos);
		_hashCode = 29 * _hashCode + (impuestosModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return PedidoPk
	 */
	public PedidoPk createPk()
	{
		return new PedidoPk(facturaIdfactura);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.tiendaenlinea.dto.Pedido: " );
		ret.append( "facturaIdfactura=" + facturaIdfactura );
		ret.append( ", total=" + total );
		ret.append( ", subtotal=" + subtotal );
		ret.append( ", impuestos=" + impuestos );
		return ret.toString();
	}

}
