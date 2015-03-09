-- procedimiento
DELIMITER /

create procedure tiendaenlinea.instrumentos_municipio(idMunicipio varchar(4),nombre varchar(45),Departamento_idDepartamento varchar(2))
begin
INSERT INTO tiendaenlinea.municipio
(idMunicipio,
nombre,
Departamento_idDepartamento)
VALUES
(idMunicipio,
nombre,
Departamento_idDepartamento);
end/
call tiendaenlinea.instrumentos_municipio
("F01",
"Molinos",
"A1")