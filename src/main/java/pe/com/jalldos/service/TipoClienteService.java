
package pe.com.jalldos.service;

import java.util.List;
import java.util.Optional;
import pe.com.jalldos.entity.TipoCliente;

public interface TipoClienteService {
    
    List<TipoCliente> findAll();

    List<TipoCliente> findAllCustom();

    Optional<TipoCliente> findById(Long id);

    TipoCliente add(TipoCliente t);

    TipoCliente update(TipoCliente t);

    TipoCliente delete(TipoCliente t);
    
}
