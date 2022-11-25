
package pe.com.jalldos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.jalldos.entity.TipoCliente;

public interface TipoClienteRepository extends JpaRepository<TipoCliente, Long> {
    
    @Query("select t from TipoCliente t where t.estado=1")
    List<TipoCliente> findAllCustom();
    
}
