package modelos;
// Generated Jun 26, 2013 5:38:42 PM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Conductor generated by hbm2java
 */
@Entity
@Table(name="conductor"
    ,catalog="basecgam"
)
public class Conductor  implements java.io.Serializable {


     private Integer idConductor;
     private String nombre;
     private String apellido;
     private String licencia;
     private String sexo;
     private String telefono;
     private String direccion;
     private String observacion;

    public Conductor() {
    }

    public Conductor(String nombre, String apellido, String licencia, String sexo, String telefono, String direccion, String observacion) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.licencia = licencia;
       this.sexo = sexo;
       this.telefono = telefono;
       this.direccion = direccion;
       this.observacion = observacion;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="idConductor", unique=true, nullable=false)
    public Integer getIdConductor() {
        return this.idConductor;
    }
    
    public void setIdConductor(Integer idConductor) {
        this.idConductor = idConductor;
    }
    
    @Column(name="Nombre", nullable=false, length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Column(name="Apellido", nullable=false, length=45)
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    @Column(name="Licencia", nullable=false, length=2)
    public String getLicencia() {
        return this.licencia;
    }
    
    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
    
    @Column(name="Sexo", nullable=false, length=45)
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    @Column(name="Telefono", nullable=false, length=45)
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Column(name="Direccion", nullable=false, length=45)
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Column(name="Observacion", nullable=false, length=100)
    public String getObservacion() {
        return this.observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }




}


