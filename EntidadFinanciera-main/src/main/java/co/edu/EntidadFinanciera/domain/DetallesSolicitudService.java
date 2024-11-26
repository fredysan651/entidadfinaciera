package co.edu.EntidadFinanciera.domain;

import java.util.List;


public interface DetallesSolicitudService {
    
    List<DetallesSolicitud> listar();

    DetallesSolicitud listarId(int id);

    DetallesSolicitud add(DetallesSolicitud p);

    DetallesSolicitud edit(DetallesSolicitud p);

    DetallesSolicitud delete(int id);
    
    
}
