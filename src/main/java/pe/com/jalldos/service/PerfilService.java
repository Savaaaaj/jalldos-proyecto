
package pe.com.jalldos.service;

import java.util.List;
import java.util.Optional;
import pe.com.jalldos.entity.Perfil;

public interface PerfilService {
    
    List<Perfil> findAll();

    List<Perfil> findAllCustom();

    Optional<Perfil> findById(Long id);

    Perfil add(Perfil p);

    Perfil update(Perfil p);

    Perfil delete(Perfil p);
    
}
