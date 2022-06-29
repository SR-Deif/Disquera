package com.sistema.disquera.disquera;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DisqueraController {
    

    @Autowired
    private DisqueraRepository disquerarepository;
    //public String es porque me retorna a un archivo html
    @GetMapping("/disqueras")//redireccionar
    public String listarDisqueras(Model modelo){
        List<Disquera> listaDisqueras = disquerarepository.findAll();//mostrar todo
        modelo.addAttribute("listaDisqueras", listaDisqueras);
        return "disqueras";//retornar
    }

    @GetMapping("/disqueras/nuevo")
    public String mostrarFormularioDeNuevaDisquera(Model modelo){
        modelo.addAttribute("disquera", new Disquera());
        return "disquera_formulario";

    }

    @PostMapping("/disqueras/guardar")
    public String guardarDisquera(Disquera disquera){
        disquerarepository.save(disquera);
        return "redirect:/disqueras";
    }
}
