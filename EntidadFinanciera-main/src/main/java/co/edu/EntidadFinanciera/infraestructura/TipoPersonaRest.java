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

import co.edu.EntidadFinanciera.domain.TipoPersona;
import co.edu.EntidadFinanciera.domain.TipoPersonaService;
@CrossOrigin(origins = "*", maxAge = 3600) 
@RestController 
@RequestMapping({"/entidadfinanciera"})
public class TipoPersonaRest {
    @Autowired
    TipoPersonaService tpservice;
    
    @GetMapping("/tipopersona")
    public List<TipoPersona> listarTp() {
        return tpservice.listar();
    }
    
    @PostMapping("/tipopersona/add")
    public TipoPersona agregarTp(@RequestBody TipoPersona p) {
        return tpservice.add(p);
    }
    
    @GetMapping("/tipopersona/{id}")
    public TipoPersona listarIdTp(@PathVariable("id") int id) {
        return tpservice.listarId(id);
    }
    
    @PutMapping("/tipopersona/{id}")
    public TipoPersona editarTp(@RequestBody TipoPersona p, @PathVariable("id") int id) {
        p.setId_tp(id);
        return tpservice.edit(p);
    }
    
    @DeleteMapping("/tipopersona/{id}")
    public TipoPersona deleteTp(@PathVariable("id") int id) {
        return tpservice.delete(id);
    }
    
}

//Codigo