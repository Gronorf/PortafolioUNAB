package unab.portafolio.model.medico;

import unab.portafolio.dao.DAO;

public class MedicoDAO extends DAO<Medico> {
    @Override
    public String getNombreModelo() {

        return "Medico";
    }
}