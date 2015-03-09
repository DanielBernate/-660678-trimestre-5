create function tiendaenlinea.text6( s varchar(20))
returns char (50)
return concat('hola como estas',s,'!');

-- eliminar una funcion
drop function tiendaenlinea.text6;

-- muestra el contenido de la funcion o procedimiento

show create function tiendaenlinea.text6;

-- ejecutar  procedimiento
select tiendaenlinea.text6(' Daniel')

-- procedimiento
DELIMITER /

create procedure tiendaenlinea.Insert_producto(idProducto varchar(20),nombre varchar(100),marca varchar(50),
referencia varchar(50),descripcion varchar(200),material varchar(50),color varchar(45),cantidad int,
activo bool,precioUnitario float,descuento float,Categoria_idCategoria int ,
Catalogo_idCatalogo int)
begin
INSERT INTO tiendaenlinea.producto(
idProducto,
nombre,
marca,
referencia,
descripcion,
material,
color,
cantidad,
activo,
precioUnitario,
descuento,
Categoria_idCategoria,
Catalogo_idCatalogo)
VALUES
(idProducto,
nombre,
marca,
referencia,
descripcion,
material,
color,
cantidad,
activo,
precioUnitario,
descuento,
Categoria_idCategoria,
Catalogo_idCatalogo
);
end/
drop procedure tiendaenlinea.Insert_producto;

call tiendaenlinea.Insert_producto(
'H003',
'Violin acustico',
'Yamaha',
'Rst01',
'Espectacular diseno en forma unica ',
'Koa',
'Azul',
1,
true,
200000,
0,
8,
1
)

