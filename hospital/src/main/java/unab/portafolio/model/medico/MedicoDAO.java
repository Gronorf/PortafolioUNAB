package unab.portafolio.model.medico;

import unab.portafolio.dao.DAO;
import unab.portafolio.model.medico.Medico;

public class MedicoDAO extends DAO<Medico> {
    @Override
    public String getNombreModelo() {
        return "Medico";
    }
}