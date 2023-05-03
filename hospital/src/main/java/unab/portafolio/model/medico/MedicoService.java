package unab.portafolio.model.medico;

import jakarta.annotation.Resource;

import java.util.List;


public class MedicoService {

    @Resource
    private MedicoRepository repo;

    public List<Medico> listAll() {
        return (List<Medico>) repo.findAll();
    }

}
