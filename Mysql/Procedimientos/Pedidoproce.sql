-- Procedimiento Crear Pedido
delimiter/
create procedure tiendaenlinea.insertarPedido(idFactura int(11), totalPe float, subtotalPe float, impuestosPe float)
begin
INSERT INTO `tiendaenlinea`.`pedido`
(`Factura_idFactura`,
`total`,
`subtotal`,
`impuestos`)
VALUES
(idFactura,
totalPe,
subtotalPe,
impuestosPe);
end/