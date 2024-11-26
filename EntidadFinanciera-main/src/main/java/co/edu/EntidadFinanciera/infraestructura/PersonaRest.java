package co.edu.EntidadFinanciera.infraestructura;

import co.edu.EntidadFinanciera.domain.Persona; 
import co.edu.EntidadFinanciera.domain.PersonaService; 
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

public class PersonaRest { 
    
     @Autowired 
    PersonaService service; 
 
        @GetMapping("/persona")
    public List<Persona> listar() {
        return service.listar();
    }

    @PostMapping("/persona/add")
    public Persona agregar(@RequestBody Persona p) {
        return service.add(p);
    }

    @GetMapping("/persona/{id}")
    public Persona listarId(@PathVariable("id") int id) {
        return service.listarId(id);
    }

    @PutMapping("/persona/{id}")
    public Persona editar(@RequestBody Persona p, @PathVariable("id") int id) {
        p.setPersona_id(id);
        return service.edit(p);
    }
    
    @DeleteMapping("/persona/{id}")
    public Persona delete(@PathVariable("id") int id) {
        return service.delete(id);
    }
    
}
    