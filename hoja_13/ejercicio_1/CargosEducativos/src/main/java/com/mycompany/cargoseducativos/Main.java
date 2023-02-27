package com.mycompany.cargoseducativos;

/**
 *
 * @author Enrique Valle Alcega
 */
public class Main {

    public static void main(String[] args) {

        Profesor profesor1 = new Profesor("Juan", 33, 2000);

        System.out.println("\nNombre: " + profesor1.getNombre());
        System.out.println("Edad: " + profesor1.getEdad());
        System.out.println("Sueldo: " + profesor1.getSueldo());

        EquipoDirectivo directivo1 = new EquipoDirectivo("Enrique", 32, 2500, "Director", 500);

        System.out.println("\nNombre: " + directivo1.getNombre());
        System.out.println("Edad: " + directivo1.getEdad());
        System.out.println("Sueldo: " + directivo1.getSueldo());
        System.out.println("Cargo: " + directivo1.getCargo());

    }

}
