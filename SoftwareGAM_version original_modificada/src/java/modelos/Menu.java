package modelos;
// Generated Jul 6, 2013 9:19:58 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Menu generated by hbm2java
 */
@Entity
@Table(name="menu"
    ,catalog="basesoftware"
)
public class Menu  implements java.io.Serializable {


     private Integer idMenu;
     private int nivel;
     private int orden;
     private String nombre;
     private String url;
     private String icono;
     private Byte estado;
     private Set rolmenus = new HashSet(0);

    public Menu() {
    }

	
    public Menu(int nivel, int orden, String nombre) {
        this.nivel = nivel;
        this.orden = orden;
        this.nombre = nombre;
    }
    public Menu(int nivel, int orden, String nombre, String url, String icono, Byte estado, Set rolmenus) {
       this.nivel = nivel;
       this.orden = orden;
       this.nombre = nombre;
       this.url = url;
       this.icono = icono;
       this.estado = estado;
       this.rolmenus = rolmenus;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="idMenu", unique=true, nullable=false)
    public Integer getIdMenu() {
        return this.idMenu;
    }
    
    public void setIdMenu(Integer idMenu) {
        this.idMenu = idMenu;
    }
    
    @Column(name="nivel", nullable=false)
    public int getNivel() {
        return this.nivel;
    }
    
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    @Column(name="orden", nullable=false)
    public int getOrden() {
        return this.orden;
    }
    
    public void setOrden(int orden) {
        this.orden = orden;
    }
    
    @Column(name="nombre", nullable=false, length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Column(name="url", length=10)
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    @Column(name="icono", length=10)
    public String getIcono() {
        return this.icono;
    }
    
    public void setIcono(String icono) {
        this.icono = icono;
    }
    
    @Column(name="estado")
    public Byte getEstado() {
        return this.estado;
    }
    
    public void setEstado(Byte estado) {
        this.estado = estado;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="menu")
    public Set getRolmenus() {
        return this.rolmenus;
    }
    
    public void setRolmenus(Set rolmenus) {
        this.rolmenus = rolmenus;
    }




}


