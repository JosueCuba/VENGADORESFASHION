package modelo.entidad;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidad.Servico;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-13T10:58:02")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, BigDecimal> idpro;
    public static volatile SingularAttribute<Producto, String> nompro;
    public static volatile ListAttribute<Producto, Servico> servicoList;
    public static volatile SingularAttribute<Producto, String> descpro;

}