package fruteria;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        int opcion;

        Fruta fruta1 = new Fruta(123, 4, true, "manzana");
        Fruta fruta2 = new Fruta(4536, 1, true, "plátano");
        Fruta fruta3 = new Fruta(789, 2, false, "pera");
        Fruta fruta4 = new Fruta(9847, 3, true, "melocotón");
        Fruta fruta5 = new Fruta(987, 5, false, "kiwi");

        System.out.println("1- Muestra la información de todos los objetos.");
        System.out.println("2- Validar código.");
        System.out.println("3- Recogida para fábrica.");

        opcion = lectura.nextInt();

        switch (opcion) {
            case 1:
                System.out.println(fruta1.toString());
                System.out.println(fruta2.toString());
                System.out.println(fruta3.toString());
                System.out.println(fruta4.toString());
                System.out.println(fruta5.toString());
                break;
            case 2:
                if (fruta1.validarCodigo()) {
                    System.out.println("Código correcto.");
                } else {
                    System.out.println("Código incorrecto.");
                }
                if (fruta2.validarCodigo()) {
                    System.out.println("Código correcto.");
                } else {
                    System.out.println("Código incorrecto.");
                }
                if (fruta3.validarCodigo()) {
                    System.out.println("Código correcto.");
                } else {
                    System.out.println("Código incorrecto.");
                }
                if (fruta4.validarCodigo()) {
                    System.out.println("Código correcto.");
                } else {
                    System.out.println("Código incorrecto.");
                }
                if (fruta5.validarCodigo()) {
                    System.out.println("Código correcto.");
                } else {
                    System.out.println("Código incorrecto.");
                }
                break;
            case 3:
                if (fruta1.getEstadoOptimo() == false) {
                    System.out.println(fruta1.toString());
                }
                if (fruta2.estadoOptimo == false) {
                    System.out.println(fruta2.toString());
                }
                if (fruta3.estadoOptimo == false) {
                    System.out.println(fruta3.toString());
                }
                if (fruta4.estadoOptimo == false) {
                    System.out.println(fruta4.toString());
                }
                if (fruta5.estadoOptimo == false) {
                    System.out.println(fruta5.toString());
                }
                break;
        }

    }

}
