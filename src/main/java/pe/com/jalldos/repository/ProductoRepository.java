package pe.com.jalldos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.jalldos.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    @Query("select p from Producto p where p.estado=1")
    List<Producto> findAllCustom();
    
    List<Producto> findByNombre(String nombre);
    
    @Query(value = "select p from Producto p where p.nombre LIKE %:filtro%")
    List<Producto> search(@Param("filtro") String filtro);

}
