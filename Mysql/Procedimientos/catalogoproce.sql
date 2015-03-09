-- Procedimiento crear catalogo
DELIMITER/
CREATE procedure tiendaenlinea.insertarCatalogo(nombre varchar(45),descripcionCatalogo varchar(500) )
begin
INSERT INTO `tiendaenlinea`.`catalogo`
(`nombreCatalogo`,
`descripcion`)
VALUES
(nombre,
descripcionCatalogo);
end/