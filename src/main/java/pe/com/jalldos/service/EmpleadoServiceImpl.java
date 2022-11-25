
package pe.com.jalldos.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.jalldos.entity.Empleado;
import pe.com.jalldos.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl  implements EmpleadoService{
    
     @Autowired
    private EmpleadoRepository repositorio;

    @Override
    public List<Empleado> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<Empleado> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<Empleado> findById(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public Empleado add(Empleado e) {
        return repositorio.save(e);
    }

    @Override
    public Empleado update(Empleado e) {
        Empleado objempleado = new Empleado();
        BeanUtils.copyProperties(e, objempleado);
        return repositorio.save(objempleado);
    }

    @Override
    public Empleado delete(Empleado e) {
        Empleado objempleado = repositorio.getById(e.getCodigo());
        objempleado.setEstado(false);
        return repositorio.save(objempleado);
    }
    
}
