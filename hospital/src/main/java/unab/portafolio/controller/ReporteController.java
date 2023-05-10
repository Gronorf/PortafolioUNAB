package unab.portafolio.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import unab.portafolio.dao.DAOException;
import unab.portafolio.model.paciente.Paciente;
import unab.portafolio.model.paciente.PacienteDAO;

import java.io.IOException;
import java.util.List;

@Controller
public class ReporteController {

	@GetMapping(value="/inicioreporte")
	public ModelAndView test2(HttpServletResponse response, HttpServletRequest request) throws IOException, DAOException {

		ModelAndView mav = new ModelAndView("inicioreporte");
		return mav;

	}

	@PostMapping(value = "/finreporte")
	public ModelAndView test(HttpServletResponse response, HttpServletRequest request) throws IOException, DAOException {

		int horasMedicas = Integer.parseInt(request.getParameter("horasMedicas"));
		PacienteDAO pacienteDAO = new PacienteDAO();

		int atencionPacientes = horasMedicas * 2;

		List<Paciente> pacientes = pacienteDAO.Reporte("ingresoPaciente", atencionPacientes);
		System.out.println(pacientes);
		System.out.println(atencionPacientes);

		request.setAttribute("pacientes", pacientes);

		ModelAndView mav = new ModelAndView("reporte");
		return mav;
	}
}
