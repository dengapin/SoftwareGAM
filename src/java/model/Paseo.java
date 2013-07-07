package model;
// Generated Jun 26, 2013 11:41:45 PM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Paseo generated by hbm2java
 */
@Entity
@Table(name="paseo"
    ,schema="public"
)
public class Paseo  implements java.io.Serializable {


     private int idPaseo;
     private Personal personal;
     private String tema;
     private Integer capacidad;
     private String duracion;

    public Paseo() {
    }

	
    public Paseo(int idPaseo, Personal personal) {
        this.idPaseo = idPaseo;
        this.personal = personal;
    }
    public Paseo(int idPaseo, Personal personal, String tema, Integer capacidad, String duracion) {
       this.idPaseo = idPaseo;
       this.personal = personal;
       this.tema = tema;
       this.capacidad = capacidad;
       this.duracion = duracion;
    }
   
     @Id 
    
    @Column(name="idPaseo", unique=true, nullable=false)
    public int getIdPaseo() {
        return this.idPaseo;
    }
    
    public void setIdPaseo(int idPaseo) {
        this.idPaseo = idPaseo;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idPaseo", unique=true, nullable=false, insertable=false, updatable=false)
    public Personal getPersonal() {
        return this.personal;
    }
    
    public void setPersonal(Personal personal) {
        this.personal = personal;
    }
    
    @Column(name="tema", length=30)
    public String getTema() {
        return this.tema;
    }
    
    public void setTema(String tema) {
        this.tema = tema;
    }
    
    @Column(name="capacidad")
    public Integer getCapacidad() {
        return this.capacidad;
    }
    
    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
    
    @Column(name="duracion", length=7)
    public String getDuracion() {
        return this.duracion;
    }
    
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }




}

