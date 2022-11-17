
package pe.com.jalldos.service;

import java.util.List;
import java.util.Optional;
import pe.com.jalldos.entity.Categoria;

public interface CategoriaService {
    
    List<Categoria> findAll();
    
    List<Categoria> findAllCustom();
    
    Optional<Categoria> findById(Long id);
    
    Categoria add(Categoria c);
    
    Categoria update(Categoria c);
    
    Categoria delete(Categoria c);
    
}