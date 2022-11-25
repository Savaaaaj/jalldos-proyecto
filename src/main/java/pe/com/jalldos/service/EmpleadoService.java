
package pe.com.jalldos.service;

import java.util.List;
import java.util.Optional;
import pe.com.jalldos.entity.Empleado;

public interface EmpleadoService {
    
    List<Empleado> findAll();
    
    List<Empleado> findAllCustom();
    
    Optional<Empleado> findById(Long id);
    
    Empleado add(Empleado e);
    
    Empleado update(Empleado e);
    
    Empleado delete(Empleado e);
    
}
