
package pe.com.jalldos.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.jalldos.entity.DetalleBoleta;
import pe.com.jalldos.repository.DetalleBoletaRepository;

@Service

public class DetalleBoletaServiceImpl implements DetalleBoletaService{
    
     @Autowired
    private DetalleBoletaRepository repositorio;
    
    @Override
    public List<DetalleBoleta> findAll() {
        return repositorio.findAll();
    }

    @Override
    public Optional<DetalleBoleta> findById(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public DetalleBoleta add(DetalleBoleta dt) {
        return repositorio.save(dt);
    }

    @Override
    public DetalleBoleta update(DetalleBoleta dt) {
        DetalleBoleta objdetalle = new DetalleBoleta();
        BeanUtils.copyProperties(dt, objdetalle);
        return repositorio.save(objdetalle);
    }
    
}
