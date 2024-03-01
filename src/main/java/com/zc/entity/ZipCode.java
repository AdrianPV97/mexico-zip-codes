package com.zc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name="mexico_zipcodes")
public class ZipCode {

    public ZipCode(String asentamiento, String tipoAsentamiento, String municipio, String estado, String ciudad, int codigoPostal, String zona) {
        this.asentamiento = asentamiento;
        this.tipoAsentamiento = tipoAsentamiento;
        this.municipio = municipio;
        this.estado = estado;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.zona = zona;
    }

    public ZipCode(int id, String asentamiento, String tipoAsentamiento, String municipio, String estado, String ciudad, int codigoPostal, String zona) {
        this.id = id;
        this.asentamiento = asentamiento;
        this.tipoAsentamiento = tipoAsentamiento;
        this.municipio = municipio;
        this.estado = estado;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.zona = zona;
    }

    public ZipCode() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    
    @Column
    private String asentamiento;
    
    @Column(name="tipo_asentamiento")
    private String tipoAsentamiento;
    
    @Column
    private String municipio;
    
    @Column
    private String estado;
    
    @Column
    private String ciudad;
    
    @Column(name="codigo_postal")
    private int codigoPostal;
    
    @Column
    private String zona;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAsentamiento() {
        return asentamiento;
    }

    public void setAsentamiento(String asentamiento) {
        this.asentamiento = asentamiento;
    }

    public String getTipoAsentamiento() {
        return tipoAsentamiento;
    }

    public void setTipoAsentamiento(String tipoAsentamiento) {
        this.tipoAsentamiento = tipoAsentamiento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
}
