
package pe.com.jalldos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.jalldos.entity.Distrito;

public interface DistritoRepository extends JpaRepository<Distrito, Long>{
    
    @Query("select d from Distrito d where d.estado=1")
    List<Distrito> findAllCustom();
    
}
