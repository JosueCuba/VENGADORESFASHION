package modelo.entidad;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidad.Servico;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-13T10:58:02")
@StaticMetamodel(Profesional.class)
public class Profesional_ { 

    public static volatile ListAttribute<Profesional, Servico> servicoList;
    public static volatile SingularAttribute<Profesional, String> apepf;
    public static volatile SingularAttribute<Profesional, String> tipprof;
    public static volatile SingularAttribute<Profesional, String> nomppf;
    public static volatile SingularAttribute<Profesional, BigDecimal> idprf;

}