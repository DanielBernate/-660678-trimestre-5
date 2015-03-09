select count(*) from tiendaenlinea.item i where i.pedido_Factura_idFactura=1;

select  sum(i.costoTotal) as totalFactura from tiendaenlinea.item i where i.Pedido_Factura_idFactura =1;

delete from tiendaenlinea.item where Pedido_Factura_idFactura = 1 and Producto_idProducto ='A0001';

update tiendaenlinea.pedido p set p.subtotal =(select  sum(i.costoTotal) as totalFactura 
from tiendaenlinea.item i where i.Pedido_Factura_idFactura =1) where p.Factura_idFactura =1;

update tiendaenlinea.pedido p set p.subtotal =(select  sum(i.costoTotal) as totalFactura 
from tiendaenlinea.item i where i.Pedido_Factura_idFactura =1) where p.Factura_idFactura =2;

update tiendaenlinea.pedido p set p.subtotal =(select  sum(i.costoTotal) as totalFactura 
from tiendaenlinea.item i where i.Pedido_Factura_idFactura =1) where p.Factura_idFactura =3;

update tiendaenlinea.pedido p set p.subtotal =(select  sum(i.costoTotal) as totalFactura 
from tiendaenlinea.item i where i.Pedido_Factura_idFactura =1) where p.Factura_idFactura =4;

update tiendaenlinea.pedido p set p.subtotal =(select  sum(i.costoTotal) as totalFactura 
from tiendaenlinea.item i where i.Pedido_Factura_idFactura =1) where p.Factura_idFactura =5;

update tiendaenlinea.pedido p set p.subtotal =(select  sum(i.costoTotal) as totalFactura 
from tiendaenlinea.item i where i.Pedido_Factura_idFactura =1) where p.Factura_idFactura =6;

update tiendaenlinea.pedido p set p.subtotal =(select  sum(i.costoTotal) as totalFactura 
from tiendaenlinea.item i where i.Pedido_Factura_idFactura =1) where p.Factura_idFactura =7;

update tiendaenlinea.pedido p set p.subtotal =(select  sum(i.costoTotal) as totalFactura 
from tiendaenlinea.item i where i.Pedido_Factura_idFactura =1) where p.Factura_idFactura =8;

update tiendaenlinea.pedido p set p.subtotal =(select  sum(i.costoTotal) as totalFactura 
from tiendaenlinea.item i where i.Pedido_Factura_idFactura =1) where p.Factura_idFactura =9;

update tiendaenlinea.pedido p set p.subtotal =(select  sum(i.costoTotal) as totalFactura 
from tiendaenlinea.item i where i.Pedido_Factura_idFactura =1) where p.Factura_idFactura =10;



update tiendaenlinea.pedido p set p.impuestos = p.subtotal*0.16 where p.Factura_idFactura=1;

update tiendaenlinea.pedido p set p.impuestos = p.subtotal*0.16 where p.Factura_idFactura=2;

update tiendaenlinea.pedido p set p.impuestos = p.subtotal*0.16 where p.Factura_idFactura=3;

update tiendaenlinea.pedido p set p.impuestos = p.subtotal*0.16 where p.Factura_idFactura=4;

update tiendaenlinea.pedido p set p.impuestos = p.subtotal*0.16 where p.Factura_idFactura=5;

update tiendaenlinea.pedido p set p.impuestos = p.subtotal*0.16 where p.Factura_idFactura=6;

update tiendaenlinea.pedido p set p.impuestos = p.subtotal*0.16 where p.Factura_idFactura=7;

update tiendaenlinea.pedido p set p.impuestos = p.subtotal*0.16 where p.Factura_idFactura=8;

update tiendaenlinea.pedido p set p.impuestos = p.subtotal*0.16 where p.Factura_idFactura=9;

update tiendaenlinea.pedido p set p.impuestos = p.subtotal*0.16 where p.Factura_idFactura=10;

-- join 

select producto.nombre, item.cantidad, item.costoUnitario, item.costoTotal
from tiendaenlinea.factura factura, tiendaenlinea.pedido pedido, tiendaenlinea.item item, tiendaenlinea.producto producto 
where factura.idFactura = pedido.Factura_idFactura and pedido.Factura_idFactura =item.Pedido_Factura_idFactura 
and item.Producto_idProducto = producto.idProducto and factura.idFactura =1;


select producto.nombre, item.cantidad, item.costoUnitario, item.costoTotal
from tiendaenlinea.factura factura inner join tiendaenlinea.pedido pedido inner join tiendaenlinea.item item inner join  tiendaenlinea.producto producto 
on factura.idFactura = pedido.Factura_idFactura and pedido.Factura_idFactura =item.Pedido_Factura_idFactura 
and item.Producto_idProducto = producto.idProducto where factura.idFactura =1;











