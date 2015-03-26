/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.dto;

import edu.co.sena.tiendaenlinea.dao.*;
import edu.co.sena.tiendaenlinea.factory.*;
import edu.co.sena.tiendaenlinea.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class Proveedor implements Serializable
{
	/** 
	 * This attribute maps to the column idProveedor in the proveedor table.
	 */
	protected String idProveedor;

	/** 
	 * This attribute represents whether the attribute idProveedor has been modified since being read from the database.
	 */
	protected boolean idProveedorModified = false;

	/** 
	 * This attribute maps to the column tipoDeIdentificacion in the proveedor table.
	 */
	protected String tipoDeIdentificacion;

	/** 
	 * This attribute represents whether the attribute tipoDeIdentificacion has been modified since being read from the database.
	 */
	protected boolean tipoDeIdentificacionModified = false;

	/** 
	 * This attribute maps to the column nombre in the proveedor table.
	 */
	protected String nombre;

	/** 
	 * This attribute represents whether the attribute nombre has been modified since being read from the database.
	 */
	protected boolean nombreModified = false;

	/** 
	 * This attribute maps to the column telefono in the proveedor table.
	 */
	protected String telefono;

	/** 
	 * This attribute represents whether the attribute telefono has been modified since being read from the database.
	 */
	protected boolean telefonoModified = false;

	/** 
	 * This attribute maps to the column email in the proveedor table.
	 */
	protected String email;

	/** 
	 * This attribute represents whether the attribute email has been modified since being read from the database.
	 */
	protected boolean emailModified = false;

	/**
	 * Method 'Proveedor'
	 * 
	 */
	public Proveedor()
	{
	}

	/**
	 * Method 'getIdProveedor'
	 * 
	 * @return String
	 */
	public String getIdProveedor()
	{
		return idProveedor;
	}

	/**
	 * Method 'setIdProveedor'
	 * 
	 * @param idProveedor
	 */
	public void setIdProveedor(String idProveedor)
	{
		this.idProveedor = idProveedor;
		this.idProveedorModified = true;
	}

	/** 
	 * Sets the value of idProveedorModified
	 */
	public void setIdProveedorModified(boolean idProveedorModified)
	{
		this.idProveedorModified = idProveedorModified;
	}

	/** 
	 * Gets the value of idProveedorModified
	 */
	public boolean isIdProveedorModified()
	{
		return idProveedorModified;
	}

	/**
	 * Method 'getTipoDeIdentificacion'
	 * 
	 * @return String
	 */
	public String getTipoDeIdentificacion()
	{
		return tipoDeIdentificacion;
	}

	/**
	 * Method 'setTipoDeIdentificacion'
	 * 
	 * @param tipoDeIdentificacion
	 */
	public void setTipoDeIdentificacion(String tipoDeIdentificacion)
	{
		this.tipoDeIdentificacion = tipoDeIdentificacion;
		this.tipoDeIdentificacionModified = true;
	}

	/** 
	 * Sets the value of tipoDeIdentificacionModified
	 */
	public void setTipoDeIdentificacionModified(boolean tipoDeIdentificacionModified)
	{
		this.tipoDeIdentificacionModified = tipoDeIdentificacionModified;
	}

	/** 
	 * Gets the value of tipoDeIdentificacionModified
	 */
	public boolean isTipoDeIdentificacionModified()
	{
		return tipoDeIdentificacionModified;
	}

	/**
	 * Method 'getNombre'
	 * 
	 * @return String
	 */
	public String getNombre()
	{
		return nombre;
	}

	/**
	 * Method 'setNombre'
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
		this.nombreModified = true;
	}

	/** 
	 * Sets the value of nombreModified
	 */
	public void setNombreModified(boolean nombreModified)
	{
		this.nombreModified = nombreModified;
	}

	/** 
	 * Gets the value of nombreModified
	 */
	public boolean isNombreModified()
	{
		return nombreModified;
	}

	/**
	 * Method 'getTelefono'
	 * 
	 * @return String
	 */
	public String getTelefono()
	{
		return telefono;
	}

	/**
	 * Method 'setTelefono'
	 * 
	 * @param telefono
	 */
	public void setTelefono(String telefono)
	{
		this.telefono = telefono;
		this.telefonoModified = true;
	}

	/** 
	 * Sets the value of telefonoModified
	 */
	public void setTelefonoModified(boolean telefonoModified)
	{
		this.telefonoModified = telefonoModified;
	}

	/** 
	 * Gets the value of telefonoModified
	 */
	public boolean isTelefonoModified()
	{
		return telefonoModified;
	}

	/**
	 * Method 'getEmail'
	 * 
	 * @return String
	 */
	public String getEmail()
	{
		return email;
	}

	/**
	 * Method 'setEmail'
	 * 
	 * @param email
	 */
	public void setEmail(String email)
	{
		this.email = email;
		this.emailModified = true;
	}

	/** 
	 * Sets the value of emailModified
	 */
	public void setEmailModified(boolean emailModified)
	{
		this.emailModified = emailModified;
	}

	/** 
	 * Gets the value of emailModified
	 */
	public boolean isEmailModified()
	{
		return emailModified;
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
		
		if (!(_other instanceof Proveedor)) {
			return false;
		}
		
		final Proveedor _cast = (Proveedor) _other;
		if (idProveedor == null ? _cast.idProveedor != idProveedor : !idProveedor.equals( _cast.idProveedor )) {
			return false;
		}
		
		if (idProveedorModified != _cast.idProveedorModified) {
			return false;
		}
		
		if (tipoDeIdentificacion == null ? _cast.tipoDeIdentificacion != tipoDeIdentificacion : !tipoDeIdentificacion.equals( _cast.tipoDeIdentificacion )) {
			return false;
		}
		
		if (tipoDeIdentificacionModified != _cast.tipoDeIdentificacionModified) {
			return false;
		}
		
		if (nombre == null ? _cast.nombre != nombre : !nombre.equals( _cast.nombre )) {
			return false;
		}
		
		if (nombreModified != _cast.nombreModified) {
			return false;
		}
		
		if (telefono == null ? _cast.telefono != telefono : !telefono.equals( _cast.telefono )) {
			return false;
		}
		
		if (telefonoModified != _cast.telefonoModified) {
			return false;
		}
		
		if (email == null ? _cast.email != email : !email.equals( _cast.email )) {
			return false;
		}
		
		if (emailModified != _cast.emailModified) {
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
		if (idProveedor != null) {
			_hashCode = 29 * _hashCode + idProveedor.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (idProveedorModified ? 1 : 0);
		if (tipoDeIdentificacion != null) {
			_hashCode = 29 * _hashCode + tipoDeIdentificacion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (tipoDeIdentificacionModified ? 1 : 0);
		if (nombre != null) {
			_hashCode = 29 * _hashCode + nombre.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreModified ? 1 : 0);
		if (telefono != null) {
			_hashCode = 29 * _hashCode + telefono.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (telefonoModified ? 1 : 0);
		if (email != null) {
			_hashCode = 29 * _hashCode + email.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (emailModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ProveedorPk
	 */
	public ProveedorPk createPk()
	{
		return new ProveedorPk(idProveedor, tipoDeIdentificacion);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.tiendaenlinea.dto.Proveedor: " );
		ret.append( "idProveedor=" + idProveedor );
		ret.append( ", tipoDeIdentificacion=" + tipoDeIdentificacion );
		ret.append( ", nombre=" + nombre );
		ret.append( ", telefono=" + telefono );
		ret.append( ", email=" + email );
		return ret.toString();
	}

}
