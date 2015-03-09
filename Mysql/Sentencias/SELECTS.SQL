SELECT p.idProducto FROM tiendaenlinea.producto p;
SELECT distinct (p.idProducto) FROM tiendaenlinea.producto p;

SELECT p.idProducto, p.nombre FROM tiendaenlinea.producto p;

SELECT p.idProducto, p.nombre FROM tiendaenlinea.producto p where p.cantidad >5 order by p.nombre;
SELECT p.idProducto, p.nombre FROM tiendaenlinea.producto p where p.cantidad >5 order by p.nombre ASC;
SELECT p.idProducto, p.nombre FROM tiendaenlinea.producto p where p.cantidad >5 order by p.nombre DESC;

SELECT p.idProducto, p.nombre FROM tiendaenlinea.producto p where p.cantidad >5 order by p.nombre DESC limit 2;


SELECT p.idProducto, p.nombre FROM tiendaenlinea.producto p where p.cantidad between 5 and 10;

select * from tiendaenlinea.producto p where p.idProducto in ('A0001','A0007');

select * from tiendaenlinea.producto p where p.marca LIKE '%a';
select * from tiendaenlinea.producto p where p.marca LIKE '%a%';
select * from tiendaenlinea.producto p where p.marca LIKE '%a';

select i.Producto_idProducto, i.cantidad, i.costoUnitario, i.costoUnitario*i.cantidad as totalito 
from tiendaenlinea.item i where i.Pedido_Factura_idFactura=1;

select i.Producto_idProducto, i.cantidad, i.costoUnitario, i.costoUnitario*i.cantidad as totalito 
from tiendaenlinea.item i where i.Pedido_Factura_idFactura=2;

select i.Producto_idProducto, i.cantidad, i.costoUnitario, i.costoUnitario*i.cantidad as totalito 
from tiendaenlinea.item i where i.Pedido_Factura_idFactura=3;

select i.Producto_idProducto, i.cantidad, i.costoUnitario, i.costoUnitario*i.cantidad as totalito 
from tiendaenlinea.item i where i.Pedido_Factura_idFactura=4;

select i.Producto_idProducto, i.cantidad, i.costoUnitario, i.costoUnitario*i.cantidad as totalito 
from tiendaenlinea.item i where i.Pedido_Factura_idFactura=5;

select i.Producto_idProducto, i.cantidad, i.costoUnitario, i.costoUnitario*i.cantidad as totalito 
from tiendaenlinea.item i where i.Pedido_Factura_idFactura=6;

select i.Producto_idProducto, i.cantidad, i.costoUnitario, i.costoUnitario*i.cantidad as totalito 
from tiendaenlinea.item i where i.Pedido_Factura_idFactura=7;

select i.Producto_idProducto, i.cantidad, i.costoUnitario, i.costoUnitario*i.cantidad as totalito 
from tiendaenlinea.item i where i.Pedido_Factura_idFactura=8;

select i.Producto_idProducto, i.cantidad, i.costoUnitario, i.costoUnitario*i.cantidad as totalito 
from tiendaenlinea.item i where i.Pedido_Factura_idFactura=9;

select i.Producto_idProducto, i.cantidad, i.costoUnitario, i.costoUnitario*i.cantidad as totalito 
from tiendaenlinea.item i where i.Pedido_Factura_idFactura=10;


select * from tiendaenlinea.producto p where p.marca LIKE '%a';