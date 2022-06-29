package com.sistema.disquera.album;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sistema.disquera.artista.Artista;
import com.sistema.disquera.artista.ArtistaRepository;

@Controller
public class AlbumController {

    @Autowired//traemos los repositorios
    private AlbumsRepository albumsrepository;
    @Autowired
    private ArtistaRepository artistarepository;
    
    @GetMapping("/albums")
    public String listarAlbums(Model modelo){
    List<Album> listaAlbums = albumsrepository.findAll();
    modelo.addAttribute("listaAlbums", listaAlbums);
    return "albums";
    }

    @PostMapping("/albums/guardar")
    public String guardarAlbum(Album album){
    albumsrepository.save(album);
    return "redirect:/";
    }

    @GetMapping("/albums/nueva")
    public String mostrarFormularioDeNuevoAlbum(Model modelo){
        List<Artista> listaArtistas = artistarepository.findAll();//poder alistar todas las disqueras
//aqui le pasamos una nueva instancia de artista para asi poder asignar a los campos en el html
    modelo.addAttribute("album", new Album());
    modelo.addAttribute("listaArtistas", listaArtistas);//aqui agregamos la lista
    return "album_formulario";
}

    
    @GetMapping("/albums/editar/{idAlbum}")
    public String mostrarFormularioModificarAlbum(@PathVariable("idAlbum")Integer idAlbum,Model modelo){
        Album album = albumsrepository.findById(idAlbum).get();
        modelo.addAttribute("album", album);

        List<Artista> listaArtistas = artistarepository.findAll();
        modelo.addAttribute("listaArtistas", listaArtistas);
        
        return "album_formulario";

    }

    @GetMapping("/albums/eliminar/{idAlbum}")
    public String eliminarAlbum(@PathVariable("idAlbum")Integer idAlbum,Model modelo){
        albumsrepository.deleteById(idAlbum);
        return "redirect:/albums";
    }

}
