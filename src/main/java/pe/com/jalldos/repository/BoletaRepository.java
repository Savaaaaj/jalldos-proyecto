
package pe.com.jalldos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.jalldos.entity.Boleta;


public interface BoletaRepository extends JpaRepository<Boleta, Long>{
    
    @Query("select b from Boleta b where b.estado=1")
    List<Boleta> findAllCustom();
    
}
