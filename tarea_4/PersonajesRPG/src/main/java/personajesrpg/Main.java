package personajesrpg;

import java.util.*;

/**
 *
 * @author Enrique Valle Alcega
 */
public class Main {

    public static void main(String[] args) {
        
        // Variables para almacenar los valores introducidos por teclado para luego darle valor a los parámetros de los objetos creados con el constructor por defecto:
        String nombre;
        int lvl;
        int hp;
        int mp;
        int fuerza;
        int inteligencia;
        // Variable para hacer funcionar las entradas por teclado:
        Scanner lectura = new Scanner(System.in);
        // Variable utilizada únicamente para conformar el switch:
        int opcion; 

        // Creando objetos con el constructor con parámetros:    
        Guerrero guerrero1 = new Guerrero("Minsc", 8, 125, 65, 12);
        Mago mago1 = new Mago("Jaheira", 7, 55, 105, 11);

        System.out.println("PERSONAJES YA CREADOS:");
        System.out.println("**********************\n");

        guerrero1.mostrarInformacion(); // Llamada al método para mostrar la información de "guerrero1".
        System.out.println("Poder: " + guerrero1.calcularPoder() + "\n"); // Llamada al método para mostrar el poder de "guerrero1".

        mago1.mostrarInformacion(); // Llamada al método para mostrar la información de "mago1".
        System.out.println("Poder: " + mago1.calcularPoder() + "\n"); // Llamada al método para mostrar el poder de "mago1".

        // Creando objetos con el constructor por defecto:
        do {

            System.out.println("CREACIÓN DE PERSONAJE:");
            System.out.println("**********************\n");
            System.out.println("Selecciona el tipo (Introduce número):");
            System.out.println("1. Guerrero.");
            System.out.println("2. Mago.");

            opcion = lectura.nextInt();

            switch (opcion) {

                case 1:
                    // Se genera el objeto "guerrero2" al que se le pasarán los parámetros por teclado a continuación.
                    Guerrero guerrero2 = new Guerrero();

                    System.out.println("\nNombre:");
                    nombre = lectura.next();
                    guerrero2.setNombre(nombre);

                    System.out.println("\nNivel:");
                    lvl = lectura.nextInt();
                    guerrero2.setLvl(lvl);

                    System.out.println("\nPuntos de salud:");
                    hp = lectura.nextInt();
                    guerrero2.setHp(hp);

                    System.out.println("\nPuntos de magia:");
                    mp = lectura.nextInt();
                    guerrero2.setMp(mp);

                    System.out.println("\nPuntos de fuerza:");
                    fuerza = lectura.nextInt();
                    guerrero2.setFuerza(fuerza);

                    System.out.println("\nDATOS DE TU PERSONAJE:");
                    System.out.println("**********************\n");
                    guerrero2.mostrarInformacion(); // Llamada al método para mostrar la información de "guerrero2".
                    System.out.println("Poder: " + guerrero2.calcularPoder() + "\n"); // Llamada al método para mostrar el poder de "guerrero2".

                    break;

                case 2:
                    // Se genera el objeto "mago2" al que se le pasarán los parámetros por teclado a continuación.
                    Mago mago2 = new Mago();
                    
                    System.out.println("\nNombre:");
                    nombre = lectura.next();
                    mago2.setNombre(nombre);

                    System.out.println("\nNivel:");
                    lvl = lectura.nextInt();
                    mago2.setLvl(lvl);

                    System.out.println("\nPuntos de salud:");
                    hp = lectura.nextInt();
                    mago2.setHp(hp);

                    System.out.println("\nPuntos de magia:");
                    mp = lectura.nextInt();
                    mago2.setMp(mp);

                    System.out.println("\nPuntos de inteligencia:");
                    inteligencia = lectura.nextInt();
                    mago2.setInteligencia(inteligencia);

                    System.out.println("\nDATOS DE TU PERSONAJE:");
                    System.out.println("**********************\n");
                    mago2.mostrarInformacion(); // Llamada al método para mostrar la información de "mago2".
                    System.out.println("Poder: " + mago2.calcularPoder() + "\n"); // Llamada al método para mostrar el poder de "mago2".
                    
                    break;
            }

        } while (opcion != 1 && opcion != 2); // El menú se repetirá mientras se escoja una opción distinta de 1 o 2.

    }

}
