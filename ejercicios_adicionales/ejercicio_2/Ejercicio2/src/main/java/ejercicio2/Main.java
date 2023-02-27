package ejercicio2;

import java.util.*;

/**
 * @author Enrique Valle Alcega
 */
public class Main {

    public static void main(String[] args) {

        // VARIABLES:
        String nombreCliente; // Almacena el nombre del cliente introducido.
        String numCuenta; // Almacena el número de cuenta introducido.
        double tipoInteres; // Almacena el tipo de interés introducido.
        double saldo; // Almacena el saldo introducido.
        Scanner lectura = new Scanner(System.in); // Se utiliza para las entradas del teclado.
        double ingreso; // Almacena la cantidad a ingresar.
        double reintegro; // Almacena la cantidad a reintegrar.
        double transferencia; // Almacena la cantidad a transferir.
        int opcion; // Se utiliza para conformar el menú.

        // CREACIÓN DE LOS OBJETOS:
        Cuenta cuenta1 = new Cuenta(); // Objeto que conforma la cuenta del usuario.
        Cuenta cuenta2 = new Cuenta(); // Objeto que conforma una segunda cuenta para poder utilizarla para transferir dinero a ella.

        // INTRODUCCIÓN DE DATOS (cuenta1):
        System.out.println("Nombre:");
        nombreCliente = lectura.nextLine();
        cuenta1.setNombreCliente(nombreCliente);

        System.out.println("Número de cuenta:");
        numCuenta = lectura.nextLine();
        cuenta1.setNumCuenta(numCuenta);

        System.out.println("Tipo de interés:");
        tipoInteres = lectura.nextDouble();
        cuenta1.setTipoInteres(tipoInteres);

        System.out.println("Saldo:");
        saldo = lectura.nextDouble();
        cuenta1.setSaldo(saldo);

        /*// INGRESO DE 50 EUROS:
        System.out.println("\nSaldo actual: " + cuenta1.saldo);
        cuenta1.ingresar(50);
        System.out.println("Con ingreso de 50 euros: " + cuenta1.saldo);

        // REINTEGRO DE 2 EUROS:
        cuenta1.reintegrar(2);
        System.out.println("Con reintegro de 2 euros: " + cuenta1.saldo);

        // TRANSFERENCIA DE 1000 EUROS:
        cuenta1.transferir(cuenta2, 1000);
        System.out.println("Saldo tras enviar 1000 euros a otra cuenta: " + cuenta1.saldo);
        System.out.println("Saldo de la cuenta destino: " + cuenta2.saldo);*/
        
        // MENÚ DE OPCIONES:
        do {

            System.out.println("\nSELECCIONA UNA OPERACIÓN:");
            System.out.println("1. INGRESAR DINERO.");
            System.out.println("2. REINTEGRAR DINERO.");
            System.out.println("3. TRANSFERIR DINERO.");
            System.out.println("4. SALIR.");

            opcion = lectura.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Introduce una cantidad a ingresar:");
                    ingreso = lectura.nextDouble();
                    cuenta1.ingresar(ingreso); // Llamada al método "ingresar".
                    System.out.println("\nDATOS DE TU CUENTA ACTUALIZADOS:");
                    System.out.println("********************************");
                    System.out.println(cuenta1.toString()); // Llamada al método "toString".
                    break;
                case 2:
                    System.out.println("Introduce una cantidad a reintegrar:");
                    reintegro = lectura.nextDouble();
                    cuenta1.reintegrar(reintegro); // Llamada al método "reintegrar".
                    System.out.println("\nDATOS DE TU CUENTA ACTUALIZADOS:");
                    System.out.println("********************************");
                    System.out.println(cuenta1.toString()); // Llamada al método "toString".
                    break;
                case 3:
                    System.out.println("Introduce una cantidad a transferir:");
                    transferencia = lectura.nextDouble();
                    cuenta1.transferir(cuenta2, transferencia); // Llamada al método "transferir".
                    System.out.println("La cuenta destino ahora tiene: " + cuenta2.getSaldo()); // Línea adicional para mostrar el saldo de la cuenta destino.
                    System.out.println("\nDATOS DE TU CUENTA ACTUALIZADOS:");
                    System.out.println("********************************");
                    System.out.println(cuenta1.toString()); // Llamada al método "toString".
                    break;
                case 4:
                    System.out.println("¡Hasta la vista, " + cuenta1.getNombreCliente() + "!");
                    break;

            }

        } while (opcion != 4);

    }

}
