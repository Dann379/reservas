package com.photobooth.reservas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class HelloController {

    @GetMapping("/hola")

    public String saludar(Model model){
        model.addAttribute("nombre", "dann");
        return "hola";
    }

    @GetMapping("/adios")
    public String despedida(Model model) {
        model.addAttribute("mensaje", "Gracias por hacernos parte de tu dia especial");
        model.addAttribute("nombre", "Iconica Studios");
        return "adios";
    }
    @GetMapping("/paquetes")
    public String paquetes(Model model) {
        model.addAttribute("mensaje", "Nuestros Paquetes");
        List<String> paquetes = List.of("Basico", "Premium", "Boda");
        model.addAttribute("paquetes", paquetes);
        return "paquetes";
    }

}

