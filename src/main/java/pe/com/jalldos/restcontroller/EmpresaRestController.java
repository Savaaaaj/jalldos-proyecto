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
import pe.com.jalldos.entity.Empresa;
import pe.com.jalldos.service.EmpresaService;

@RestController
@RequestMapping("/empresa")
public class EmpresaRestController {

    @Autowired
    private EmpresaService servicio;

    @GetMapping
    public List<Empresa> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<Empresa> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<Empresa> findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public Empresa add(@RequestBody Empresa e) {
        return servicio.add(e);
    }

    @PutMapping("/{id}")
    public Empresa update(@PathVariable Long id, @RequestBody Empresa e) {
        e.setCodigo(id);
        return servicio.update(e);
    }

    @DeleteMapping("/{id}")
    public Empresa delete(@PathVariable Long id) {
        Empresa objempresa = new Empresa();
        objempresa.setEstado(false);
        return servicio.delete(Empresa.builder().codigo(id).build());
    }

}
