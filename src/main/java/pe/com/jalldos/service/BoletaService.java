
package pe.com.jalldos.service;

import java.util.List;
import java.util.Optional;
import pe.com.jalldos.entity.Boleta;


public interface BoletaService {
    
    List<Boleta> findAll();
    
    List<Boleta> findAllCustom();
    
    Optional<Boleta> findById(Long id);
    
    Boleta add(Boleta b);
    
    Boleta update(Boleta b);
    
    Boleta delete(Boleta b);
    
}
