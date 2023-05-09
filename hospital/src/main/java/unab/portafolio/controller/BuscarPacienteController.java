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
public class BuscarPacienteController {

	@GetMapping(value="/iniciobuscar")
	public ModelAndView test(HttpServletResponse response, HttpServletRequest request) throws IOException, DAOException {

		ModelAndView mav = new ModelAndView("buscarmodificarpaciente");
		return mav;
	}

	@PostMapping(value="/finalbuscar")
	public ModelAndView test2(@ModelAttribute Model model, HttpServletResponse response, @org.jetbrains.annotations.NotNull HttpServletRequest request) throws IOException, DAOException {

		PacienteDAO pacienteDAO = new PacienteDAO();
		int rutPaciente = Integer.parseInt(request.getParameter("rutPaciente"));
		int fichaClinica = Integer.parseInt(request.getParameter("fichaClinica"));

		for (Paciente paciente: pacienteDAO.readAll()) {
			if ( (rutPaciente == paciente.getRutPaciente()) || (fichaClinica == paciente.getFichaClinica()) ) {

				System.out.println(paciente);
				request.setAttribute("rutPaciente", paciente.getRutPaciente());
				request.setAttribute("fichaClinica", paciente.getFichaClinica());
				request.setAttribute("nombrePaciente", paciente.getNombrePaciente());
				request.setAttribute("apellidoPaternoPaciente", paciente.getApellidoPaternoPaciente());
				request.setAttribute("apellidoMaternoPaciente", paciente.getApellidoMaternoPaciente());

				return new ModelAndView("modificarpaciente");
			}
		}

		return new ModelAndView("home");
	}
}