package edu.co.sena.tiendaenlinea.integracion.jpa.entities;

import edu.co.sena.tiendaenlinea.integracion.jpa.entities.DomicilioProveedorPK;
import edu.co.sena.tiendaenlinea.integracion.jpa.entities.Municipio;
import edu.co.sena.tiendaenlinea.integracion.jpa.entities.Proveedor;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-25T17:36:43")
@StaticMetamodel(DomicilioProveedor.class)
public class DomicilioProveedor_ { 

    public static volatile SingularAttribute<DomicilioProveedor, String> direccion;
    public static volatile SingularAttribute<DomicilioProveedor, String> localidad;
    public static volatile SingularAttribute<DomicilioProveedor, DomicilioProveedorPK> domicilioProveedorPK;
    public static volatile SingularAttribute<DomicilioProveedor, String> telefono;
    public static volatile SingularAttribute<DomicilioProveedor, String> barrio;
    public static volatile SingularAttribute<DomicilioProveedor, Proveedor> proveedor;
    public static volatile SingularAttribute<DomicilioProveedor, Municipio> municipioidMunicipio;

}