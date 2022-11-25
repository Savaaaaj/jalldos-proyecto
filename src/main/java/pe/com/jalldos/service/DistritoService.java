
package pe.com.jalldos.service;

import java.util.List;
import java.util.Optional;
import pe.com.jalldos.entity.Distrito;

public interface DistritoService {
    
    List<Distrito> findAll(); 

    List<Distrito> findAllCustom();
    
    Optional<Distrito> findById(Long id);

    Distrito add(Distrito d);

    Distrito udpate(Distrito d);

    Distrito delete(Distrito d);
    
}
