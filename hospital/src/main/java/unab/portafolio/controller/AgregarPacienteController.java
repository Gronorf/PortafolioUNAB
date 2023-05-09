package unab.portafolio.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import unab.portafolio.dao.DAOException;
import unab.portafolio.model.paciente.Paciente;
import unab.portafolio.model.paciente.PacienteDAO;
import unab.portafolio.model.usuario.Usuario;

import java.io.IOException;
import java.util.List;

@Controller
public class AgregarPacienteController {

    @GetMapping(value="/inicioagregarpaciente")
    public ModelAndView test(HttpServletResponse response, HttpServletRequest request) throws IOException, DAOException {

        ModelAndView mav = new ModelAndView("agregarpaciente");
        return mav;
    }

    @PostMapping(value="/agregarpacienteok")
    public ModelAndView test2(@ModelAttribute Paciente paciente, Model model, HttpServletResponse response, HttpServletRequest request) throws IOException, DAOException {

        PacienteDAO pacienteDAO = new PacienteDAO();
        pacienteDAO.create(paciente);

        ModelAndView mav = new ModelAndView("home");
        return mav;
    }
}