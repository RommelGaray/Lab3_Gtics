package com.example.lab3gtics.controlador;

import com.example.lab3gtics.entidad.Arbitro;
import com.example.lab3gtics.entidad.Estadio;
import com.example.lab3gtics.repositorio.EstadioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("/estadio")
public class EstadioController {
    final EstadioRepository estadioRepository;

    public EstadioController(EstadioRepository estadioRepository) {
        this.estadioRepository = estadioRepository;
    }


    @GetMapping(value = {"", "/listar"})
    public String listar(Model model) {
        model.addAttribute("lista", estadioRepository.findAll());
        return "estadio/list";
    }


    @GetMapping("/nuevo")
    public String crear() {
        return "estadio/newForm";
    }



    @PostMapping("/guardar")
    public String guardar(Estadio estadio) {
        estadioRepository.save(estadio);
        return "redirect:/estadio/listar";
    }


    @GetMapping("/borrar")
    public String borrar(@RequestParam("id") int id) {

        Optional<Estadio> optional = estadioRepository.findById(id);

        if (optional.isPresent()) {
            estadioRepository.deleteById(id);
        }
        return "redirect:/estadio/listar";
    }

}
