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
public class AgregarPacienteController {

    @GetMapping(value = "/inicioagregarpaciente")
    public ModelAndView test(HttpServletResponse response, HttpServletRequest request) throws IOException, DAOException {

        ModelAndView mav = new ModelAndView("agregarpaciente");
        return mav;
    }

    @PostMapping(value = "/agregarpacienteok")
    public String test2(Paciente paciente, Model model, HttpServletResponse response, HttpServletRequest request) throws IOException, DAOException {

        int rutPaciente = Integer.parseInt(request.getParameter("rutPaciente"));
        int fichaClinica = Integer.parseInt(request.getParameter("fichaClinica"));

        System.out.println(rutPaciente);
        System.out.println(fichaClinica);

        PacienteDAO pacienteDAO = new PacienteDAO();

        boolean exist = false;

        for (Paciente paciente1 : pacienteDAO.readAll()) {
            if ((rutPaciente == paciente1.getRutPaciente()) || (fichaClinica == paciente1.getFichaClinica())) {

                exist = true;
                model.addAttribute("mensajeError", "Paciente ya existente, revisar RUT y/o Ficha Clínica en listado de Pacientes.");
                return "agregarpaciente";

            }
        }

        pacienteDAO.create(paciente);
        model.addAttribute("mensaje", "Paciente ingresado correctamente.");
        return "home";

    }

}