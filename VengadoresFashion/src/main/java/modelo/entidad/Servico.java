/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC06
 */
@Entity
@Table(name = "SERVICO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servico.findAll", query = "SELECT s FROM Servico s")
    , @NamedQuery(name = "Servico.findByIdserv", query = "SELECT s FROM Servico s WHERE s.idserv = :idserv")
    , @NamedQuery(name = "Servico.findByTipserv", query = "SELECT s FROM Servico s WHERE s.tipserv = :tipserv")
    , @NamedQuery(name = "Servico.findByPrecserv", query = "SELECT s FROM Servico s WHERE s.precserv = :precserv")})
public class Servico implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSERV")
    private BigDecimal idserv;
    @Size(max = 20)
    @Column(name = "TIPSERV")
    private String tipserv;
    @Column(name = "PRECSERV")
    private BigInteger precserv;
    @JoinColumn(name = "IDCLI", referencedColumnName = "IDCLI")
    @ManyToOne
    private Cliente idcli;
    @JoinColumn(name = "IDPRO", referencedColumnName = "IDPRO")
    @ManyToOne
    private Producto idpro;
    @JoinColumn(name = "IDPRF", referencedColumnName = "IDPRF")
    @ManyToOne
    private Profesional idprf;

    public Servico() {
    }

    public Servico(BigDecimal idserv) {
        this.idserv = idserv;
    }

    public BigDecimal getIdserv() {
        return idserv;
    }

    public void setIdserv(BigDecimal idserv) {
        this.idserv = idserv;
    }

    public String getTipserv() {
        return tipserv;
    }

    public void setTipserv(String tipserv) {
        this.tipserv = tipserv;
    }

    public BigInteger getPrecserv() {
        return precserv;
    }

    public void setPrecserv(BigInteger precserv) {
        this.precserv = precserv;
    }

    public Cliente getIdcli() {
        return idcli;
    }

    public void setIdcli(Cliente idcli) {
        this.idcli = idcli;
    }

    public Producto getIdpro() {
        return idpro;
    }

    public void setIdpro(Producto idpro) {
        this.idpro = idpro;
    }

    public Profesional getIdprf() {
        return idprf;
    }

    public void setIdprf(Profesional idprf) {
        this.idprf = idprf;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idserv != null ? idserv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servico)) {
            return false;
        }
        Servico other = (Servico) object;
        if ((this.idserv == null && other.idserv != null) || (this.idserv != null && !this.idserv.equals(other.idserv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidad.Servico[ idserv=" + idserv + " ]";
    }
    
}
