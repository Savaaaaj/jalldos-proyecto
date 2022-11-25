
package pe.com.jalldos.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.jalldos.entity.Perfil;
import pe.com.jalldos.repository.PerfilRepository;

@Service
public class PerfilServiceImpl implements PerfilService{
    
    @Autowired
    private PerfilRepository repositorio;

    @Override
    public List<Perfil> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<Perfil> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<Perfil> findById(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public Perfil add(Perfil p) {
        return repositorio.save(p);
    }

    @Override
    public Perfil update(Perfil p) {
        Perfil objperfil = new Perfil();
        BeanUtils.copyProperties(p, objperfil);
        return repositorio.save(objperfil);
    }

    @Override
    public Perfil delete(Perfil p) {
        Perfil objperfil = repositorio.getById(p.getCodigo());
        objperfil.setEstado(false);
        return repositorio.save(objperfil);
    }
    
}
