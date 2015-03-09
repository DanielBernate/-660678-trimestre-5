-- Procedimiento Crear Factura
delimiter/
create procedure tiendaenlinea.insertarFactura(fechaFac datetime, totalFac float,tipoDocumentoCuen varchar(10),
 numeroDocumentoCuen varchar(45))
begin
INSERT INTO `tiendaenlinea`.`factura`
(`fecha`,
`total`,
`Cuenta_tipoDocumento`,
`Cuenta_numeroDocumento`)
VALUES
(fechaFac,
totalFac,
tipoDocumentoCuen,
numeroDocumentoCuen);
end/