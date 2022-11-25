
package pe.com.jalldos.service;

import java.util.List;
import java.util.Optional;
import pe.com.jalldos.entity.DetalleBoleta;

public interface DetalleBoletaService {
    
    List<DetalleBoleta> findAll();
    
    Optional<DetalleBoleta> findById(Long id);
    
    DetalleBoleta add(DetalleBoleta dt);
    
    DetalleBoleta update(DetalleBoleta dt);
    
}
