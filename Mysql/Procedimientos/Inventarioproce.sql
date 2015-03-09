-- Procedimiento crear Inventario
delimiter/
create procedure tiendaenlinea.insertarInventario(fechaCompra date, cantidadPro int(11),idProducto varchar(100),
 idProveedor varchar(45),tipoDeIdentificacionPro varchar(20) )
begin
INSERT INTO `tiendaenlinea`.`inventario`
(`fecha`,
`cantidad`,
`Producto_idProducto`,
`Proveedor_idProveedor`,
`Proveedor_tipoDeIdentificacion`)
VALUES
(fechaCompra,
cantidadPro,
idProducto,
idProveedor,
tipoDeIdentificacionPro);
end/