package pe.com.jalldos.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.jalldos.entity.Producto;
import pe.com.jalldos.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository repositorio;

    @Override
    public List<Producto> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<Producto> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<Producto> findById(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public Producto add(Producto p) {
        return repositorio.save(p);
    }

    @Override
    public Producto update(Producto p) {
        Producto objProducto = repositorio.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objProducto);
        return repositorio.save(objProducto);
    }

    @Override
    public Producto delete(Producto p) {
        Producto objproducto = repositorio.getById(p.getCodigo());
        objproducto.setEstado(false);
        return repositorio.save(objproducto);

    }

    @Override
    public List<Producto> buscar(String filtro) throws Exception {
        try {
            //List<Producto> producto = repositorio.findByNombre(filtro);   --- Otra forma de Buscar
            List<Producto> producto = repositorio.search(filtro);
            return producto;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
