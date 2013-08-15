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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dennise
 */
@Entity
@Table(name = "rolmenu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rolmenu.findAll", query = "SELECT r FROM Rolmenu r"),
    @NamedQuery(name = "Rolmenu.findByIdRolMenu", query = "SELECT r FROM Rolmenu r WHERE r.idRolMenu = :idRolMenu")})
public class Rolmenu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRolMenu")
    private Integer idRolMenu;
    @JoinColumn(name = "id_rol", referencedColumnName = "idRol")
    @ManyToOne(optional = false)
    private Rol idRol;
    @JoinColumn(name = "id_menu", referencedColumnName = "idMenu")
    @ManyToOne(optional = false)
    private Menu idMenu;

    public Rolmenu() {
    }

    public Rolmenu(Integer idRolMenu) {
        this.idRolMenu = idRolMenu;
    }

    public Integer getIdRolMenu() {
        return idRolMenu;
    }

    public void setIdRolMenu(Integer idRolMenu) {
        this.idRolMenu = idRolMenu;
    }

    public Rol getIdRol() {
        return idRol;
    }

    public void setIdRol(Rol idRol) {
        this.idRol = idRol;
    }

    public Menu getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Menu idMenu) {
        this.idMenu = idMenu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRolMenu != null ? idRolMenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rolmenu)) {
            return false;
        }
        Rolmenu other = (Rolmenu) object;
        if ((this.idRolMenu == null && other.idRolMenu != null) || (this.idRolMenu != null && !this.idRolMenu.equals(other.idRolMenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Rolmenu[ idRolMenu=" + idRolMenu + " ]";
    }
    
}
