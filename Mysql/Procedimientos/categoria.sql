-- Procedimiento crear Categoria
delimiter/
create procedure tiendaenlinea.insertarCategoria(id int(11), nombre varchar(100), activo bool,parienteCategoria int(11))
begin
INSERT INTO `tiendaenlinea`.`categoria`
(`idCategoria`,
`nombreCategoria`,
`activa`,
`pariente`)
VALUES
(id,
nombre,
activo,
parienteCategoria);
end/