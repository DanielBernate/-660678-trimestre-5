-- procedimiento
DELIMITER /

create procedure tiendaenlinea.insert_provedor(idProveedor varchar(20),
tipoDeIdentificacion varchar (20),nombre varchar(100),telefono varchar(45),email varchar(45))
begin
INSERT INTO tiendaenlinea.proveedor
(idProveedor,
tipoDeIdentificacion,
nombre,
telefono,
email)
VALUES
(idProveedor,
tipoDeIdentificacion,
nombre,
telefono,
email);
end/
call tiendaenlinea.insert_provedor
("54321",
"CC",
"Pianos S.A",
"7721846",
"pianos@hotmail.com")