package Entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "medicamentoinvima")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Medicamentoinvima.findAll", query = "SELECT m FROM Medicamentoinvima m")
    , @NamedQuery(name = "Medicamentoinvima.findByIdmedicamentoinvima", query = "SELECT m FROM Medicamentoinvima m WHERE m.idmedicamentoinvima = :idmedicamentoinvima")
    , @NamedQuery(name = "Medicamentoinvima.findByNombremedicamento", query = "SELECT m FROM Medicamentoinvima m WHERE m.nombremedicamento = :nombremedicamento")
    , @NamedQuery(name = "Medicamentoinvima.findByTitular", query = "SELECT m FROM Medicamentoinvima m WHERE m.titular = :titular")
    , @NamedQuery(name = "Medicamentoinvima.findByDescripcion", query = "SELECT m FROM Medicamentoinvima m WHERE m.descripcion = :descripcion")
    , @NamedQuery(name = "Medicamentoinvima.findByPresentacion", query = "SELECT m FROM Medicamentoinvima m WHERE m.presentacion = :presentacion")
    , @NamedQuery(name = "Medicamentoinvima.findByPrincipioactivo", query = "SELECT m FROM Medicamentoinvima m WHERE m.principioactivo = :principioactivo")})
public class Medicamentoinvima implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDMEDICAMENTOINVIMA")
    private Short idmedicamentoinvima;
    @Basic(optional = false)
    @Column(name = "NOMBREMEDICAMENTO")
    private String nombremedicamento;
    @Basic(optional = false)
    @Column(name = "TITULAR")
    private String titular;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "PRESENTACION")
    private String presentacion;
    @Basic(optional = false)
    @Column(name = "PRINCIPIOACTIVO")
    private String principioactivo;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idmedicamentoinvima")
    private Medicamento medicamento;

    public Medicamentoinvima() {
    }

    public Medicamentoinvima(Short idmedicamentoinvima) {
        this.idmedicamentoinvima = idmedicamentoinvima;
    }

    public Medicamentoinvima(String nombremedicamento, String titular, String descripcion, String presentacion, String principioactivo) {
        this.nombremedicamento = nombremedicamento;
        this.titular = titular;
        this.descripcion = descripcion;
        this.presentacion = presentacion;
        this.principioactivo = principioactivo;
    }

    public Short getIdmedicamentoinvima() {
        return idmedicamentoinvima;
    }

    public void setIdmedicamentoinvima(Short idmedicamentoinvima) {
        this.idmedicamentoinvima = idmedicamentoinvima;
    }

    public String getNombremedicamento() {
        return nombremedicamento;
    }

    public void setNombremedicamento(String nombremedicamento) {
        this.nombremedicamento = nombremedicamento;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getPrincipioactivo() {
        return principioactivo;
    }

    public void setPrincipioactivo(String principioactivo) {
        this.principioactivo = principioactivo;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmedicamentoinvima != null ? idmedicamentoinvima.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medicamentoinvima)) {
            return false;
        }
        Medicamentoinvima other = (Medicamentoinvima) object;
        if ((this.idmedicamentoinvima == null && other.idmedicamentoinvima != null) || (this.idmedicamentoinvima != null && !this.idmedicamentoinvima.equals(other.idmedicamentoinvima))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidad.Medicamentoinvima[ idmedicamentoinvima=" + idmedicamentoinvima + " ]";
    }

}
