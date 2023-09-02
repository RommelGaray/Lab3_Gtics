package com.example.lab3gtics.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String paginaPrincipal(){
        return "Mensaje motivador: Todo en esta vida hay solución, solo no hay solución para LA MUERTE, la vida es BELLA.";

    }

}
