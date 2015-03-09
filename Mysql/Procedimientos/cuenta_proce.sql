-- procedimiento
DELIMITER /

create procedure tiendaenlinea.insert_cuenta(tipoDocumento varchar(50),numeroDocumento varchar(50),primerNombre varchar(50),segundoNombre varchar(50),primerApellido varchar(50),segundoApellido varchar(50),
contrasena varchar (50),email varchar(50),Usuario_idUsuario varchar(50))
begin
INSERT INTO tiendaenlinea.cuenta
(tipoDocumento,
numeroDocumento,
primerNombre,
segundoNombre,
primerApellido,
segundoApellido,
contrasena,
email,
Usuario_idUsuario)
VALUES
(tipoDocumento,
numeroDocumento,
primerNombre,
segundoNombre,
primerApellido,
segundoApellido,
contrasena,
email,
Usuario_idUsuario);
end/

call tiendaenlinea.insert_cuenta
("CC",
"1023082472",
"Carla",
"Aurora",
"Sanchez",
"Garzon",
"123453",
"carl12@hmail.com",
"Carla12")

