
package pe.com.jalldos.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.jalldos.entity.Empresa;
import pe.com.jalldos.repository.EmpresaRepository;

@Service
public class EmpresaServiceImpl implements EmpresaService{

    @Autowired
    private EmpresaRepository repositorioempresa;
    
    @Override
    public List<Empresa> findAll() {
        return repositorioempresa.findAll();
    }

    @Override
    public List<Empresa> findAllCustom() {
        return repositorioempresa.findAllCustom();
    }

    @Override
    public Optional<Empresa> findById(Long id) {
        return repositorioempresa.findById(id);
    }

    @Override
    public Empresa add(Empresa e) {
        return repositorioempresa.save(e);
    }

    @Override
    public Empresa update(Empresa e) {
        Empresa objEmpresa = repositorioempresa.getById(e.getCodigo());
        BeanUtils.copyProperties(e, objEmpresa);
        return repositorioempresa.save(objEmpresa);
    }

    @Override
    public Empresa delete(Empresa e) {
       Empresa objEmpresa = repositorioempresa.getById(e.getCodigo());
        objEmpresa.setEstado(false);
        return repositorioempresa.save(objEmpresa);
        
    }
    
}
