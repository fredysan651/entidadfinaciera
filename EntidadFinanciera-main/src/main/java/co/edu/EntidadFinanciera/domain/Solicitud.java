package co.edu.EntidadFinanciera.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "solicitud")
public class Solicitud {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int solicitud_id;
    
    @Column
    private String solicitud_fecha;
    
    @Column
    private String solicitud_estado;
    
    @Column
    private String persona_id;
    //holamundo
    ////////////////////////////////////////////////////

    public int getSolicitud_id() {
        return solicitud_id;
    }

    public void setSolicitud_id(int solicitud_id) {
        this.solicitud_id = solicitud_id;
    }

    public String getSolicitud_fecha() {
        return solicitud_fecha;
    }

    public void setSolicitud_fecha(String solicitud_fecha) {
        this.solicitud_fecha = solicitud_fecha;
    }

    public String getSolicitud_estado() {
        return solicitud_estado;
    }

    public void setSolicitud_estado(String solicitud_estado) {
        this.solicitud_estado = solicitud_estado;
    }
    
    public String getPersona_id(){
         return persona_id;
    }
    
    public void setPersona_id(String persona_id){
        this.persona_id = persona_id;
    }
     
}
