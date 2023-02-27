package ejercicio1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*// Variables para usar en el constructor por defecto:
        Scanner lectura = new Scanner(System.in);
        String tituloLibro;
        String nombreAutor;
        int numEjemplares;
        int numPrestados;

        // USANDO EL CONSTRUCTOR POR DEFECTO:
        Libro libro1 = new Libro();

        // Establecemos título del libro:
        System.out.println("Título del libro:");
        tituloLibro = lectura.nextLine();
        libro1.setTitulo(tituloLibro);

        // Establecemos nombre del autor:
        System.out.println("Nombre del autor:");
        nombreAutor = lectura.nextLine();
        libro1.setAutor(nombreAutor);

        // Establecemos ejemplares actuales:
        System.out.println("Ejemplares en stock:");
        numEjemplares = lectura.nextInt();
        libro1.setEjemplares(numEjemplares);

        // Establecemos ejemplares prestados:
        System.out.println("Ejemplares prestados:");
        numPrestados = lectura.nextInt();
        libro1.setPrestados(numPrestados);

        // Se muestran los datos actuales:
        System.out.println(libro1.toString());

        System.out.println("\n**********\n");*/

        // USANDO EL CONSTRUCTOR CON PARÁMETROS (Y PROBANDO LOS MÉTODOS DE PRÉSTAMOS Y DEVOLUCIONES):
        Libro libro2 = new Libro("El Quijote", "Cervantes", 5, 2); // Hay 7 ejemplares en total, 5 en stock y 2 prestados.

        // Se prestan 3 ejemplares más:
        libro2.prestamo(); // 4 en stock y 3 prestados.
        libro2.prestamo(); // 3 en stock y 4 prestados.
        libro2.prestamo(); // 2 en stock y 5 prestados.

        // Se devuelve 1 ejemplar:
        libro2.devolucion(); // 3 en stock y 4 prestados.

        // Se muestran los datos actuales:
        System.out.println(libro2.toString());

    }
}
