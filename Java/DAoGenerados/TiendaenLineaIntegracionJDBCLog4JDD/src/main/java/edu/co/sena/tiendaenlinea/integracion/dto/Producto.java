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

public class Producto implements Serializable
{
	/** 
	 * This attribute maps to the column idProducto in the producto table.
	 */
	protected String idProducto;

	/** 
	 * This attribute represents whether the attribute idProducto has been modified since being read from the database.
	 */
	protected boolean idProductoModified = false;

	/** 
	 * This attribute maps to the column nombre in the producto table.
	 */
	protected String nombre;

	/** 
	 * This attribute represents whether the attribute nombre has been modified since being read from the database.
	 */
	protected boolean nombreModified = false;

	/** 
	 * This attribute maps to the column marca in the producto table.
	 */
	protected String marca;

	/** 
	 * This attribute represents whether the attribute marca has been modified since being read from the database.
	 */
	protected boolean marcaModified = false;

	/** 
	 * This attribute maps to the column referencia in the producto table.
	 */
	protected String referencia;

	/** 
	 * This attribute represents whether the attribute referencia has been modified since being read from the database.
	 */
	protected boolean referenciaModified = false;

	/** 
	 * This attribute maps to the column descripcion in the producto table.
	 */
	protected String descripcion;

	/** 
	 * This attribute represents whether the attribute descripcion has been modified since being read from the database.
	 */
	protected boolean descripcionModified = false;

	/** 
	 * This attribute maps to the column material in the producto table.
	 */
	protected String material;

	/** 
	 * This attribute represents whether the attribute material has been modified since being read from the database.
	 */
	protected boolean materialModified = false;

	/** 
	 * This attribute maps to the column color in the producto table.
	 */
	protected String color;

	/** 
	 * This attribute represents whether the attribute color has been modified since being read from the database.
	 */
	protected boolean colorModified = false;

	/** 
	 * This attribute maps to the column foto in the producto table.
	 */
	protected byte[] foto;

	/** 
	 * This attribute represents whether the attribute foto has been modified since being read from the database.
	 */
	protected boolean fotoModified = false;

	/** 
	 * This attribute maps to the column cantidad in the producto table.
	 */
	protected int cantidad;

	/** 
	 * This attribute represents whether the attribute cantidad has been modified since being read from the database.
	 */
	protected boolean cantidadModified = false;

	/** 
	 * This attribute maps to the column activo in the producto table.
	 */
	protected short activo;

	/** 
	 * This attribute represents whether the attribute activo has been modified since being read from the database.
	 */
	protected boolean activoModified = false;

	/** 
	 * This attribute maps to the column precioUnitario in the producto table.
	 */
	protected float precioUnitario;

	/** 
	 * This attribute represents whether the attribute precioUnitario has been modified since being read from the database.
	 */
	protected boolean precioUnitarioModified = false;

	/** 
	 * This attribute maps to the column descuento in the producto table.
	 */
	protected float descuento;

	/** 
	 * This attribute represents whether the attribute descuento has been modified since being read from the database.
	 */
	protected boolean descuentoModified = false;

	/** 
	 * This attribute maps to the column Categoria_idCategoria in the producto table.
	 */
	protected int categoriaIdcategoria;

	/** 
	 * This attribute represents whether the attribute categoriaIdcategoria has been modified since being read from the database.
	 */
	protected boolean categoriaIdcategoriaModified = false;

	/** 
	 * This attribute maps to the column Catalogo_idCatalogo in the producto table.
	 */
	protected int catalogoIdcatalogo;

	/** 
	 * This attribute represents whether the attribute catalogoIdcatalogo has been modified since being read from the database.
	 */
	protected boolean catalogoIdcatalogoModified = false;

	/**
	 * Method 'Producto'
	 * 
	 */
	public Producto()
	{
	}

	/**
	 * Method 'getIdProducto'
	 * 
	 * @return String
	 */
	public String getIdProducto()
	{
		return idProducto;
	}

	/**
	 * Method 'setIdProducto'
	 * 
	 * @param idProducto
	 */
	public void setIdProducto(String idProducto)
	{
		this.idProducto = idProducto;
		this.idProductoModified = true;
	}

	/** 
	 * Sets the value of idProductoModified
	 */
	public void setIdProductoModified(boolean idProductoModified)
	{
		this.idProductoModified = idProductoModified;
	}

