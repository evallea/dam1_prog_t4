package trayecto;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // VARIABLES:
        Scanner lectura = new Scanner(System.in);
        int opcion;
        double entrada; // variable utilizada para ir construyendo los parámetros del objeto "coche1".

        // CREACIÓN DE OBJETO "coche1":
        Coche coche1 = new Coche();

        System.out.println("Introduce los Km realizados:");
        entrada = lectura.nextDouble();
        coche1.setKms(entrada);

        System.out.println("Introduce el tiempo transcurrido:");
        entrada = lectura.nextDouble();
        coche1.setTiempo(entrada);

        System.out.println("Introduce los litros de combustible consumidos:");
        entrada = lectura.nextDouble();
        coche1.setLitrosCombus(entrada);

        System.out.println("Introduce el precio del combustible (euro/litro):");
        entrada = lectura.nextDouble();
        coche1.setPrecioCombus(entrada);

        do {

            do {

                System.out.println("\nSELECCIONE UNA OPCIÓN:");
                System.out.println("1. Consultar datos del trayecto del vehículo");
                System.out.println("2. Consultar la velocidad media");
                System.out.println("3. Consultar consumo medio en litros a los 100 Km");
                System.out.println("4. Consultar consumo medio en euros a los 100 Km");
                System.out.println("5. Salir");

                opcion = lectura.nextInt();

            } while (opcion < 1 || opcion > 5);

            switch (opcion) {

                case 1:
                    System.out.println("\n********************");
                    System.out.println("Trayecto realizado:");
                    System.out.println(coche1.getKms() + " Km.");
                    System.out.println("Tiempo transcurrido:");
                    System.out.println(coche1.getTiempo() + " horas.");
                    System.out.println("Litros de combustible utilizados:");
                    System.out.println(coche1.getLitrosCombus() + " litros.");
                    System.out.println("Pecio del combustible utilizado:");
                    System.out.println(coche1.getPrecioCombus() + " euros/litro.");
                    System.out.println("********************");
                    break;
                case 2:
                    System.out.println("\n********************");
                    System.out.println("La velocidad media fue de: " + coche1.calcularVelocidad() + " Km/h.");
                    System.out.println("********************");
                    break;
                case 3:
                    System.out.println("\n********************");
                    System.out.println("El consumo medio en litros a los 100 Km fue de: " + coche1.consumoMedio() + " litros.");
                    System.out.println("********************");
                    break;
                case 4:
                    System.out.println("\n********************");
                    System.out.println("El consumo medio en euros a los 100 Km fue de: " + coche1.consumoEuros() + " euros.");
                    System.out.println("********************");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                default:
                    break;
            }

        } while (opcion != 5);
    }
}
