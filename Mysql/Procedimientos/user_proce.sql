-- procedimiento
DELIMITER /

create procedure tiendaenlinea.Insert_usuario(idUsuario varchar(20),contrasena varchar(45),rol varchar(20),estado varchar(25) )
begin
INSERT INTO tiendaenlinea.usuario(
idUsuario,
contrasena,
rol,
estado)
VALUES
(idUsuario,
contrasena,
rol,
estado
);
end/


call tiendaenlinea.insert_usuario
("Carla12",
"123453",
"cliente",
"activo"
)