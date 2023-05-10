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
	public ModelAndView test2(Model model, ModelAndView modelAndView, HttpServletResponse response, HttpServletRequest request) throws IOException, DAOException {


		int targetPaciente = Integer.parseInt(request.getParameter("targetPaciente"));
		PacienteDAO pacienteDAO = new PacienteDAO();

		for (Paciente paciente : pacienteDAO.readAll()) {
			if ((targetPaciente == paciente.getRutPaciente()) || (targetPaciente == paciente.getFichaClinica())) {

				System.out.println(paciente);

				modelAndView.addObject("pacienteMod", paciente);
				modelAndView.setViewName("modificarpaciente");
				pacienteDAO.delete(paciente);
				return modelAndView;
			}
		}

		model.addAttribute("mensajeError", "Paciente no encontrado.");
		modelAndView.setViewName("home");
		return modelAndView;
	}
}