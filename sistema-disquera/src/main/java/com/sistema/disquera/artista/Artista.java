package com.sistema.disquera.artista;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.sistema.disquera.disquera.Disquera;

@Entity
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idArtista;

    private String noDocumento;
    private String tipoDocumento;
    private String nombreArtista;
    private String apellidoArtista;
    private String nombreArtistico;
    private String fechanacimArtista;
    private String emailArtista;
    private String estadoArtista;

     @ManyToOne//muchos a uno
    @JoinColumn(name = "idDisquera")//con la columna que se va a unir
    private Disquera disquera;

     public Disquera getDisquera() {
         return this.disquera;
     }

     public void setDisquera(Disquera disquera) {
         this.disquera = disquera;
     }

    public Integer getIdArtista() {
        return this.idArtista;
    }

    public void setIdArtista(Integer idArtista) {
        this.idArtista = idArtista;
    }

    public String getNoDocumento() {
        return this.noDocumento;
    }

    public void setNoDocumento(String noDocumento) {
        this.noDocumento = noDocumento;
    }

    public String getTipoDocumento() {
        return this.tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombreArtista() {
        return this.nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public String getApellidoArtista() {
        return this.apellidoArtista;
    }

    public void setApellidoArtista(String apellidoArtista) {
        this.apellidoArtista = apellidoArtista;
    }

    public String getNombreArtistico() {
        return this.nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public String getFechanacimArtista() {
        return this.fechanacimArtista;
    }

    public void setFechanacimArtista(String fechanacimArtista) {
        this.fechanacimArtista = fechanacimArtista;
    }

    public String getEmailArtista() {
        return this.emailArtista;
    }

    public void setEmailArtista(String emailArtista) {
        this.emailArtista = emailArtista;
    }

    public String getEstadoArtista() {
        return this.estadoArtista;
    }

    public void setEstadoArtista(String estadoArtista) {
        this.estadoArtista = estadoArtista;
    }
    
    public Artista(Integer idArtista, String noDocumento, String tipoDocumento, String nombreArtista,
            String apellidoArtista, String nombreArtistico, String fechanacimArtista, String emailArtista,
            String estadoArtista, Disquera disquera) {
                super();
        this.idArtista = idArtista;
        this.noDocumento = noDocumento;
        this.tipoDocumento = tipoDocumento;
        this.nombreArtista = nombreArtista;
        this.apellidoArtista = apellidoArtista;
        this.nombreArtistico = nombreArtistico;
        this.fechanacimArtista = fechanacimArtista;
        this.emailArtista = emailArtista;
        this.estadoArtista = estadoArtista;
        this.disquera = disquera;
    }

    public Artista() {
        super();
    }

    public Artista(String noDocumento, String tipoDocumento, String nombreArtista, String apellidoArtista,
            String nombreArtistico, String fechanacimArtista, String emailArtista, String estadoArtista,
            Disquera disquera) {
                super();
        this.noDocumento = noDocumento;
        this.tipoDocumento = tipoDocumento;
        this.nombreArtista = nombreArtista;
        this.apellidoArtista = apellidoArtista;
        this.nombreArtistico = nombreArtistico;
        this.fechanacimArtista = fechanacimArtista;
        this.emailArtista = emailArtista;
        this.estadoArtista = estadoArtista;
        this.disquera = disquera;
    }
    
    public Artista(String nombreArtistico) {
        super();
        this.nombreArtistico = nombreArtistico;
    }


}
