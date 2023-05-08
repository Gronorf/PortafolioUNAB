package unab.portafolio.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

public class PacienteController {

    @GetMapping(value="/")
    public ModelAndView test(HttpServletResponse response, HttpServletRequest request) throws IOException {

        ModelAndView mav = new ModelAndView("home");
        return mav;
    }
}