	/** 
	 * Gets the value of idProductoModified
	 */
	public boolean isIdProductoModified()
	{
		return idProductoModified;
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
	 * Method 'getMarca'
	 * 
	 * @return String
	 */
	public String getMarca()
	{
		return marca;
	}

	/**
	 * Method 'setMarca'
	 * 
	 * @param marca
	 */
	public void setMarca(String marca)
	{
		this.marca = marca;
		this.marcaModified = true;
	}

	/** 
	 * Sets the value of marcaModified
	 */
	public void setMarcaModified(boolean marcaModified)
	{
		this.marcaModified = marcaModified;
	}

	/** 
	 * Gets the value of marcaModified
	 */
	public boolean isMarcaModified()
	{
		return marcaModified;
	}

	/**
	 * Method 'getReferencia'
	 * 
	 * @return String
	 */
	public String getReferencia()
	{
		return referencia;
	}

	/**
	 * Method 'setReferencia'
	 * 
	 * @param referencia
	 */
	public void setReferencia(String referencia)
	{
		this.referencia = referencia;
		this.referenciaModified = true;
	}

	/** 
	 * Sets the value of referenciaModified
	 */
	public void setReferenciaModified(boolean referenciaModified)
	{
		this.referenciaModified = referenciaModified;
	}

	/** 
	 * Gets the value of referenciaModified
	 */
	public boolean isReferenciaModified()
	{
		return referenciaModified;
	}

	/**
	 * Method 'getDescripcion'
	 * 
	 * @return String
	 */
	public String getDescripcion()
	{
		return descripcion;
	}

	/**
	 * Method 'setDescripcion'
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
		this.descripcionModified = true;
	}

	/** 
	 * Sets the value of descripcionModified
	 */
	public void setDescripcionModified(boolean descripcionModified)
	{
		this.descripcionModified = descripcionModified;
	}

	/** 
	 * Gets the value of descripcionModified
	 */
	public boolean isDescripcionModified()
	{
		return descripcionModified;
	}

	/**
	 * Method 'getMaterial'
	 * 
	 * @return String
	 */
	public String getMaterial()
	{
		return material;
	}

	/**
	 * Method 'setMaterial'
	 * 
	 * @param material
	 */
	public void setMaterial(String material)
	{
		this.material = material;
		this.materialModified = true;
	}

	/** 
	 * Sets the value of materialModified
	 */
	public void setMaterialModified(boolean materialModified)
	{
		this.materialModified = materialModified;
	}

	/** 
	 * Gets the value of materialModified
	 */
	public boolean isMaterialModified()
	{
		return materialModified;
	}

	/**
	 * Method 'getColor'
	 * 
	 * @return String
	 */
	public String getColor()
	{
		return color;
	}

	/**
	 * Method 'setColor'
	 * 
	 * @param color
	 */
	public void setColor(String color)
	{
		this.color = color;
		this.colorModified = true;
	}

	/** 
	 * Sets the value of colorModified
	 */
	public void setColorModified(boolean colorModified)
	{
		this.colorModified = colorModified;
	}

	/** 
	 * Gets the value of colorModified
	 */
	public boolean isColorModified()
	{
		return colorModified;
	}

	/**
	 * Method 'getFoto'
	 * 
	 * @return byte[]
	 */
	public byte[] getFoto()
	{
		return foto;
	}

	/**
	 * Method 'setFoto'
	 * 
	 * @param foto
	 */
	public void setFoto(byte[] foto)
	{
		this.foto = foto;
		this.fotoModified = true;
	}

	/** 
	 * Sets the value of fotoModified
	 */
	public void setFotoModified(boolean fotoModified)
	{
		this.fotoModified = fotoModified;
	}

	/** 
	 * Gets the value of fotoModified
	 */
	public boolean isFotoModified()
	{
		return fotoModified;
	}

	/**
	 * Method 'getCantidad'
	 * 
	 * @return int
	 */
	public int getCantidad()
	{
		return cantidad;
	}

	/**
	 * Method 'setCantidad'
	 * 
	 * @param cantidad
	 */
	public void setCantidad(int cantidad)
	{
		this.cantidad = cantidad;
		this.cantidadModified = true;
	}

	/** 
	 * Sets the value of cantidadModified
	 */
	public void setCantidadModified(boolean cantidadModified)
	{
		this.cantidadModified = cantidadModified;
	}

	/** 
	 * Gets the value of cantidadModified
	 */
	public boolean isCantidadModified()
	{
		return cantidadModified;
	}

	/**
	 * Method 'getActivo'
	 * 
	 * @return short
	 */
	public short getActivo()
	{
		return activo;
	}

	/**
	 * Method 'setActivo'
	 * 
	 * @param activo
	 */
	public void setActivo(short activo)
	{
		this.activo = activo;
		this.activoModified = true;
	}

	/** 
	 * Sets the value of activoModified
	 */
	public void setActivoModified(boolean activoModified)
	{
		this.activoModified = activoModified;
	}

	/** 
	 * Gets the value of activoModified
	 */
	public boolean isActivoModified()
	{
		return activoModified;
	}

	/**
	 * Method 'getPrecioUnitario'
	 * 
	 * @return float
	 */
	public float getPrecioUnitario()
	{
		return precioUnitario;
	}

	/**
	 * Method 'setPrecioUnitario'
	 * 
	 * @param precioUnitario
	 */
	public void setPrecioUnitario(float precioUnitario)
	{
		this.precioUnitario = precioUnitario;
		this.precioUnitarioModified = true;
	}

	/** 
	 * Sets the value of precioUnitarioModified
	 */
	public void setPrecioUnitarioModified(boolean precioUnitarioModified)
	{
		this.precioUnitarioModified = precioUnitarioModified;
	}

	/** 
	 * Gets the value of precioUnitarioModified
	 */
	public boolean isPrecioUnitarioModified()
	{
		return precioUnitarioModified;
	}

	/**
	 * Method 'getDescuento'
	 * 
	 * @return float
	 */
	public float getDescuento()
	{
		return descuento;
	}

	/**
	 * Method 'setDescuento'
	 * 
	 * @param descuento
	 */
	public void setDescuento(float descuento)
	{
		this.descuento = descuento;
		this.descuentoModified = true;
	}

	/** 
	 * Sets the value of descuentoModified
	 */
	public void setDescuentoModified(boolean descuentoModified)
	{
		this.descuentoModified = descuentoModified;
	}

	/** 
	 * Gets the value of descuentoModified
	 */
	public boolean isDescuentoModified()
	{
		return descuentoModified;
	}

	/**
	 * Method 'getCategoriaIdcategoria'
	 * 
	 * @return int
	 */
	public int getCategoriaIdcategoria()
	{
		return categoriaIdcategoria;
	}

	/**
	 * Method 'setCategoriaIdcategoria'
	 * 
	 * @param categoriaIdcategoria
	 */
	public void setCategoriaIdcategoria(int categoriaIdcategoria)
	{
		this.categoriaIdcategoria = categoriaIdcategoria;
		this.categoriaIdcategoriaModified = true;
	}

	/** 
	 * Sets the value of categoriaIdcategoriaModified
	 */
	public void setCategoriaIdcategoriaModified(boolean categoriaIdcategoriaModified)
	{
		this.categoriaIdcategoriaModified = categoriaIdcategoriaModified;
	}

	/** 
	 * Gets the value of categoriaIdcategoriaModified
	 */
	public boolean isCategoriaIdcategoriaModified()
	{
		return categoriaIdcategoriaModified;
	}

	/**
	 * Method 'getCatalogoIdcatalogo'
	 * 
	 * @return int
	 */
	public int getCatalogoIdcatalogo()
	{
		return catalogoIdcatalogo;
	}

	/**
	 * Method 'setCatalogoIdcatalogo'
	 * 
	 * @param catalogoIdcatalogo
	 */
	public void setCatalogoIdcatalogo(int catalogoIdcatalogo)
	{
		this.catalogoIdcatalogo = catalogoIdcatalogo;
		this.catalogoIdcatalogoModified = true;
	}

	/** 
	 * Sets the value of catalogoIdcatalogoModified
	 */
	public void setCatalogoIdcatalogoModified(boolean catalogoIdcatalogoModified)
	{
		this.catalogoIdcatalogoModified = catalogoIdcatalogoModified;
	}

	/** 
	 * Gets the value of catalogoIdcatalogoModified
	 */
	public boolean isCatalogoIdcatalogoModified()
	{
		return catalogoIdcatalogoModified;
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
		
		if (!(_other instanceof Producto)) {
			return false;
		}
		
		final Producto _cast = (Producto) _other;
		if (idProducto == null ? _cast.idProducto != idProducto : !idProducto.equals( _cast.idProducto )) {
			return false;
		}
		
		if (idProductoModified != _cast.idProductoModified) {
			return false;
		}
		
		if (nombre == null ? _cast.nombre != nombre : !nombre.equals( _cast.nombre )) {
			return false;
		}
		
		if (nombreModified != _cast.nombreModified) {
			return false;
		}
		
		if (marca == null ? _cast.marca != marca : !marca.equals( _cast.marca )) {
			return false;
		}
		
		if (marcaModified != _cast.marcaModified) {
			return false;
		}
		
		if (referencia == null ? _cast.referencia != referencia : !referencia.equals( _cast.referencia )) {
			return false;
		}
		
		if (referenciaModified != _cast.referenciaModified) {
			return false;
		}
		
		if (descripcion == null ? _cast.descripcion != descripcion : !descripcion.equals( _cast.descripcion )) {
			return false;
		}
		
		if (descripcionModified != _cast.descripcionModified) {
			return false;
		}
		
		if (material == null ? _cast.material != material : !material.equals( _cast.material )) {
			return false;
		}
		
		if (materialModified != _cast.materialModified) {
			return false;
		}
		
		if (color == null ? _cast.color != color : !color.equals( _cast.color )) {
			return false;
		}
		
		if (colorModified != _cast.colorModified) {
			return false;
		}
		
		if (foto == null ? _cast.foto != foto : !foto.equals( _cast.foto )) {
			return false;
		}
		
		if (fotoModified != _cast.fotoModified) {
			return false;
		}
		
		if (cantidad != _cast.cantidad) {
			return false;
		}
		
		if (cantidadModified != _cast.cantidadModified) {
			return false;
		}
		
		if (activo != _cast.activo) {
			return false;
		}
		
		if (activoModified != _cast.activoModified) {
			return false;
		}
		
		if (precioUnitario != _cast.precioUnitario) {
			return false;
		}
		
		if (precioUnitarioModified != _cast.precioUnitarioModified) {
			return false;
		}
		
		if (descuento != _cast.descuento) {
			return false;
		}
		
		if (descuentoModified != _cast.descuentoModified) {
			return false;
		}
		
		if (categoriaIdcategoria != _cast.categoriaIdcategoria) {
			return false;
		}
		
		if (categoriaIdcategoriaModified != _cast.categoriaIdcategoriaModified) {
			return false;
		}
		
		if (catalogoIdcatalogo != _cast.catalogoIdcatalogo) {
			return false;
		}
		
		if (catalogoIdcatalogoModified != _cast.catalogoIdcatalogoModified) {
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
		
		_hashCode = 29 * _hashCode + (idProductoModified ? 1 : 0);
		if (nombre != null) {
			_hashCode = 29 * _hashCode + nombre.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreModified ? 1 : 0);
		if (marca != null) {
			_hashCode = 29 * _hashCode + marca.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (marcaModified ? 1 : 0);
		if (referencia != null) {
			_hashCode = 29 * _hashCode + referencia.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (referenciaModified ? 1 : 0);
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (descripcionModified ? 1 : 0);
		if (material != null) {
			_hashCode = 29 * _hashCode + material.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (materialModified ? 1 : 0);
		if (color != null) {
			_hashCode = 29 * _hashCode + color.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (colorModified ? 1 : 0);
		if (foto != null) {
			_hashCode = 29 * _hashCode + foto.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fotoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + cantidad;
		_hashCode = 29 * _hashCode + (cantidadModified ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) activo;
		_hashCode = 29 * _hashCode + (activoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(precioUnitario);
		_hashCode = 29 * _hashCode + (precioUnitarioModified ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(descuento);
		_hashCode = 29 * _hashCode + (descuentoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + categoriaIdcategoria;
		_hashCode = 29 * _hashCode + (categoriaIdcategoriaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + catalogoIdcatalogo;
		_hashCode = 29 * _hashCode + (catalogoIdcatalogoModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ProductoPk
	 */
	public ProductoPk createPk()
	{
		return new ProductoPk(idProducto);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.tiendaenlinea.dto.Producto: " );
		ret.append( "idProducto=" + idProducto );
		ret.append( ", nombre=" + nombre );
		ret.append( ", marca=" + marca );
		ret.append( ", referencia=" + referencia );
		ret.append( ", descripcion=" + descripcion );
		ret.append( ", material=" + material );
		ret.append( ", color=" + color );
		ret.append( ", foto=" + foto );
		ret.append( ", cantidad=" + cantidad );
		ret.append( ", activo=" + activo );
		ret.append( ", precioUnitario=" + precioUnitario );
		ret.append( ", descuento=" + descuento );
		ret.append( ", categoriaIdcategoria=" + categoriaIdcategoria );
		ret.append( ", catalogoIdcatalogo=" + catalogoIdcatalogo );
		return ret.toString();
	}

}
