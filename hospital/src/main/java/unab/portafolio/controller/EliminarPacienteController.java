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

import java.io.IOException;

@Controller
public class EliminarPacienteController {

    @GetMapping(value = "/inicioeliminarpaciente")
    public ModelAndView test(HttpServletResponse response, HttpServletRequest request) throws IOException, DAOException {

        ModelAndView mav = new ModelAndView("eliminarpaciente");
        return mav;
    }

    @PostMapping(value = "/eliminarpacienteok")
    public String test2(HttpServletResponse response, HttpServletRequest request, Model model) throws IOException, DAOException {

        int targetPaciente = Integer.parseInt(request.getParameter("targetPaciente"));
        PacienteDAO pacienteDAO = new PacienteDAO();

        for (Paciente paciente : pacienteDAO.readAll()) {
            if ((targetPaciente == paciente.getRutPaciente()) || (targetPaciente == paciente.getFichaClinica())) {

                pacienteDAO.delete(paciente);
                model.addAttribute("mensaje", "Paciente eliminado correctamente.");
                return "home";
            }
        }

        model.addAttribute("mensajeError", "No se encontró un paciente con el ID especificado.");
        return "eliminarpaciente";
    }

}