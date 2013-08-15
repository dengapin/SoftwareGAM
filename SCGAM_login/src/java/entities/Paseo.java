/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
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
 * @author Dennise
 */
@Entity
@Table(name = "paseo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paseo.findAll", query = "SELECT p FROM Paseo p"),
    @NamedQuery(name = "Paseo.findByIdPaseo", query = "SELECT p FROM Paseo p WHERE p.idPaseo = :idPaseo"),
    @NamedQuery(name = "Paseo.findByTema", query = "SELECT p FROM Paseo p WHERE p.tema = :tema"),
    @NamedQuery(name = "Paseo.findByCapacidad", query = "SELECT p FROM Paseo p WHERE p.capacidad = :capacidad"),
    @NamedQuery(name = "Paseo.findByDuracion", query = "SELECT p FROM Paseo p WHERE p.duracion = :duracion")})
public class Paseo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPaseo")
    private Integer idPaseo;
    @Size(max = 45)
    @Column(name = "Tema")
    private String tema;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Capacidad")
    private int capacidad;
    @Column(name = "Duracion")
    private Integer duracion;
    @JoinColumn(name = "id_vehiculo", referencedColumnName = "idVehiculo")
    @ManyToOne(optional = false)
    private Vehiculo idVehiculo;
    @JoinColumn(name = "id_user", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false)
    private Usuario idUser;

    public Paseo() {
    }

    public Paseo(Integer idPaseo) {
        this.idPaseo = idPaseo;
    }

    public Paseo(Integer idPaseo, int capacidad) {
        this.idPaseo = idPaseo;
        this.capacidad = capacidad;
    }

    public Integer getIdPaseo() {
        return idPaseo;
    }

    public void setIdPaseo(Integer idPaseo) {
        this.idPaseo = idPaseo;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Vehiculo getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Vehiculo idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public Usuario getIdUser() {
        return idUser;
    }

    public void setIdUser(Usuario idUser) {
        this.idUser = idUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPaseo != null ? idPaseo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paseo)) {
            return false;
        }
        Paseo other = (Paseo) object;
        if ((this.idPaseo == null && other.idPaseo != null) || (this.idPaseo != null && !this.idPaseo.equals(other.idPaseo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Paseo[ idPaseo=" + idPaseo + " ]";
    }
    
}
