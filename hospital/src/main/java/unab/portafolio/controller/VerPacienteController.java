package unab.portafolio.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import unab.portafolio.dao.DAOException;
import unab.portafolio.model.paciente.Paciente;
import unab.portafolio.model.paciente.PacienteDAO;
import java.io.IOException;
import java.util.List;

@Controller
public class VerPacienteController {

    @GetMapping(value="/verpaciente")
    public ModelAndView test(HttpServletResponse response, HttpServletRequest request) throws IOException, DAOException {

        PacienteDAO pacienteDAO = new PacienteDAO();
        List<Paciente> pacientes = pacienteDAO.readAll();

        request.setAttribute("pacientes", pacientes);


        ModelAndView mav = new ModelAndView("verpaciente");
        return mav;
    }
}
