
package pe.com.jalldos.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.jalldos.entity.Categoria;
import pe.com.jalldos.repository.CategoriaRepository;


@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    private CategoriaRepository repositoriocategoria;
    
    @Override
    public List<Categoria> findAll() {
       return repositoriocategoria.findAll();
    }

    @Override
    public List<Categoria> findAllCustom() {
        return repositoriocategoria.findAllCustom();
    }

    @Override
    public Optional<Categoria> findById(Long id) {
        return repositoriocategoria.findById(id);
    }

    @Override
    public Categoria add(Categoria c) {
        return repositoriocategoria.save(c);
    }

    @Override
    public Categoria update(Categoria c) {
        Categoria objcategoria = repositoriocategoria.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objcategoria);
        return repositoriocategoria.save(objcategoria);
    }

    @Override
    public Categoria delete(Categoria c) {
        Categoria objcategoria = repositoriocategoria.getById(c.getCodigo());
        objcategoria.setEstado(false);
        return repositoriocategoria.save(objcategoria);
        
    }
    
}
