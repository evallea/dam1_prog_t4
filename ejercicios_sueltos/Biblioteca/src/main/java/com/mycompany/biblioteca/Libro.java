package com.mycompany.biblioteca;

public class Libro {
    
    // ATRIBUTOS:
    private String autor, titulo, ubicacion;
    
    // CONSTRUCTOR (POR PARÁMETROS):
    public Libro (String autor, String titulo, String ubicacion){
        this.autor=autor;
        this.titulo=titulo;
        this.ubicacion=ubicacion;
    }

    // GETS Y SETS:
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

}
