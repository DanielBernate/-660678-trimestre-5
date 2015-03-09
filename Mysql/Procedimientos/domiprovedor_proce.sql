-- procedimiento
DELIMITER /

create procedure tiendaenlinea.inser_domicprovedor(Proveedor_idProveedor varchar(20),Proveedor_tipoDeIdentificacion varchar(20),
telefono varchar(20),direccion varchar(45),barrio varchar(45),localidad varchar(45),Municipio_idMunicipio varchar(4))
begin
INSERT INTO tiendaenlinea.domicilio_proveedor
(Proveedor_idProveedor,
Proveedor_tipoDeIdentificacion,
telefono,
direccion,
barrio,
localidad,
Municipio_idMunicipio)
VALUES
(Proveedor_idProveedor,
Proveedor_tipoDeIdentificacion,
telefono,
direccion,
barrio,
localidad,
Municipio_idMunicipio);
end/

call tiendaenlinea.inser_domicprovedor
("54321",
"CC",
"7721846",
"kr 30 1 de mayo",
"Villa mayor",
"Candelaria",
"F01")

