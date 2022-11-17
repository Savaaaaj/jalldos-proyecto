package pe.com.jalldos.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.jalldos.entity.Boleta;
import pe.com.jalldos.repository.BoletaRepository;


@Service
public class BoletaServiceImpl implements BoletaService {

    @Autowired
    private BoletaRepository repositorioboleta;

    @Override
    public List<Boleta> findAll() {
        return repositorioboleta.findAll();
    }

    @Override
    public List<Boleta> findAllCustom() {
        return repositorioboleta.findAllCustom();
    }

    @Override
    public Optional<Boleta> findById(Long id) {
        return repositorioboleta.findById(id);
    }

    @Override
    public Boleta add(Boleta b) {
        return repositorioboleta.save(b);
    }

    @Override
    public Boleta update(Boleta b) {
        Boleta objboleta = repositorioboleta.getById(b.getCodigo());
        BeanUtils.copyProperties(b, objboleta);
        return repositorioboleta.save(objboleta);

    }

    @Override
    public Boleta delete(Boleta b) {
        Boleta objboleta = repositorioboleta.getById(b.getCodigo());
        objboleta.setEstado(false);
        return repositorioboleta.save(objboleta);
    }

}
