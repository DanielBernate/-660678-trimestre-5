/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.jdbc;

import edu.co.sena.tiendaenlinea.dao.*;
import edu.co.sena.tiendaenlinea.factory.*;
import java.util.Date;
import edu.co.sena.tiendaenlinea.dto.*;
import edu.co.sena.tiendaenlinea.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class FacturaDaoImpl extends AbstractDAO implements FacturaDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT idFactura, fecha, total, Cuenta_tipoDocumento, Cuenta_numeroDocumento FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( idFactura, fecha, total, Cuenta_tipoDocumento, Cuenta_numeroDocumento ) VALUES ( ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET idFactura = ?, fecha = ?, total = ?, Cuenta_tipoDocumento = ?, Cuenta_numeroDocumento = ? WHERE idFactura = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE idFactura = ?";

	/** 
	 * Index of column idFactura
	 */
	protected static final int COLUMN_ID_FACTURA = 1;

	/** 
	 * Index of column fecha
	 */
	protected static final int COLUMN_FECHA = 2;

	/** 
	 * Index of column total
	 */
	protected static final int COLUMN_TOTAL = 3;

	/** 
	 * Index of column Cuenta_tipoDocumento
	 */
	protected static final int COLUMN_CUENTA_TIPODOCUMENTO = 4;

	/** 
	 * Index of column Cuenta_numeroDocumento
	 */
	protected static final int COLUMN_CUENTA_NUMERODOCUMENTO = 5;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 5;

	/** 
	 * Index of primary-key column idFactura
	 */
	protected static final int PK_COLUMN_ID_FACTURA = 1;

	/** 
	 * Inserts a new row in the factura table.
	 */
	public FacturaPk insert(Factura dto) throws FacturaDaoException
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
		
			stmt = conn.prepareStatement( SQL_INSERT, Statement.RETURN_GENERATED_KEYS );
			int index = 1;
			stmt.setInt( index++, dto.getIdFactura() );
			stmt.setTimestamp(index++, dto.getFecha()==null ? null : new java.sql.Timestamp( dto.getFecha().getTime() ) );
			stmt.setFloat( index++, dto.getTotal() );
			stmt.setString( index++, dto.getCuentaTipodocumento() );
			stmt.setString( index++, dto.getCuentaNumerodocumento() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdFactura( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new FacturaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the factura table.
	 */
	public void update(FacturaPk pk, Factura dto) throws FacturaDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_UPDATE + " with DTO: " + dto );
			stmt = conn.prepareStatement( SQL_UPDATE );
			int index=1;
			stmt.setInt( index++, dto.getIdFactura() );
			stmt.setTimestamp(index++, dto.getFecha()==null ? null : new java.sql.Timestamp( dto.getFecha().getTime() ) );
			stmt.setFloat( index++, dto.getTotal() );
			stmt.setString( index++, dto.getCuentaTipodocumento() );
			stmt.setString( index++, dto.getCuentaNumerodocumento() );
			stmt.setInt( 6, pk.getIdFactura() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new FacturaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the factura table.
	 */
	public void delete(FacturaPk pk) throws FacturaDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setInt( 1, pk.getIdFactura() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new FacturaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the factura table that matches the specified primary-key value.
	 */
	public Factura findByPrimaryKey(FacturaPk pk) throws FacturaDaoException
	{
		return findByPrimaryKey( pk.getIdFactura() );
	}

	/** 
	 * Returns all rows from the factura table that match the criteria 'idFactura = :idFactura'.
	 */
	public Factura findByPrimaryKey(int idFactura) throws FacturaDaoException
	{
		Factura ret[] = findByDynamicSelect( SQL_SELECT + " WHERE idFactura = ?", new Object[] {  new Integer(idFactura) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the factura table that match the criteria ''.
	 */
	public Factura[] findAll() throws FacturaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY idFactura", null );
	}

	/** 
	 * Returns all rows from the factura table that match the criteria 'Cuenta_tipoDocumento = :cuentaTipodocumento AND Cuenta_numeroDocumento = :cuentaNumerodocumento'.
	 */
	public Factura[] findByCuenta(String cuentaTipodocumento, String cuentaNumerodocumento) throws FacturaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Cuenta_tipoDocumento = ? AND Cuenta_numeroDocumento = ?", new Object[] { cuentaTipodocumento, cuentaNumerodocumento } );
	}

	/** 
	 * Returns all rows from the factura table that match the criteria 'idFactura = :idFactura'.
	 */
	public Factura[] findWhereIdFacturaEquals(int idFactura) throws FacturaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE idFactura = ? ORDER BY idFactura", new Object[] {  new Integer(idFactura) } );
	}

	/** 
	 * Returns all rows from the factura table that match the criteria 'fecha = :fecha'.
	 */
	public Factura[] findWhereFechaEquals(Date fecha) throws FacturaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE fecha = ? ORDER BY fecha", new Object[] { fecha==null ? null : new java.sql.Timestamp( fecha.getTime() ) } );
	}

	/** 
	 * Returns all rows from the factura table that match the criteria 'total = :total'.
	 */
	public Factura[] findWhereTotalEquals(float total) throws FacturaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE total = ? ORDER BY total", new Object[] {  new Float(total) } );
	}

	/** 
	 * Returns all rows from the factura table that match the criteria 'Cuenta_tipoDocumento = :cuentaTipodocumento'.
	 */
	public Factura[] findWhereCuentaTipodocumentoEquals(String cuentaTipodocumento) throws FacturaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Cuenta_tipoDocumento = ? ORDER BY Cuenta_tipoDocumento", new Object[] { cuentaTipodocumento } );
	}

	/** 
	 * Returns all rows from the factura table that match the criteria 'Cuenta_numeroDocumento = :cuentaNumerodocumento'.
	 */
	public Factura[] findWhereCuentaNumerodocumentoEquals(String cuentaNumerodocumento) throws FacturaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Cuenta_numeroDocumento = ? ORDER BY Cuenta_numeroDocumento", new Object[] { cuentaNumerodocumento } );
	}

	/**
	 * Method 'FacturaDaoImpl'
	 * 
	 */
	public FacturaDaoImpl()
	{
	}

	/**
	 * Method 'FacturaDaoImpl'
	 * 
	 * @param userConn
	 */
	public FacturaDaoImpl(final java.sql.Connection userConn)
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
		return "tiendaenlinea.factura";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Factura fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Factura dto = new Factura();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Factura[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Factura dto = new Factura();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Factura ret[] = new Factura[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Factura dto, ResultSet rs) throws SQLException
	{
		dto.setIdFactura( rs.getInt( COLUMN_ID_FACTURA ) );
		dto.setFecha( rs.getTimestamp(COLUMN_FECHA ) );
		dto.setTotal( rs.getFloat( COLUMN_TOTAL ) );
		dto.setCuentaTipodocumento( rs.getString( COLUMN_CUENTA_TIPODOCUMENTO ) );
		dto.setCuentaNumerodocumento( rs.getString( COLUMN_CUENTA_NUMERODOCUMENTO ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Factura dto)
	{
	}

	/** 
	 * Returns all rows from the factura table that match the specified arbitrary SQL statement
	 */
	public Factura[] findByDynamicSelect(String sql, Object[] sqlParams) throws FacturaDaoException
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
		
		
			System.out.println( "Executing " + SQL );
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
			_e.printStackTrace();
			throw new FacturaDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the factura table that match the specified arbitrary SQL statement
	 */
	public Factura[] findByDynamicWhere(String sql, Object[] sqlParams) throws FacturaDaoException
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
		
		
			System.out.println( "Executing " + SQL );
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
			_e.printStackTrace();
			throw new FacturaDaoException( "Exception: " + _e.getMessage(), _e );
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
