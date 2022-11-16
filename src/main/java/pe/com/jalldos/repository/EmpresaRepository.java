
package pe.com.jalldos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.jalldos.entity.Empresa;


public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
    
    @Query("select e from Empresa e where e.estado=1")
    List<Empresa> findAllCustom();
    
}
