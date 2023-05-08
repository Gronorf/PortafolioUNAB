package unab.portafolio.model.paciente;

import unab.portafolio.dao.DAO;

public class PacienteDAO extends DAO<Paciente> {
    @Override
    public String getNombreModelo() {
        return "Paciente";
    }
}