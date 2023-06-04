package com.example.springbootpersonas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;

public class Image {

    @Column(name = "nombre_imagen")
    private String nombreImagen;

    @Lob
    @Column(name = "imagen", columnDefinition = "bytea")
    private byte[] imagen;

    @Column(name = "tipo_imagen")
    private String tipoImagen;


    public Image() {
    }

    public Image(String nombreImagen, byte[] imagen, String tipoImagen) {
        this.nombreImagen = nombreImagen;
        this.imagen = imagen;
        this.tipoImagen = tipoImagen;
    }
}
