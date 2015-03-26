package edu.co.sena.tiendaenlinea.integracion.jpa.entities;

import edu.co.sena.tiendaenlinea.integracion.jpa.entities.DomicilioProveedor;
import edu.co.sena.tiendaenlinea.integracion.jpa.entities.Inventario;
import edu.co.sena.tiendaenlinea.integracion.jpa.entities.ProveedorPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-25T17:36:43")
@StaticMetamodel(Proveedor.class)
public class Proveedor_ { 

    public static volatile SingularAttribute<Proveedor, String> nombre;
    public static volatile ListAttribute<Proveedor, Inventario> inventarioList;
    public static volatile SingularAttribute<Proveedor, String> email;
    public static volatile SingularAttribute<Proveedor, DomicilioProveedor> domicilioProveedor;
    public static volatile SingularAttribute<Proveedor, String> telefono;
    public static volatile SingularAttribute<Proveedor, ProveedorPK> proveedorPK;

}