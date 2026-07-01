package com.photobooth.reservas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/hola")
    @ResponseBody

    public String saludar(){
        return "hola mundo";
    }
}
