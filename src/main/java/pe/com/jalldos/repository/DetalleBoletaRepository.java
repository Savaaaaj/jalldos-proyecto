
package pe.com.jalldos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.jalldos.entity.DetalleBoleta;

public interface DetalleBoletaRepository extends JpaRepository<DetalleBoleta, Long>{
    
    @Query("select dt from DetalleBoleta dt where dt.codigo=1")
    List<DetalleBoleta> findAll();
    
}

