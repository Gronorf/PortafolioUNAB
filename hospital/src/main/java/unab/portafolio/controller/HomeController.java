package unab.portafolio.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import unab.portafolio.model.paciente.PacienteEntity;
import unab.portafolio.model.paciente.PacienteService;

@Controller
public class HomeController {

	@Autowired
	private PacienteService service;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		ModelAndView mav = new ModelAndView("home");

		List<PacienteEntity> listaPaciente = service.listAll();

		mav.addObject("mensaje", listaPaciente);

		return mav;
	}
}
