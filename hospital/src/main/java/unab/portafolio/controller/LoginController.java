package unab.portafolio.controller;

import java.io.IOException;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import unab.portafolio.dao.DAOException;
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
    public ModelAndView entrarLogin(Model model, HttpServletRequest request) throws IOException, DAOException {

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

        model.addAttribute("mensajeError", "Usuario y/o Clave incorrecta.");
        return new ModelAndView("login");
    }

}
