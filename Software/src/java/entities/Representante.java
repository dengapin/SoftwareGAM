/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
 * @author Dennise
 */
@Entity
@Table(name = "representante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Representante.findAll", query = "SELECT r FROM Representante r"),
    @NamedQuery(name = "Representante.findByIdRepresentante", query = "SELECT r FROM Representante r WHERE r.idRepresentante = :idRepresentante"),
    @NamedQuery(name = "Representante.findByNombres", query = "SELECT r FROM Representante r WHERE r.nombres = :nombres"),
    @NamedQuery(name = "Representante.findByApellidos", query = "SELECT r FROM Representante r WHERE r.apellidos = :apellidos"),
    @NamedQuery(name = "Representante.findByEdad", query = "SELECT r FROM Representante r WHERE r.edad = :edad"),
    @NamedQuery(name = "Representante.findByEmail", query = "SELECT r FROM Representante r WHERE r.email = :email"),
    @NamedQuery(name = "Representante.findBySexo", query = "SELECT r FROM Representante r WHERE r.sexo = :sexo"),
    @NamedQuery(name = "Representante.findByProfesion", query = "SELECT r FROM Representante r WHERE r.profesion = :profesion"),
    @NamedQuery(name = "Representante.findByObservacion", query = "SELECT r FROM Representante r WHERE r.observacion = :observacion")})
public class Representante implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRepresentante")
    private Integer idRepresentante;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Nombres")
    private String nombres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Apellidos")
    private String apellidos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Edad")
    private int edad;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Sexo")
    private String sexo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Profesion")
    private String profesion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Observacion")
    private String observacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iduserR")
    private Collection<Usuario> usuarioCollection;

    public Representante() {
    }

    public Representante(Integer idRepresentante) {
        this.idRepresentante = idRepresentante;
    }

    public Representante(Integer idRepresentante, String nombres, String apellidos, int edad, String email, String sexo, String profesion, String observacion) {
        this.idRepresentante = idRepresentante;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.email = email;
        this.sexo = sexo;
        this.profesion = profesion;
        this.observacion = observacion;
    }

    public Integer getIdRepresentante() {
        return idRepresentante;
    }

    public void setIdRepresentante(Integer idRepresentante) {
        this.idRepresentante = idRepresentante;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @XmlTransient
    public Collection<Usuario> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRepresentante != null ? idRepresentante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Representante)) {
            return false;
        }
        Representante other = (Representante) object;
        if ((this.idRepresentante == null && other.idRepresentante != null) || (this.idRepresentante != null && !this.idRepresentante.equals(other.idRepresentante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Representante[ idRepresentante=" + idRepresentante + " ]";
    }
    
}
