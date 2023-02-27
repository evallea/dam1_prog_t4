package com.mycompany.cargoseducativos;

/**
 *
 * @author Enrique Valle Alcega
 */
public class Profesor {

    String nombre;
    int edad;
    double sueldo;
    
    public Profesor(String nombre, int edad, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSueldo() {
        return sueldo;
    }
    
}