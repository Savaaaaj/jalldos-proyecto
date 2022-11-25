
package pe.com.jalldos.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.jalldos.entity.TipoCliente;
import pe.com.jalldos.repository.TipoClienteRepository;

@Service
public class TipoClienteServiceImpl implements TipoClienteService{
    
    @Autowired
    private TipoClienteRepository repositorio;

    @Override
    public List<TipoCliente> findAll() {
       return repositorio.findAll();
    }

    @Override
    public List<TipoCliente> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<TipoCliente> findById(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public TipoCliente add(TipoCliente t) {
        return repositorio.save(t);
    }

    @Override
    public TipoCliente update(TipoCliente t) {
        TipoCliente objtipo = new TipoCliente();
        BeanUtils.copyProperties(t, objtipo);
        return repositorio.save(objtipo);
    }

    @Override
    public TipoCliente delete(TipoCliente t) {
        TipoCliente objtipo = repositorio.getById(t.getCodigo());
        objtipo.setEstado(false);
        return repositorio.save(objtipo);
    }
    
}
