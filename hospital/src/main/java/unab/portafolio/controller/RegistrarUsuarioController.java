package unab.portafolio.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import unab.portafolio.config.MvcConfiguration;
import unab.portafolio.dao.DAOException;
import unab.portafolio.model.usuario.Usuario;
import unab.portafolio.model.usuario.UsuarioDAO;

import java.io.IOException;

@Controller
public class RegistrarUsuarioController {

    @PostMapping(value="/registrousuario")
    public ModelAndView registroUsuario(@ModelAttribute Usuario usuario, Model model, HttpServletRequest request) throws IOException, DAOException {

        String rolUsuario = request.getParameter("rolUsuario");

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.create(usuario);
        usuario.setRolUsuario(rolUsuario);
        model.addAttribute("cuentaCreada", true);

        ModelAndView mav = new ModelAndView("login");
        return mav;
    }
}
