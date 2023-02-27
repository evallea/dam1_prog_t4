package gimnasio;

import java.util.*;

public class Socio {

    // VARIABLES:
    String nombre;
    int numSocio;

    String numSocioString;
    Scanner lectura = new Scanner(System.in);

    // CONSTRUCTOR POR DEFECTO:
    public Socio() {
    }

    // CONSTRUCTOR CON PARÁMETROS:
    public Socio(String nombre, int numSocio) {
        this.nombre = nombre;
        this.numSocio = numSocio;
    }

    // CONSTRUCTOR COPIA:
    public Socio(Socio socio1) {
        this.nombre = socio1.getNombre();
        this.numSocio = socio1.getNumSocio();
    }

    // GETS Y SETS:
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    // MÉTODOS:
    public String pedirNombre() {

        do {
            System.out.println("Introduce tu nombre (entre 6 y 30 carácteres):");
            nombre = lectura.nextLine();
        } while (nombre.length() < 6 || nombre.length() > 30);

        return nombre;
    }

    public int pedirNumSocio() {
        boolean repetir;
        repetir = false;
        do {
            System.out.println("Escribe el número de socio:");
            numSocio = lectura.nextInt();
            if (!validarNumSocio(numSocio)) {
                System.out.println("No válido.");
            }
        } while (repetir);
        return numSocio;
    }

    public static boolean validarNumSocio(int numSocio) {
        String num = Integer.toString(numSocio);
        if (num.length() == 6 && (numSocio % 19) % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public double calcularPago() {
        return 55 * 1.21; // Se añade el IVA multiplicándolo por 1.21.
    }

    public void mostrarDatos() {
        System.out.println("Nombre del socio:");
        System.out.println(nombre);
        System.out.println("Número de socio:");
        System.out.println(numSocio);
    }

}
