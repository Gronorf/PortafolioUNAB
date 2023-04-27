package unab.portafolio.model.paciente;

import org.springframework.data.repository.CrudRepository;
import unab.portafolio.model.paciente.PacienteEntity;

// Interface que hereda el CRUD.
public interface PacienteRepository extends CrudRepository<PacienteEntity, Integer> {
}
