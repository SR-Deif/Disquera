package com.sistema.disquera.disquera;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Disquera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDisquera;


    private String nitDisquera;
    private String nombreDisquera;
    private String telefonoDisquera;
    private String direccionDisquera;
    private String estadoDisqura;

    public Integer getIdDisquera() {
        return this.idDisquera;
    }

    public void setIdDisquera(Integer idDisquera) {
        this.idDisquera = idDisquera;
    }

    public String getNitDisquera() {
        return this.nitDisquera;
    }

    public void setNitDisquera(String nitDisquera) {
        this.nitDisquera = nitDisquera;
    }

    public String getNombreDisquera() {
        return this.nombreDisquera;
    }

    public void setNombreDisquera(String nombreDisquera) {
        this.nombreDisquera = nombreDisquera;
    }

    public String getTelefonoDisquera() {
        return this.telefonoDisquera;
    }

    public void setTelefonoDisquera(String telefonoDisquera) {
        this.telefonoDisquera = telefonoDisquera;
    }

    public String getDireccionDisquera() {
        return this.direccionDisquera;
    }

    public void setDireccionDisquera(String direccionDisquera) {
        this.direccionDisquera = direccionDisquera;
    }

    public String getEstadoDisqura() {
        return this.estadoDisqura;
    }

    public void setEstadoDisqura(String estadoDisqura) {
        this.estadoDisqura = estadoDisqura;
    }


    public Disquera() {
        super();

}
public Disquera(String nitDisquera, String nombreDisquera, String telefonoDisquera, String direccionDisquera,
String estadoDisqura) {
    super();
this.nitDisquera = nitDisquera;
this.nombreDisquera = nombreDisquera;
this.telefonoDisquera = telefonoDisquera;
this.direccionDisquera = direccionDisquera;
this.estadoDisqura = estadoDisqura;
}

public Disquera(Integer idDisquera) {
    super();
this.idDisquera = idDisquera;
}
public Disquera(String nombreDisquera) {
    super();
this.nombreDisquera = nombreDisquera;
}

public Disquera(Integer idDisquera, String nitDisquera, String nombreDisquera, String telefonoDisquera,
String direccionDisquera, String estadoDisqura) {
    super();
this.idDisquera = idDisquera;
this.nitDisquera = nitDisquera;
this.nombreDisquera = nombreDisquera;
this.telefonoDisquera = telefonoDisquera;
this.direccionDisquera = direccionDisquera;
this.estadoDisqura = estadoDisqura;
}

}


