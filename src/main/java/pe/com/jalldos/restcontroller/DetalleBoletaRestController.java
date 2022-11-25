
package pe.com.jalldos.restcontroller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.jalldos.entity.DetalleBoleta;
import pe.com.jalldos.service.DetalleBoletaService;

@RestController
@RequestMapping("/detalleboleta")
public class DetalleBoletaRestController {
    
    @Autowired
    private DetalleBoletaService servicio;
    
     @GetMapping
    public List<DetalleBoleta> findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<DetalleBoleta> findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PostMapping
    public DetalleBoleta add(@RequestBody DetalleBoleta dt){
        return servicio.add(dt);
    }
    
    @PutMapping("/{id}")
    public DetalleBoleta update(@PathVariable Long id, @RequestBody DetalleBoleta dt){
        dt.setCodigo(id);
        return servicio.update(dt);
    }
    
}
