package pe.com.jalldos.service;

import java.util.List;
import java.util.Optional;
import pe.com.jalldos.entity.Producto;

public interface ProductoService {

    List<Producto> findAll();

    List<Producto> findAllCustom();

    List<Producto> buscar(String filtro) throws Exception;

    Optional<Producto> findById(Long id);

    Producto add(Producto p);

    Producto update(Producto p);

    Producto delete(Producto p);

}
