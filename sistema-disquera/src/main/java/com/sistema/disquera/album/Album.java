package com.sistema.disquera.album;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.sistema.disquera.artista.Artista;

@Entity
public class Album {
    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAlbum;

    private String nombreAlbum;
    private String anioPublicacion;
    private String estadoAlbum;
    
    @ManyToOne//muchos a uno
    @JoinColumn(name = "idArtista")//con la columna que se va a unir
    private Artista artista;

    public Integer getIdAlbum() {
        return this.idAlbum;
    }

    public void setIdAlbum(Integer idAlbum) {
        this.idAlbum = idAlbum;
    }

    public String getNombreAlbum() {
        return this.nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public String getAnioPublicacion() {
        return this.anioPublicacion;
    }

    public void setAnioPublicacion(String anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getEstadoAlbum() {
        return this.estadoAlbum;
    }

    public void setEstadoAlbum(String estadoAlbum) {
        this.estadoAlbum = estadoAlbum;
    }

    public Artista getArtista() {
        return this.artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    public Album(String nombreAlbum) {
        super();
        this.nombreAlbum = nombreAlbum;
    }

    public Album(String nombreAlbum, String anioPublicacion, String estadoAlbum, Artista artista) {
        super();
        this.nombreAlbum = nombreAlbum;
        this.anioPublicacion = anioPublicacion;
        this.estadoAlbum = estadoAlbum;
        this.artista = artista;
    }

    public Album(Integer idAlbum, String nombreAlbum, String anioPublicacion, String estadoAlbum, Artista artista) {
        super();
        this.idAlbum = idAlbum;
        this.nombreAlbum = nombreAlbum;
        this.anioPublicacion = anioPublicacion;
        this.estadoAlbum = estadoAlbum;
        this.artista = artista;
    }

    public Album(Integer idAlbum) {
        super();
        this.idAlbum = idAlbum;
    }

    public Album() {
        super();
    }




}
