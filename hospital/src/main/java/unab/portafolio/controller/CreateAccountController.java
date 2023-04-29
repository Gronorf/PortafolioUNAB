package unab.portafolio.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class CreateAccountController {

	@GetMapping(value="/createaccount")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		ModelAndView mav = new ModelAndView("createaccount");

		return mav;
	}
}
