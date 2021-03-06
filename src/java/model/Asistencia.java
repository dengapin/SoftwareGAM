package model;
// Generated Jun 26, 2013 11:41:45 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Asistencia generated by hbm2java
 */
@Entity
@Table(name="asistencia"
    ,schema="public"
)
public class Asistencia  implements java.io.Serializable {


     private int idAsistencia;
     private Integer cantidad;
     private Date fecha;

    public Asistencia() {
    }

	
    public Asistencia(int idAsistencia) {
        this.idAsistencia = idAsistencia;
    }
    public Asistencia(int idAsistencia, Integer cantidad, Date fecha) {
       this.idAsistencia = idAsistencia;
       this.cantidad = cantidad;
       this.fecha = fecha;
    }
   
     @Id 
    
    @Column(name="idAsistencia", unique=true, nullable=false)
    public int getIdAsistencia() {
        return this.idAsistencia;
    }
    
    public void setIdAsistencia(int idAsistencia) {
        this.idAsistencia = idAsistencia;
    }
    
    @Column(name="cantidad")
    public Integer getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="fecha", length=13)
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }




}


