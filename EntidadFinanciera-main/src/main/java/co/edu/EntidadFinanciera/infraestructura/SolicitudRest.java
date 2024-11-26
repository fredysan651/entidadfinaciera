package co.edu.EntidadFinanciera.infraestructura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.EntidadFinanciera.domain.Solicitud;
import co.edu.EntidadFinanciera.domain.SolicitudService; 

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/entidadfinanciera"})

public class SolicitudRest {
    
        @Autowired
    SolicitudService sservice;
    
        @GetMapping("/solicitud")
    public List<Solicitud> listarS() {
        return sservice.listar();
    }
    
    @PostMapping("/solicitud/add")
    public Solicitud agregarS(@RequestBody Solicitud p) {
        return sservice.add(p);
    }
    
    @GetMapping("/solicitud/{id}")
    public Solicitud listarIdS(@PathVariable("id") int id) {
        return sservice.listarId(id);
    }
    
    @PutMapping("/solicitud/{id}")
    public Solicitud editarS(@RequestBody Solicitud p, @PathVariable("id") int id) {
        p.setSolicitud_id(id);
        return sservice.edit(p);
    }
    
    @DeleteMapping("/solicitud/{id}")
    public Solicitud deleteS(@PathVariable("id") int id) {
        return sservice.delete(id);
    }
        
}
 //calcular vectores