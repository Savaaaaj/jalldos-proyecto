
package pe.com.jalldos.restcontroller;


import java.util.List;
import java.util.Optional;
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
import pe.com.jalldos.entity.Cliente;
import pe.com.jalldos.service.ClienteService;


@RestController
@RequestMapping("/cliente")
@CrossOrigin(origins = "http://localhost:4200")

public class ClienteRestController {
    
    @Autowired
    private ClienteService servicio;
    
    @GetMapping
    public List<Cliente> findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<Cliente> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Cliente> findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PostMapping
    public Cliente add(@RequestBody Cliente c){
        return servicio.add(c);
    }
    
    @PutMapping("/{id}")
    public Cliente update(@PathVariable Long id, @RequestBody Cliente c){
        c.setCodigo(id);
        return servicio.update(c);
    } 
    
    @DeleteMapping("/{id}")
    public Cliente delete(@PathVariable Long id){
        Cliente objCliente = new Cliente();
        objCliente.setEstado(false);
        return servicio.delete(Cliente.builder().codigo(id).build());
        
    }
    
}
