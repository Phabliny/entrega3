package br.edu.iftm.entrega3.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.iftm.entrega3.model.Usuario;
import br.edu.iftm.entrega3.repository.UsuarioRepository;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Controlador {
    @Autowired  
    UsuarioRepository repo;

    @RequestMapping("/usuarios")
    String inicio(Model modelo){
        List<Usuario> usuarios = repo.buscaTodosUsuarios();
        modelo.addAttribute("usuarios", usuarios);
        return "usuarios";
    }

    @GetMapping("/form-usuario")
    String formUsuario(Model modelo){
        modelo.addAttribute("usuario", new Usuario());
        return "form-usuario";
    }

    @PostMapping("/form-usuario")
    public String cadastroUsuario(Usuario usuario) {
        //TODO: process POST request
        repo.gravaUsuario(usuario);
        return "redirect:/usuarios";
    }
    
}
