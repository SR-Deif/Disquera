package com.sistema.disquera.artista;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sistema.disquera.disquera.Disquera;
import com.sistema.disquera.disquera.DisqueraRepository;

@Controller
public class ArtistaController {
    
    @Autowired//traemos los repositorios
    private ArtistaRepository artistarepository;
    @Autowired
    private DisqueraRepository disquerarepository;

    
    @GetMapping("/artistas")
    public String listarArtistas(Model modelo){
    List<Artista> listaArtistas = artistarepository.findAll();
    modelo.addAttribute("listaArtistas", listaArtistas);
    return "artistas";
    }

    @GetMapping("/artistas/nuevo")
    public String mostrarFormularioDeNuevoArtista(Model modelo){
        List<Disquera> listaDisqueras = disquerarepository.findAll();//poder alistar todas las disqueras
//aqui le pasamos una nueva instancia de artista para asi poder asignar a los campos en el html
    modelo.addAttribute("artista", new Artista());
    modelo.addAttribute("listaDisqueras", listaDisqueras);//aqui agregamos la lista
    return "artista_formulario";
}
    //guardar
    @PostMapping("/artistas/guardar")
    public String guardarArtista(Artista artista){
    artistarepository.save(artista);
    return "redirect:/";
    }
    //editar
    @GetMapping("/artistas/editar/{idArtista}")
    public String mostrarFormularioModificarArtista(@PathVariable("idArtista")Integer idArtista,Model modelo){
        Artista artista = artistarepository.findById(idArtista).get();
        modelo.addAttribute("artista", artista);

        List<Disquera> listaDisqueras = disquerarepository.findAll();
        modelo.addAttribute("listaDisqueras", listaDisqueras);
        
        return "artista_formulario";

    }
    //Eliminar
    @GetMapping("/artistas/eliminar/{idArtista}")
    public String eliminarArtista(@PathVariable("idArtista")Integer idArtista,Model modelo){
        artistarepository.deleteById(idArtista);
        return "redirect:/artistas";
    }

}
