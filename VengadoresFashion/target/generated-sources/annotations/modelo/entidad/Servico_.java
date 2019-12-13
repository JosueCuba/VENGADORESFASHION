package modelo.entidad;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidad.Cliente;
import modelo.entidad.Producto;
import modelo.entidad.Profesional;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-13T10:58:02")
@StaticMetamodel(Servico.class)
public class Servico_ { 

    public static volatile SingularAttribute<Servico, BigDecimal> idserv;
    public static volatile SingularAttribute<Servico, Cliente> idcli;
    public static volatile SingularAttribute<Servico, Producto> idpro;
    public static volatile SingularAttribute<Servico, BigInteger> precserv;
    public static volatile SingularAttribute<Servico, String> tipserv;
    public static volatile SingularAttribute<Servico, Profesional> idprf;

}