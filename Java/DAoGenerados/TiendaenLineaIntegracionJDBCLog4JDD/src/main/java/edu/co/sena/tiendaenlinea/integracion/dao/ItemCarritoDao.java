/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.tiendaenlinea.integracion.dao;

import edu.co.sena.tiendaenlinea.integracion.dto.ItemCarritoPk;
import edu.co.sena.tiendaenlinea.integracion.dto.ItemCarrito;
import edu.co.sena.tiendaenlinea.integracion.exceptions.ItemCarritoDaoException;

public interface ItemCarritoDao
{
	/** 
	 * Inserts a new row in the item_carrito table.
	 */
	public ItemCarritoPk insert(ItemCarrito dto) throws ItemCarritoDaoException;

	/** 
	 * Updates a single row in the item_carrito table.
	 */
	public void update(ItemCarritoPk pk, ItemCarrito dto) throws ItemCarritoDaoException;

	/** 
	 * Deletes a single row in the item_carrito table.
	 */
	public void delete(ItemCarritoPk pk) throws ItemCarritoDaoException;

	/** 
	 * Returns the rows from the item_carrito table that matches the specified primary-key value.
	 */
	public ItemCarrito findByPrimaryKey(ItemCarritoPk pk) throws ItemCarritoDaoException;

	/** 
	 * Returns all rows from the item_carrito table that match the criteria 'Producto_idProducto = :productoIdproducto AND CarritoDeCompras_idCarritoDeCompras = :carritodecomprasIdcarritodecompras'.
	 */
	public ItemCarrito findByPrimaryKey(String productoIdproducto, String carritodecomprasIdcarritodecompras) throws ItemCarritoDaoException;

	/** 
	 * Returns all rows from the item_carrito table that match the criteria ''.
	 */
	public ItemCarrito[] findAll() throws ItemCarritoDaoException;

	/** 
	 * Returns all rows from the item_carrito table that match the criteria 'CarritoDeCompras_idCarritoDeCompras = :carritodecomprasIdcarritodecompras'.
	 */
	public ItemCarrito[] findByCarritodecompras(String carritodecomprasIdcarritodecompras) throws ItemCarritoDaoException;

	/** 
	 * Returns all rows from the item_carrito table that match the criteria 'Producto_idProducto = :productoIdproducto'.
	 */
	public ItemCarrito[] findByProducto(String productoIdproducto) throws ItemCarritoDaoException;

	/** 
	 * Returns all rows from the item_carrito table that match the criteria 'Producto_idProducto = :productoIdproducto'.
	 */
	public ItemCarrito[] findWhereProductoIdproductoEquals(String productoIdproducto) throws ItemCarritoDaoException;

	/** 
	 * Returns all rows from the item_carrito table that match the criteria 'CarritoDeCompras_idCarritoDeCompras = :carritodecomprasIdcarritodecompras'.
	 */
	public ItemCarrito[] findWhereCarritodecomprasIdcarritodecomprasEquals(String carritodecomprasIdcarritodecompras) throws ItemCarritoDaoException;

	/** 
	 * Returns all rows from the item_carrito table that match the criteria 'cantidad = :cantidad'.
	 */
	public ItemCarrito[] findWhereCantidadEquals(int cantidad) throws ItemCarritoDaoException;

	/** 
	 * Returns all rows from the item_carrito table that match the criteria 'costoUnitario = :costoUnitario'.
	 */
	public ItemCarrito[] findWhereCostoUnitarioEquals(float costoUnitario) throws ItemCarritoDaoException;

	/** 
	 * Returns all rows from the item_carrito table that match the criteria 'costoTotal = :costoTotal'.
	 */
	public ItemCarrito[] findWhereCostoTotalEquals(float costoTotal) throws ItemCarritoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the item_carrito table that match the specified arbitrary SQL statement
	 */
	public ItemCarrito[] findByDynamicSelect(String sql, Object[] sqlParams) throws ItemCarritoDaoException;

	/** 
	 * Returns all rows from the item_carrito table that match the specified arbitrary SQL statement
	 */
	public ItemCarrito[] findByDynamicWhere(String sql, Object[] sqlParams) throws ItemCarritoDaoException;

}