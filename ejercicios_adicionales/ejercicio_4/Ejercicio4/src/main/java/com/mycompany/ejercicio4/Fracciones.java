package com.mycompany.ejercicio4;

/**
 *
 * @author Enrique Valle Alcega
 */
public class Fracciones {

    // ATRIBUTOS:
    int numerador;
    int denominador;

    // CONSTRUCTOR POR PARÁMETROS:
    Fracciones(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    // MÉTODO PARA MOSTRAR LA FRACCIÓN:
    public void mostrarFraccion() {
        System.out.println("La fracción es: " + numerador + "/" + denominador);
    }

}
