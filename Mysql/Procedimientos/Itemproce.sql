-- Procedimiento Crear Item
delimiter/
create procedure tiendaenlinea.insertarItem(idProducto varchar(100),idFactura int(11), cantidadItem int(11),
costoUnitarioPro float, costoTotalItem float)
begin
INSERT INTO `tiendaenlinea`.`item`
(`Producto_idProducto`,
`Pedido_Factura_idFactura`,
`cantidad`,
`costoUnitario`,
`costoTotal`)
VALUES
(idProducto,
idFactura,
cantidadItem,
costoUnitarioPro,
costoTotalItem);
end/