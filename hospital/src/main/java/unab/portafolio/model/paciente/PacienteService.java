package unab.portafolio.model.paciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository repo;

    public List<PacienteEntity> listAll() {
        return (List<PacienteEntity>) repo.findAll();
    }
}
