/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PC06
 */
@Entity
@Table(name = "PROFESIONAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Profesional.findAll", query = "SELECT p FROM Profesional p")
    , @NamedQuery(name = "Profesional.findByIdprf", query = "SELECT p FROM Profesional p WHERE p.idprf = :idprf")
    , @NamedQuery(name = "Profesional.findByNomppf", query = "SELECT p FROM Profesional p WHERE p.nomppf = :nomppf")
    , @NamedQuery(name = "Profesional.findByApepf", query = "SELECT p FROM Profesional p WHERE p.apepf = :apepf")
    , @NamedQuery(name = "Profesional.findByTipprof", query = "SELECT p FROM Profesional p WHERE p.tipprof = :tipprof")})
public class Profesional implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPRF")
    private BigDecimal idprf;
    @Size(max = 100)
    @Column(name = "NOMPPF")
    private String nomppf;
    @Size(max = 100)
    @Column(name = "APEPF")
    private String apepf;
    @Size(max = 100)
    @Column(name = "TIPPROF")
    private String tipprof;
    @OneToMany(mappedBy = "idprf")
    private List<Servico> servicoList;

    public Profesional() {
    }

    public Profesional(BigDecimal idprf) {
        this.idprf = idprf;
    }

    public BigDecimal getIdprf() {
        return idprf;
    }

    public void setIdprf(BigDecimal idprf) {
        this.idprf = idprf;
    }

    public String getNomppf() {
        return nomppf;
    }

    public void setNomppf(String nomppf) {
        this.nomppf = nomppf;
    }

    public String getApepf() {
        return apepf;
    }

    public void setApepf(String apepf) {
        this.apepf = apepf;
    }

    public String getTipprof() {
        return tipprof;
    }

    public void setTipprof(String tipprof) {
        this.tipprof = tipprof;
    }

    @XmlTransient
    public List<Servico> getServicoList() {
        return servicoList;
    }

    public void setServicoList(List<Servico> servicoList) {
        this.servicoList = servicoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprf != null ? idprf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profesional)) {
            return false;
        }
        Profesional other = (Profesional) object;
        if ((this.idprf == null && other.idprf != null) || (this.idprf != null && !this.idprf.equals(other.idprf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nomppf+","+apepf+"-"+tipprof;
    }
    
}
