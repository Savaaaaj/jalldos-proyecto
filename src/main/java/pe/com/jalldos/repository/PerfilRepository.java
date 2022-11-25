
package pe.com.jalldos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.jalldos.entity.Perfil;

public interface PerfilRepository extends JpaRepository<Perfil, Long>{
    
    @Query("select p from Perfil p where p.estado=1")
    List<Perfil> findAllCustom();

    
}
