-- Procedimiento crear carrito de Compras
DELIMITER /
create procedure tiendaenlinea.insertarCarritoDeCompras(subtotalCarrito float, totalCarrito float, impuestosCarrito float)
  begin
  INSERT INTO `tiendaenlinea`.`carritodecompras`
(`subtotal`,
`precioTotal`,
`impuestos`)
VALUES
(subtotalCarrito,
totalCarrito,
impuestosCarrito);
end/