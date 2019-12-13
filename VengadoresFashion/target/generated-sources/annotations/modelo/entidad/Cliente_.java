package modelo.entidad;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidad.Servico;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-13T10:58:02")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> nomcli;
    public static volatile SingularAttribute<Cliente, BigDecimal> idcli;
    public static volatile SingularAttribute<Cliente, String> apecli;
    public static volatile ListAttribute<Cliente, Servico> servicoList;

}