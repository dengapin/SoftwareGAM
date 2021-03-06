package modelos;
// Generated Jun 26, 2013 4:50:24 PM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Personal generated by hbm2java
 */
@Entity
@Table(name="personal"    ,catalog="basecgam")
public class Personal  implements java.io.Serializable {


     private Integer idPersonal;
     private Rol rol;
     private String nombres;
     private String apellidos;
     private String edad;
     private String correo;
     private String sexo;
     private String direccion;
     private String telefono;
     private String profesion;
     private String cargo;
     private String instruccion;
     private String observaciones;
     private String usuario;
     private String clave;

    public Personal() {
    }

	
    public Personal(Rol rol, String nombres, String apellidos,String usuario, String clave, String edad, String sexo, String direccion, String telefono, String profesion, String cargo, String instruccion) {
        this.rol = rol;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.profesion = profesion;
        this.cargo = cargo;
        this.instruccion = instruccion;
        this.usuario= usuario;
        this.clave= clave;
    }
    public Personal(Rol rol, String usuario, String clave, String apellidos,String nombres, String edad, String correo, String sexo, String direccion, String telefono, String profesion, String cargo, String instruccion, String observaciones) {
       this.rol = rol;
       this.nombres = nombres;
       this.apellidos = apellidos;
       this.edad = edad;
       this.correo = correo;
       this.sexo = sexo;
       this.direccion = direccion;
       this.telefono = telefono;
       this.profesion = profesion;
       this.cargo = cargo;
       this.instruccion = instruccion;
       this.observaciones = observaciones;
       this.usuario = usuario;
       this.clave= clave;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id_Personal", unique=true, nullable=false)
    public Integer getIdPersonal() {
        return this.idPersonal;
    }
    
    public void setIdPersonal(Integer idPersonal) {
        this.idPersonal = idPersonal;
    }
    
    @Column(name="usuario", unique=true, nullable=false)
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    @Column(name="clave", unique=true, nullable=false)
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="rol_id", nullable=false)
    public Rol getRol() {
        return this.rol;
    }
    
    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
    @Column(name="Nombres", nullable=false, length=45)
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    @Column(name="Apellidos", nullable=false, length=45)
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    @Column(name="Edad", nullable=false, length=2)
    public String getEdad() {
        return this.edad;
    }
    
    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    @Column(name="Correo", length=45)
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    @Column(name="Sexo", nullable=false, length=45)
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    @Column(name="Direccion", nullable=false, length=45)
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Column(name="Telefono", nullable=false, length=45)
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Column(name="Profesion", nullable=false, length=20)
    public String getProfesion() {
        return this.profesion;
    }
    
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    @Column(name="Cargo", nullable=false, length=45)
    public String getCargo() {
        return this.cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Column(name="Instruccion", nullable=false, length=45)
    public String getInstruccion() {
        return this.instruccion;
    }
    
    public void setInstruccion(String instruccion) {
        this.instruccion = instruccion;
    }
    
    @Column(name="Observaciones", length=45)
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }




}


