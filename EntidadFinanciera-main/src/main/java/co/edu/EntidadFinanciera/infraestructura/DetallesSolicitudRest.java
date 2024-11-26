package co.edu.EntidadFinanciera.infraestructura;

import co.edu.EntidadFinanciera.domain.DetallesSolicitud; 
import co.edu.EntidadFinanciera.domain.DetallesSolicitudService;
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.CrossOrigin; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController; 

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/entidadfinanciera"})

public class DetallesSolicitudRest {
    
    @Autowired
    DetallesSolicitudService dsservice;
    
    @GetMapping("/detallessolicitud")
    public List<DetallesSolicitud> ListarDS(){
        return dsservice.listar();
    }
    
        @PostMapping("/detallessolicitud/add")
    public DetallesSolicitud agregarDS(@RequestBody DetallesSolicitud p) {
        return dsservice.add(p);
    }
    
    @GetMapping("/detallessolicitud/{id}")
    public DetallesSolicitud listarIdDS(@PathVariable("id") int id) {
        return dsservice.listarId(id);
    }
    
    @PutMapping("/detallessolicitud/{id}")
    public DetallesSolicitud editarDS(@RequestBody DetallesSolicitud p, @PathVariable("id") int id) {
        p.setSolicitud_id(id);
        return dsservice.edit(p);
    }
    
    @DeleteMapping("/detallessolicitud/{id}")
    public DetallesSolicitud deleteDS(@PathVariable("id") int id) {
        return dsservice.delete(id);
    }
    
    
    // Hola Mundo 
}
