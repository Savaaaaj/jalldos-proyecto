
package pe.com.jalldos.service;

import java.util.List;
import java.util.Optional;
import pe.com.jalldos.entity.Empresa;

public interface EmpresaService {
    
    List<Empresa> findAll();
    
    List<Empresa> findAllCustom();
    
    Optional<Empresa> findById(Long id);
    
    Empresa add(Empresa e);
    
    Empresa update(Empresa e);
    
    Empresa delete(Empresa e);
    
}
