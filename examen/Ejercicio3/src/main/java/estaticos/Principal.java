package estaticos;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        // ATRIBUTOS:
        Scanner lectura = new Scanner(System.in);
        int opcion;

        do { // Se muestra el siguiente menú:
            System.out.println("1. Mayor de los tres números.");
            System.out.println("2. Descuento aplicado.");
            System.out.println("3. Números romanos.");
            System.out.println("4. Volumen de la esfera.");
            System.out.println("5. Salir.");

            opcion = lectura.nextInt(); // Se introduce la opción del menú por teclado.

            switch (opcion) {
                case 1:
                    System.out.println("Introduce tres números:");
                    Metodos.numeroMayor(lectura.nextInt(), lectura.nextInt(), lectura.nextInt()); // Llamada al método estático.
                    break;
                case 2:
                    System.out.println("Introduce precio original y rebajado:");
                    Metodos.porcentajeDescuento(lectura.nextDouble(), lectura.nextDouble()); // Llamada al método estático.
                    break;
                case 3:
                    System.out.println("Introduce un número:");
                    Metodos.numerosRomanos(lectura.nextInt()); // Llamada al método estático.
                    break;
                case 4:
                    System.out.println("Introduce un valor para el radio:");
                    Metodos.volumenEsfera(lectura.nextDouble()); // Llamada al método estático.
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;

            }

        } while (opcion != 5); // Se repetirá el menú mientras la opción no sea 5.

    }
}
