package com.mycompany.biblioteca;

public class Biblioteca {

    public static void main(String[] args) {
        
        Enciclopedia e1 = new Enciclopedia("Enrique", "Enriquepedia", "Sala 16", 5);
        System.out.println("Autor: " + e1.getAutor());
        System.out.println("Título: " + e1.getTitulo());
        System.out.println("Ubicación: " + e1.getUbicacion());
        System.out.println("Número de tomos: " + e1.getTomos());
        
    }
}
