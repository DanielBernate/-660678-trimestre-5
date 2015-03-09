-- procedimiento
DELIMITER /

create procedure tiendaenlinea.insert_domicuenta(Cuenta_tipoDocumento varchar(10),Cuenta_numeroDocumento varchar(45),telefono varchar(11),
direccion varchar(100),barrio varchar(100),localidad varchar(100),Municipio_idMunicipio varchar(4))
begin
INSERT INTO tiendaenlinea.domicilio_cuenta
(Cuenta_tipoDocumento,
Cuenta_numeroDocumento,
telefono,
direccion,
barrio,
localidad,
Municipio_idMunicipio)
VALUES
(Cuenta_tipoDocumento,
Cuenta_numeroDocumento,
telefono,
direccion,
barrio,
localidad,
Municipio_idMunicipio);
end/

call tiendaenlinea.insert_domicuenta
("CC",
"1023082472",
"3115747473",
"Calle 45 R 3d 12 sur",
"Chaguaini",
"San isidro",
"F01")

