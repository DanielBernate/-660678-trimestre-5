/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.integracion.jdbc;

import edu.co.sena.tiendaenlinea.integracion.dto.Producto;
import edu.co.sena.tiendaenlinea.integracion.dto.ProductoPk;
import edu.co.sena.tiendaenlinea.integracion.exceptions.ProductoDaoException;
import edu.co.sena.tiendaenlinea.integracion.dao.ProductoDao;
import java.sql.Connection;
import java.util.Collection;
import org.apache.log4j.Logger;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class ProductoDaoImpl extends AbstractDAO implements ProductoDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	protected static final Logger logger = Logger.getLogger( ProductoDaoImpl.class );

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT idProducto, nombre, marca, referencia, descripcion, material, color, foto, cantidad, activo, precioUnitario, descuento, Categoria_idCategoria, Catalogo_idCatalogo FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( idProducto, nombre, marca, referencia, descripcion, material, color, foto, cantidad, activo, precioUnitario, descuento, Categoria_idCategoria, Catalogo_idCatalogo ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET idProducto = ?, nombre = ?, marca = ?, referencia = ?, descripcion = ?, material = ?, color = ?, foto = ?, cantidad = ?, activo = ?, precioUnitario = ?, descuento = ?, Categoria_idCategoria = ?, Catalogo_idCatalogo = ? WHERE idProducto = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE idProducto = ?";

	/** 
	 * Index of column idProducto
	 */
	protected static final int COLUMN_ID_PRODUCTO = 1;

	/** 
	 * Index of column nombre
	 */
	protected static final int COLUMN_NOMBRE = 2;

	/** 
	 * Index of column marca
	 */
	protected static final int COLUMN_MARCA = 3;

	/** 
	 * Index of column referencia
	 */
	protected static final int COLUMN_REFERENCIA = 4;

	/** 
	 * Index of column descripcion
	 */
	protected static final int COLUMN_DESCRIPCION = 5;

	/** 
	 * Index of column material
	 */
	protected static final int COLUMN_MATERIAL = 6;

	/** 
	 * Index of column color
	 */
	protected static final int COLUMN_COLOR = 7;

	/** 
	 * Index of column foto
	 */
	protected static final int COLUMN_FOTO = 8;

	/** 
	 * Index of column cantidad
	 */
	protected static final int COLUMN_CANTIDAD = 9;

	/** 
	 * Index of column activo
	 */
	protected static final int COLUMN_ACTIVO = 10;

	/** 
	 * Index of column precioUnitario
	 */
	protected static final int COLUMN_PRECIO_UNITARIO = 11;

	/** 
	 * Index of column descuento
	 */
	protected static final int COLUMN_DESCUENTO = 12;

	/** 
	 * Index of column Categoria_idCategoria
	 */
	protected static final int COLUMN_CATEGORIA_IDCATEGORIA = 13;

	/** 
	 * Index of column Catalogo_idCatalogo
	 */
	protected static final int COLUMN_CATALOGO_IDCATALOGO = 14;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 14;

	/** 
	 * Index of primary-key column idProducto
	 */
	protected static final int PK_COLUMN_ID_PRODUCTO = 1;

	/** 
	 * Inserts a new row in the producto table.
	 */
	public ProductoPk insert(Producto dto) throws ProductoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			StringBuffer values = new StringBuffer();
			sql.append( "INSERT INTO " + getTableName() + " (" );
			int modifiedCount = 0;
			if (dto.isIdProductoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "idProducto" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNombreModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "nombre" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isMarcaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "marca" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isReferenciaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "referencia" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isDescripcionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "descripcion" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isMaterialModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "material" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isColorModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "color" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFotoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "foto" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isCantidadModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "cantidad" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isActivoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "activo" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isPrecioUnitarioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "precioUnitario" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isDescuentoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "descuento" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isCategoriaIdcategoriaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "Categoria_idCategoria" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isCatalogoIdcatalogoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "Catalogo_idCatalogo" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (modifiedCount==0) {
				// nothing to insert
				throw new IllegalStateException( "Nothing to insert" );
			}
		
			sql.append( ") VALUES (" );
			sql.append( values );
			sql.append( ")" );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdProductoModified()) {
				stmt.setString( index++, dto.getIdProducto() );
			}
		
			if (dto.isNombreModified()) {
				stmt.setString( index++, dto.getNombre() );
			}
		
			if (dto.isMarcaModified()) {
				stmt.setString( index++, dto.getMarca() );
			}
		
			if (dto.isReferenciaModified()) {
				stmt.setString( index++, dto.getReferencia() );
			}
		
			if (dto.isDescripcionModified()) {
				stmt.setString( index++, dto.getDescripcion() );
			}
		
			if (dto.isMaterialModified()) {
				stmt.setString( index++, dto.getMaterial() );
			}
		
			if (dto.isColorModified()) {
				stmt.setString( index++, dto.getColor() );
			}
		
			if (dto.isFotoModified()) {
				super.setBlobColumn(stmt, index++, dto.getFoto() );
			}
		
			if (dto.isCantidadModified()) {
				stmt.setInt( index++, dto.getCantidad() );
			}
		
			if (dto.isActivoModified()) {
				stmt.setShort( index++, dto.getActivo() );
			}
		
			if (dto.isPrecioUnitarioModified()) {
				stmt.setFloat( index++, dto.getPrecioUnitario() );
			}
		
			if (dto.isDescuentoModified()) {
				stmt.setFloat( index++, dto.getDescuento() );
			}
		
			if (dto.isCategoriaIdcategoriaModified()) {
				stmt.setInt( index++, dto.getCategoriaIdcategoria() );
			}
		
			if (dto.isCatalogoIdcatalogoModified()) {
				stmt.setInt( index++, dto.getCatalogoIdcatalogo() );
			}
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + sql.toString() + " with values: " + dto);
			}
		
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new ProductoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the producto table.
	 */
	public void update(ProductoPk pk, Producto dto) throws ProductoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			sql.append( "UPDATE " + getTableName() + " SET " );
			boolean modified = false;
			if (dto.isIdProductoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "idProducto=?" );
				modified=true;
			}
		
			if (dto.isNombreModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "nombre=?" );
				modified=true;
			}
		
			if (dto.isMarcaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "marca=?" );
				modified=true;
			}
		
			if (dto.isReferenciaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "referencia=?" );
				modified=true;
			}
		
			if (dto.isDescripcionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "descripcion=?" );
				modified=true;
			}
		
			if (dto.isMaterialModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "material=?" );
				modified=true;
			}
		
			if (dto.isColorModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "color=?" );
				modified=true;
			}
		
			if (dto.isFotoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "foto=?" );
				modified=true;
			}
		
			if (dto.isCantidadModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "cantidad=?" );
				modified=true;
			}
		
			if (dto.isActivoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "activo=?" );
				modified=true;
			}
		
			if (dto.isPrecioUnitarioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "precioUnitario=?" );
				modified=true;
			}
		
			if (dto.isDescuentoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "descuento=?" );
				modified=true;
			}
		
			if (dto.isCategoriaIdcategoriaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "Categoria_idCategoria=?" );
				modified=true;
			}
		
			if (dto.isCatalogoIdcatalogoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "Catalogo_idCatalogo=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE idProducto=?" );
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + sql.toString() + " with values: " + dto);
			}
		
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdProductoModified()) {
				stmt.setString( index++, dto.getIdProducto() );
			}
		
			if (dto.isNombreModified()) {
				stmt.setString( index++, dto.getNombre() );
			}
		
			if (dto.isMarcaModified()) {
				stmt.setString( index++, dto.getMarca() );
			}
		
			if (dto.isReferenciaModified()) {
				stmt.setString( index++, dto.getReferencia() );
			}
		
			if (dto.isDescripcionModified()) {
				stmt.setString( index++, dto.getDescripcion() );
			}
		
			if (dto.isMaterialModified()) {
				stmt.setString( index++, dto.getMaterial() );
			}
		
			if (dto.isColorModified()) {
				stmt.setString( index++, dto.getColor() );
			}
		
			if (dto.isFotoModified()) {
				super.setBlobColumn(stmt, index++, dto.getFoto() );
			}
		
			if (dto.isCantidadModified()) {
				stmt.setInt( index++, dto.getCantidad() );
			}
		
			if (dto.isActivoModified()) {
				stmt.setShort( index++, dto.getActivo() );
			}
		
			if (dto.isPrecioUnitarioModified()) {
				stmt.setFloat( index++, dto.getPrecioUnitario() );
			}
		
			if (dto.isDescuentoModified()) {
				stmt.setFloat( index++, dto.getDescuento() );
			}
		
			if (dto.isCategoriaIdcategoriaModified()) {
				stmt.setInt( index++, dto.getCategoriaIdcategoria() );
			}
		
			if (dto.isCatalogoIdcatalogoModified()) {
				stmt.setInt( index++, dto.getCatalogoIdcatalogo() );
			}
		
			stmt.setString( index++, pk.getIdProducto() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new ProductoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the producto table.
	 */
	public void delete(ProductoPk pk) throws ProductoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + SQL_DELETE + " with PK: " + pk);
			}
		
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setString( 1, pk.getIdProducto() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new ProductoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the producto table that matches the specified primary-key value.
	 */
	public Producto findByPrimaryKey(ProductoPk pk) throws ProductoDaoException
	{
		return findByPrimaryKey( pk.getIdProducto() );
	}

	/** 
	 * Returns all rows from the producto table that match the criteria 'idProducto = :idProducto'.
	 */
	public Producto findByPrimaryKey(String idProducto) throws ProductoDaoException
	{
		Producto ret[] = findByDynamicSelect( SQL_SELECT + " WHERE idProducto = ?", new Object[] { idProducto } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the producto table that match the criteria ''.
	 */
	public Producto[] findAll() throws ProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY idProducto", null );
	}

	/** 
	 * Returns all rows from the producto table that match the criteria 'Catalogo_idCatalogo = :catalogoIdcatalogo'.
	 */
	public Producto[] findByCatalogo(int catalogoIdcatalogo) throws ProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Catalogo_idCatalogo = ?", new Object[] {  new Integer(catalogoIdcatalogo) } );
	}

	/** 
	 * Returns all rows from the producto table that match the criteria 'Categoria_idCategoria = :categoriaIdcategoria'.
	 */
	public Producto[] findByCategoria(int categoriaIdcategoria) throws ProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Categoria_idCategoria = ?", new Object[] {  new Integer(categoriaIdcategoria) } );
	}

	/** 
	 * Returns all rows from the producto table that match the criteria 'idProducto = :idProducto'.
	 */
	public Producto[] findWhereIdProductoEquals(String idProducto) throws ProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE idProducto = ? ORDER BY idProducto", new Object[] { idProducto } );
	}

	/** 
	 * Returns all rows from the producto table that match the criteria 'nombre = :nombre'.
	 */
	public Producto[] findWhereNombreEquals(String nombre) throws ProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE nombre = ? ORDER BY nombre", new Object[] { nombre } );
	}

	/** 
	 * Returns all rows from the producto table that match the criteria 'marca = :marca'.
	 */
	public Producto[] findWhereMarcaEquals(String marca) throws ProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE marca = ? ORDER BY marca", new Object[] { marca } );
	}

	/** 
	 * Returns all rows from the producto table that match the criteria 'referencia = :referencia'.
	 */
	public Producto[] findWhereReferenciaEquals(String referencia) throws ProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE referencia = ? ORDER BY referencia", new Object[] { referencia } );
	}

	/** 
	 * Returns all rows from the producto table that match the criteria 'descripcion = :descripcion'.
	 */
	public Producto[] findWhereDescripcionEquals(String descripcion) throws ProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE descripcion = ? ORDER BY descripcion", new Object[] { descripcion } );
	}

	/** 
	 * Returns all rows from the producto table that match the criteria 'material = :material'.
	 */
	public Producto[] findWhereMaterialEquals(String material) throws ProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE material = ? ORDER BY material", new Object[] { material } );
	}

	/** 
	 * Returns all rows from the producto table that match the criteria 'color = :color'.
	 */
	public Producto[] findWhereColorEquals(String color) throws ProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE color = ? ORDER BY color", new Object[] { color } );
	}

	/** 
	 * Returns all rows from the producto table that match the criteria 'foto = :foto'.
	 */
	public Producto[] findWhereFotoEquals(byte[] foto) throws ProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE foto = ? ORDER BY foto", new Object[] { foto } );
	}

	/** 
	 * Returns all rows from the producto table that match the criteria 'cantidad = :cantidad'.
	 */
	public Producto[] findWhereCantidadEquals(int cantidad) throws ProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE cantidad = ? ORDER BY cantidad", new Object[] {  new Integer(cantidad) } );
	}

	/** 
	 * Returns all rows from the producto table that match the criteria 'activo = :activo'.
	 */
	public Producto[] findWhereActivoEquals(short activo) throws ProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE activo = ? ORDER BY activo", new Object[] {  new Short(activo) } );
	}

	/** 
	 * Returns all rows from the producto table that match the criteria 'precioUnitario = :precioUnitario'.
	 */
	public Producto[] findWherePrecioUnitarioEquals(float precioUnitario) throws ProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE precioUnitario = ? ORDER BY precioUnitario", new Object[] {  new Float(precioUnitario) } );
	}

	/** 
	 * Returns all rows from the producto table that match the criteria 'descuento = :descuento'.
	 */
	public Producto[] findWhereDescuentoEquals(float descuento) throws ProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE descuento = ? ORDER BY descuento", new Object[] {  new Float(descuento) } );
	}

	/** 
	 * Returns all rows from the producto table that match the criteria 'Categoria_idCategoria = :categoriaIdcategoria'.
	 */
	public Producto[] findWhereCategoriaIdcategoriaEquals(int categoriaIdcategoria) throws ProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Categoria_idCategoria = ? ORDER BY Categoria_idCategoria", new Object[] {  new Integer(categoriaIdcategoria) } );
	}

	/** 
	 * Returns all rows from the producto table that match the criteria 'Catalogo_idCatalogo = :catalogoIdcatalogo'.
	 */
	public Producto[] findWhereCatalogoIdcatalogoEquals(int catalogoIdcatalogo) throws ProductoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Catalogo_idCatalogo = ? ORDER BY Catalogo_idCatalogo", new Object[] {  new Integer(catalogoIdcatalogo) } );
	}

	/**
	 * Method 'ProductoDaoImpl'
	 * 
	 */
	public ProductoDaoImpl()
	{
	}

	/**
	 * Method 'ProductoDaoImpl'
	 * 
	 * @param userConn
	 */
	public ProductoDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "tiendaenlinea.producto";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Producto fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Producto dto = new Producto();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Producto[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Producto dto = new Producto();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Producto ret[] = new Producto[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Producto dto, ResultSet rs) throws SQLException
	{
		dto.setIdProducto( rs.getString( COLUMN_ID_PRODUCTO ) );
		dto.setNombre( rs.getString( COLUMN_NOMBRE ) );
		dto.setMarca( rs.getString( COLUMN_MARCA ) );
		dto.setReferencia( rs.getString( COLUMN_REFERENCIA ) );
		dto.setDescripcion( rs.getString( COLUMN_DESCRIPCION ) );
		dto.setMaterial( rs.getString( COLUMN_MATERIAL ) );
		dto.setColor( rs.getString( COLUMN_COLOR ) );
		dto.setFoto( super.getBlobColumn(rs, COLUMN_FOTO ) );
		dto.setCantidad( rs.getInt( COLUMN_CANTIDAD ) );
		dto.setActivo( rs.getShort( COLUMN_ACTIVO ) );
		dto.setPrecioUnitario( rs.getFloat( COLUMN_PRECIO_UNITARIO ) );
		dto.setDescuento( rs.getFloat( COLUMN_DESCUENTO ) );
		dto.setCategoriaIdcategoria( rs.getInt( COLUMN_CATEGORIA_IDCATEGORIA ) );
		dto.setCatalogoIdcatalogo( rs.getInt( COLUMN_CATALOGO_IDCATALOGO ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Producto dto)
	{
		dto.setIdProductoModified( false );
		dto.setNombreModified( false );
		dto.setMarcaModified( false );
		dto.setReferenciaModified( false );
		dto.setDescripcionModified( false );
		dto.setMaterialModified( false );
		dto.setColorModified( false );
		dto.setFotoModified( false );
		dto.setCantidadModified( false );
		dto.setActivoModified( false );
		dto.setPrecioUnitarioModified( false );
		dto.setDescuentoModified( false );
		dto.setCategoriaIdcategoriaModified( false );
		dto.setCatalogoIdcatalogoModified( false );
	}

	/** 
	 * Returns all rows from the producto table that match the specified arbitrary SQL statement
	 */
	public Producto[] findByDynamicSelect(String sql, Object[] sqlParams) throws ProductoDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + SQL);
			}
		
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new ProductoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the producto table that match the specified arbitrary SQL statement
	 */
	public Producto[] findByDynamicWhere(String sql, Object[] sqlParams) throws ProductoDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + SQL);
			}
		
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new ProductoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}
