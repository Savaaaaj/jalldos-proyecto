package pe.com.jalldos.restcontroller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.com.jalldos.entity.Producto;
import pe.com.jalldos.service.ProductoService;

@RestController
@RequestMapping("/producto")

public class ProductoRestController {

    @Autowired
    private ProductoService servicio;

    @GetMapping
    public List<Producto> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/buscar")
    public ResponseEntity<?> buscar(@RequestParam String filtro) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.buscar(filtro));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @GetMapping("/custom")
    public List<Producto> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<Producto> findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public Producto add(@RequestBody Producto p) {
        return servicio.add(p);
    }

    @PutMapping("/{id}")
    public Producto update(@PathVariable Long id, @RequestBody Producto p) {
        p.setCodigo(id);
        return servicio.update(p);
    }

    @DeleteMapping("/{id}")
    public Producto delete(@PathVariable Long id) {
        Producto objproducto = new Producto();
        objproducto.setEstado(false);
        return servicio.delete(Producto.builder().codigo(id).build());
    }

}
