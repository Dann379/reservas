package com.photobooth.reservas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class HelloController {
    private List <String> paquetes = List.of("Basico", "Premium", "Boda", "XV Años");
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
        model.addAttribute("paquetes", paquetes);
        return "paquetes";
    }
    @GetMapping("/paquetes/{nombre}")
    public String detalle(@PathVariable String nombre, Model model){
        if (!paquetes.contains(nombre)) {          // ¿existe en la lista? El ! lo niega
            model.addAttribute("mensaje", "No existe el paquete " + nombre);
        } else {
            model.addAttribute("paquete", nombre); // solo llega al model si SÍ existe
        }
        return "detalle";
    }
}

