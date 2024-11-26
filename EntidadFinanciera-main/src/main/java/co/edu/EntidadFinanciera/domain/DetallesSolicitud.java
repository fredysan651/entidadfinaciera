package co.edu.EntidadFinanciera.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalles_solicitud")
public class DetallesSolicitud {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int solicitud_id;
    
    @Column
    private int producto_id;
    
    //////////////////////////////////////////////////////////////
    public int getSolicitud_id(){
        return solicitud_id;
    }
    
    public void setSolicitud_id(int solicitud_id){
        this.solicitud_id = solicitud_id;
    }
    
        public int getProducto_id(){
        return producto_id;
    }
    
    public void setProducto_id(int producto_id){
        this.producto_id = producto_id;
    }
    
    
}
