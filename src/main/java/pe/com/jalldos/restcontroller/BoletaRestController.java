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
import pe.com.jalldos.entity.Boleta;
import pe.com.jalldos.service.BoletaService;


@RestController
@RequestMapping("/boleta")

public class BoletaRestController {

    @Autowired
    private BoletaService servicio;

    @GetMapping
    public List<Boleta> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<Boleta> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<Boleta> findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public Boleta add(@RequestBody Boleta b) {
        return servicio.add(b);
    }

    @PutMapping("/{id}")
    public Boleta update(@PathVariable Long id, @RequestBody Boleta b) {
        b.setCodigo(id);
        return servicio.update(b);
    }

    @DeleteMapping("/{id}")
    public Boleta delete(@PathVariable Long id) {
        Boleta objBoleta = new Boleta();
        objBoleta.setEstado(false);
        return servicio.delete(Boleta.builder().codigo(id).build());
    }

}
