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
@Table(name = "PRODUCTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p")
    , @NamedQuery(name = "Producto.findByIdpro", query = "SELECT p FROM Producto p WHERE p.idpro = :idpro")
    , @NamedQuery(name = "Producto.findByNompro", query = "SELECT p FROM Producto p WHERE p.nompro = :nompro")
    , @NamedQuery(name = "Producto.findByDescpro", query = "SELECT p FROM Producto p WHERE p.descpro = :descpro")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPRO")
    private BigDecimal idpro;
    @Size(max = 100)
    @Column(name = "NOMPRO")
    private String nompro;
    @Size(max = 100)
    @Column(name = "DESCPRO")
    private String descpro;
    @OneToMany(mappedBy = "idpro")
    private List<Servico> servicoList;

    public Producto() {
    }

    public Producto(BigDecimal idpro) {
        this.idpro = idpro;
    }

    public BigDecimal getIdpro() {
        return idpro;
    }

    public void setIdpro(BigDecimal idpro) {
        this.idpro = idpro;
    }

    public String getNompro() {
        return nompro;
    }

    public void setNompro(String nompro) {
        this.nompro = nompro;
    }

    public String getDescpro() {
        return descpro;
    }

    public void setDescpro(String descpro) {
        this.descpro = descpro;
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
        hash += (idpro != null ? idpro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.idpro == null && other.idpro != null) || (this.idpro != null && !this.idpro.equals(other.idpro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nompro;
    }
    
}
