
package pe.com.jalldos.service;

import java.util.List;
import java.util.Optional;
import pe.com.jalldos.entity.Cliente;

public interface ClienteService {
    
    List<Cliente> findAll();
    
    List<Cliente> findAllCustom();
    
    Optional<Cliente> findById(Long id);
    
    Cliente add(Cliente c);
    
    Cliente update(Cliente c);
    
    Cliente delete(Cliente c);
     
}
