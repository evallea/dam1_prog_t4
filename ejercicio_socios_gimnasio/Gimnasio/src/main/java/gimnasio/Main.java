package gimnasio;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // VARIABLES:
        Scanner lectura = new Scanner(System.in);
        int opcion;

        // CREACIÓN DE OBJETO:
        Socio socio1 = new Socio();

        // MENÚ:
        do {

            System.out.println("\nSELECCIONE UNA OPCIÓN:");
            System.out.println("1. Dar de alta al socio.");
            System.out.println("2. Mostrar los datos del socio.");
            System.out.println("3. Calcular cuota.");
            System.out.println("4. Salir.\n");

            opcion = lectura.nextInt();

            switch (opcion) {

                case 1:
                    socio1.pedirNombre();
                    socio1.pedirNumSocio();
                    break;
                case 2:
                    socio1.mostrarDatos();
                    break;
                case 3:
                    break;
                case 4:
                    break;

            }

        } while (opcion != 4);

    }
    
}
