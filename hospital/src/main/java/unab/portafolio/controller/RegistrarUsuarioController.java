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
import unab.portafolio.model.usuario.Usuario;
import unab.portafolio.model.usuario.UsuarioDAO;

import java.io.IOException;

@Controller
public class RegistrarUsuarioController {

    @PostMapping(value="/registrousuario")
    public ModelAndView registroUsuario(@ModelAttribute Usuario usuario, Model model, HttpServletRequest request) throws IOException, DAOException {

        String rolUsuario = request.getParameter("rolUsuario");
        String nombreUsuario = request.getParameter("nombreUsuario");
        String emailUsuario = request.getParameter("emailUsuario");

        UsuarioDAO usuarioDAO = new UsuarioDAO();

        for (Usuario usuario1 : usuarioDAO.readAll()) {
            if ((nombreUsuario.equals(usuario1.getNombreUsuario())) || (emailUsuario.equals(usuario1.getEmailUsuario()))) {



                model.addAttribute("mensajeError", "Usuario ya registrado. Utilice otro usuario u otro correo");
                return new ModelAndView("createaccount");

            }
        }

        usuarioDAO.create(usuario);
        usuario.setRolUsuario(rolUsuario);

        model.addAttribute("mensaje", "Cuenta creada con exito.");
        return new ModelAndView("login");

    }
}
