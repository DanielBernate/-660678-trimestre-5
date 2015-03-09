-- procedimiento
DELIMITER /

create procedure tiendaenlinea.insert_departamento(idDepartamento varchar(2),nombre varchar(45))
begin
INSERT INTO tiendaenlinea.departamento
(idDepartamento,
nombre)
VALUES
(idDepartamento,
nombre);
end/
call tiendaenlinea.insert_departamento
("A1",
"CARIBE")