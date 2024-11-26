package co.edu.EntidadFinanciera.domain;

import java.util.List;
import org.springframework.data.repository.Repository;


public interface DetallesSolicitudRepository extends Repository<DetallesSolicitud, Integer>{ 
    
    List<DetallesSolicitud> findAll();

    DetallesSolicitud findById(int id);

    DetallesSolicitud save(DetallesSolicitud p);

    void delete(DetallesSolicitud p);
}
