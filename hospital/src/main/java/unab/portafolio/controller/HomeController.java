package unab.portafolio.controller;

import java.io.IOException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import unab.portafolio.model.usuario.UsuarioDAO;

@Controller
public class HomeController {

	@GetMapping(value="/home")
	public ModelAndView test(HttpServletResponse response, HttpServletRequest request) throws IOException{

		ModelAndView mav = new ModelAndView("home");
		return mav;
	}
}
