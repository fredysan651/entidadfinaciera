package co.edu.EntidadFinanciera.domain;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductoServiceImp implements ProductoService{
    
        @Autowired
    private ProductoRepository p_repositorio;

    @Override
    public List<Producto> listar() {
        return p_repositorio.findAll();
    }

    @Override
    public Producto listarId(int id) {
        return p_repositorio.findById(id);
    }

    @Override
    public Producto add(Producto p) {
        return p_repositorio.save(p);
    }

    @Override
    public Producto edit(Producto p) {
        return p_repositorio.save(p);
    }
    
    @Override
    public Producto delete(int id) {
        Producto producto = p_repositorio.findById(id);
        if (producto != null) {
            p_repositorio.delete(producto);
        }
        return producto;
    }
    
}
