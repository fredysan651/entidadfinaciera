package co.edu.EntidadFinanciera.domain;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SolicitudServiceImp implements SolicitudService {
        @Autowired
    private SolicitudRepository s_repositorio;

    @Override
    public List<Solicitud> listar() {
        return s_repositorio.findAll();
    }

    @Override
    public Solicitud listarId(int id) {
        return s_repositorio.findById(id);
    }

    @Override
    public Solicitud add(Solicitud p) {
        return s_repositorio.save(p);
    }

    @Override
    public Solicitud edit(Solicitud p) {
        return s_repositorio.save(p);
    }

    @Override
    public Solicitud delete(int id) {
        Solicitud solicitud = s_repositorio.findById(id);
        if (solicitud != null) {
            s_repositorio.delete(solicitud);
        }
        return solicitud;
    }
  
}
