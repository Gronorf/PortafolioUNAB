package unab.portafolio.controller;

import java.io.IOException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import unab.portafolio.dao.DAOException;
import unab.portafolio.model.medico.Medico;
import unab.portafolio.model.usuario.Usuario;
import unab.portafolio.model.usuario.UsuarioDAO;

@Controller
public class LoginController {

    static String nombreLogin;
    static String rolLogin;

    @GetMapping(value="/cargarLogin")
    public ModelAndView cargarLogin(Usuario usuario) throws IOException{

        return new ModelAndView("login");
    }

    @PostMapping(value="/verificationLogin")
    public ModelAndView entrarLogin(HttpServletRequest request) throws IOException, DAOException {

        String nombreUsuario = request.getParameter("nombreUsuario");
        System.out.println(nombreUsuario);
        String claveUsuario = request.getParameter("claveUsuario");
        System.out.println(claveUsuario);

        UsuarioDAO usuarioDAO = new UsuarioDAO();

        for (Usuario usuario: usuarioDAO.readAll()) {
            if (nombreUsuario.equals(usuario.getNombreUsuario()) && claveUsuario.equals(usuario.getClaveUsuario())) {

                request.setAttribute("nombreLogin", nombreUsuario);
                request.setAttribute("rolLogin", usuario.getRolUsuario());
                return new ModelAndView("home");
            }
        }

        return new ModelAndView("error404");
    }



}
