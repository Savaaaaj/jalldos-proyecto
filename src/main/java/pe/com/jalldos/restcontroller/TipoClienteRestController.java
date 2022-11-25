
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
import pe.com.jalldos.entity.TipoCliente;
import pe.com.jalldos.service.TipoClienteService;

@RestController
@RequestMapping("/tipocliente")
public class TipoClienteRestController {
    
    @Autowired
    private TipoClienteService servicio;

    @GetMapping
    public List<TipoCliente> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<TipoCliente> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<TipoCliente> findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public TipoCliente add(@RequestBody TipoCliente t) {
        return servicio.add(t);
    }

    @PutMapping("/{id}")
    public TipoCliente update(@PathVariable Long id, @RequestBody TipoCliente t) {
        t.setCodigo(id);
        return servicio.update(t);
    }

    @DeleteMapping("/{id}")
    public TipoCliente delete(@PathVariable Long id) {
        TipoCliente objtipo = new TipoCliente();
        objtipo.setEstado(false);
        return servicio.delete(TipoCliente.builder().codigo(id).build());

    }
    
}
