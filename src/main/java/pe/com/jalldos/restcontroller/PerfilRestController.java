
package pe.com.jalldos.restcontroller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.jalldos.entity.Perfil;
import pe.com.jalldos.service.PerfilService;

@RestController
@RequestMapping("perfil")

public class PerfilRestController {
    
    @Autowired
    private PerfilService servicio;
    
    @GetMapping
    public List<Perfil> findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<Perfil> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Perfil> findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PostMapping
    public Perfil add(@RequestBody Perfil p){
        return servicio.add(p);
    }
    
    @PutMapping("/{id}")
    public Perfil update(@PathVariable Long id, @RequestBody Perfil p){
        p.setCodigo(id);
        return servicio.update(p);
    }
    
    @DeleteMapping("/{id}")
    public Perfil delete(@PathVariable Long id){
        Perfil objperfil = new Perfil();
        objperfil.setEstado(false);
        return servicio.delete(Perfil.builder().codigo(id).build());
    }
    
}
