package co.edu.EntidadFinanciera.domain;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DetallesSolicitudServiceImp implements DetallesSolicitudService{
    
    @Autowired
    private DetallesSolicitudRepository ds_repositorio;
    
    @Override
    public List<DetallesSolicitud> listar(){
        return ds_repositorio.findAll();
    }

    @Override
    public DetallesSolicitud listarId(int id) {
        return ds_repositorio.findById(id);
    }

    @Override
    public DetallesSolicitud add(DetallesSolicitud p) {
        return ds_repositorio.save(p);
    }

    @Override
    public DetallesSolicitud edit(DetallesSolicitud p) {
        return ds_repositorio.save(p);
    }
    
    @Override
    public DetallesSolicitud delete(int id) {
        DetallesSolicitud detallessolicitud = ds_repositorio.findById(id);
        if (detallessolicitud != null) {
            ds_repositorio.delete(detallessolicitud);
        }
        return detallessolicitud;
    }    
    
}
