
package pe.com.jalldos.service;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.jalldos.entity.Cliente;
import pe.com.jalldos.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository repositoriocliente;
    
    @Override
    public List<Cliente> findAll() {
        return repositoriocliente.findAll();
    }

    @Override
    public List<Cliente> findAllCustom() {
        return repositoriocliente.findAllCustom();
    }

    @Override
    public Optional<Cliente> findById(Long id) {
        return repositoriocliente.findById(id);
    }

    @Override
    public Cliente add(Cliente c) {
        return repositoriocliente.save(c);
    }

    @Override
    public Cliente update(Cliente c) {
        Cliente objcliente = repositoriocliente.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objcliente);
        return repositoriocliente.save(objcliente);
        
    }

    @Override
    public Cliente delete(Cliente c) {
       Cliente objcliente = repositoriocliente.getById(c.getCodigo());
       objcliente.setEstado(false);
       return repositoriocliente.save(objcliente);
    }
    
}
