-- Procedimiento Crear Pago
delimiter/
create procedure tiendaenlinea.insertarPago(idFactura int(11),numTar varchar(45), bancoPago varchar(100),
tipoCuenta varchar(20),tipoTransaccionPago varchar(10))
begin
INSERT INTO `tiendaenlinea`.`pago`
(`Factura_idFactura`,
`numTarCredito`,
`banco`,
`tipoCuentaTar`,
`tipoTransaccion`)
VALUES
(idFactura,
numTar,
bancoPago,
tipoCuenta,
tipoTransaccionPago);
end/