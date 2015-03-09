-- Procedimiento Crear Item Carrito
delimiter/
create procedure tiendaenlinea.insertarItemCarrito(idProducto varchar(100), idCarrito int(11),cantidadPro int (11),
 costoUnitarioPro float, costoTotalItem float)
begin
INSERT INTO `tiendaenlinea`.`item_carrito`
(`Producto_idProducto`,
`CarritoDeCompras_idCarritoDeCompras`,
`cantidad`,
`costoUnitario`,
`costoTotal`)
VALUES
(idProducto,
idCarrito,
cantidadPro,
costoUnitarioPro,
costoTotalItem);
end/