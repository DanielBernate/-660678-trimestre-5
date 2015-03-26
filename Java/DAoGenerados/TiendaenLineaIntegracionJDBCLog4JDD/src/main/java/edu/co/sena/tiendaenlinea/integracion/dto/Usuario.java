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

public class Usuario implements Serializable
{
	/** 
	 * This attribute maps to the column idUsuario in the usuario table.
	 */
	protected String idUsuario;

	/** 
	 * This attribute represents whether the attribute idUsuario has been modified since being read from the database.
	 */
	protected boolean idUsuarioModified = false;

	/** 
	 * This attribute maps to the column contrasena in the usuario table.
	 */
	protected String contrasena;

	/** 
	 * This attribute represents whether the attribute contrasena has been modified since being read from the database.
	 */
	protected boolean contrasenaModified = false;

	/** 
	 * This attribute maps to the column rol in the usuario table.
	 */
	protected String rol;

	/** 
	 * This attribute represents whether the attribute rol has been modified since being read from the database.
	 */
	protected boolean rolModified = false;

	/** 
	 * This attribute maps to the column estado in the usuario table.
	 */
	protected String estado;

	/** 
	 * This attribute represents whether the attribute estado has been modified since being read from the database.
	 */
	protected boolean estadoModified = false;

	/**
	 * Method 'Usuario'
	 * 
	 */
	public Usuario()
	{
	}

	/**
	 * Method 'getIdUsuario'
	 * 
	 * @return String
	 */
	public String getIdUsuario()
	{
		return idUsuario;
	}

	/**
	 * Method 'setIdUsuario'
	 * 
	 * @param idUsuario
	 */
	public void setIdUsuario(String idUsuario)
	{
		this.idUsuario = idUsuario;
		this.idUsuarioModified = true;
	}

	/** 
	 * Sets the value of idUsuarioModified
	 */
	public void setIdUsuarioModified(boolean idUsuarioModified)
	{
		this.idUsuarioModified = idUsuarioModified;
	}

	/** 
	 * Gets the value of idUsuarioModified
	 */
	public boolean isIdUsuarioModified()
	{
		return idUsuarioModified;
	}

	/**
	 * Method 'getContrasena'
	 * 
	 * @return String
	 */
	public String getContrasena()
	{
		return contrasena;
	}

	/**
	 * Method 'setContrasena'
	 * 
	 * @param contrasena
	 */
	public void setContrasena(String contrasena)
	{
		this.contrasena = contrasena;
		this.contrasenaModified = true;
	}

	/** 
	 * Sets the value of contrasenaModified
	 */
	public void setContrasenaModified(boolean contrasenaModified)
	{
		this.contrasenaModified = contrasenaModified;
	}

	/** 
	 * Gets the value of contrasenaModified
	 */
	public boolean isContrasenaModified()
	{
		return contrasenaModified;
	}

	/**
	 * Method 'getRol'
	 * 
	 * @return String
	 */
	public String getRol()
	{
		return rol;
	}

	/**
	 * Method 'setRol'
	 * 
	 * @param rol
	 */
	public void setRol(String rol)
	{
		this.rol = rol;
		this.rolModified = true;
	}

	/** 
	 * Sets the value of rolModified
	 */
	public void setRolModified(boolean rolModified)
	{
		this.rolModified = rolModified;
	}

	/** 
	 * Gets the value of rolModified
	 */
	public boolean isRolModified()
	{
		return rolModified;
	}

	/**
	 * Method 'getEstado'
	 * 
	 * @return String
	 */
	public String getEstado()
	{
		return estado;
	}

	/**
	 * Method 'setEstado'
	 * 
	 * @param estado
	 */
	public void setEstado(String estado)
	{
		this.estado = estado;
		this.estadoModified = true;
	}

	/** 
	 * Sets the value of estadoModified
	 */
	public void setEstadoModified(boolean estadoModified)
	{
		this.estadoModified = estadoModified;
	}

	/** 
	 * Gets the value of estadoModified
	 */
	public boolean isEstadoModified()
	{
		return estadoModified;
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
		
		if (!(_other instanceof Usuario)) {
			return false;
		}
		
		final Usuario _cast = (Usuario) _other;
		if (idUsuario == null ? _cast.idUsuario != idUsuario : !idUsuario.equals( _cast.idUsuario )) {
			return false;
		}
		
		if (idUsuarioModified != _cast.idUsuarioModified) {
			return false;
		}
		
		if (contrasena == null ? _cast.contrasena != contrasena : !contrasena.equals( _cast.contrasena )) {
			return false;
		}
		
		if (contrasenaModified != _cast.contrasenaModified) {
			return false;
		}
		
		if (rol == null ? _cast.rol != rol : !rol.equals( _cast.rol )) {
			return false;
		}
		
		if (rolModified != _cast.rolModified) {
			return false;
		}
		
		if (estado == null ? _cast.estado != estado : !estado.equals( _cast.estado )) {
			return false;
		}
		
		if (estadoModified != _cast.estadoModified) {
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
		if (idUsuario != null) {
			_hashCode = 29 * _hashCode + idUsuario.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (idUsuarioModified ? 1 : 0);
		if (contrasena != null) {
			_hashCode = 29 * _hashCode + contrasena.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (contrasenaModified ? 1 : 0);
		if (rol != null) {
			_hashCode = 29 * _hashCode + rol.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (rolModified ? 1 : 0);
		if (estado != null) {
			_hashCode = 29 * _hashCode + estado.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (estadoModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return UsuarioPk
	 */
	public UsuarioPk createPk()
	{
		return new UsuarioPk(idUsuario);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.tiendaenlinea.dto.Usuario: " );
		ret.append( "idUsuario=" + idUsuario );
		ret.append( ", contrasena=" + contrasena );
		ret.append( ", rol=" + rol );
		ret.append( ", estado=" + estado );
		return ret.toString();
	}

}
