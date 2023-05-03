package unab.portafolio.model.medico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    public void MedicoRepository(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }


}
