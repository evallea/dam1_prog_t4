package com.mycompany.biblioteca;

public class Enciclopedia extends Libro {
    
    // ATRIBUTOS:
    private int tomos;
    
    // CONSTRUCTOR (POR PARÁMETROS):
    public Enciclopedia (String autor, String titulo, String ubicacion, int tomos) { // Se añaden todos los parámetros de la clase padre.
        super(autor, titulo, ubicacion); // La etiqueta "super" llama al constructor "padre" de esta clase.
        this.tomos=tomos;
    }

    // GETS Y SETS:
    public int getTomos() {
        return tomos;
    }

    public void setTomos(int tomos) {
        this.tomos = tomos;
    }
 
}
