package com.mycompany.ejercicio3;

/**
 *
 * @author Enrique Valle Alcega
 */
public class Main {

    public static void main(String[] args) {

        Contador c1 = new Contador(-5);

        // Se muestra por pantalla el valor actual, que debería ser -5, pero será 0:
        System.out.println(c1.getCont()); // Aunque el valor dado para "cont" en el objeto "c1" es -5, se muestra 0, ya que así lo establece el constructor por parámetros.

        // Se incrementa dos veces, de 0 a 2:
        c1.Incrementar();
        c1.Incrementar();
        System.out.println(c1.getCont());

        // Se decrementa una vez, de 2 a 1:
        c1.Decrementar();
        System.out.println(c1.getCont());

        // Se decrementa dos veces más, debería ser -1, pero es 0 ya que el método "Decrementar" tiene una condición que así lo establece:
        c1.Decrementar();
        c1.Decrementar();
        System.out.println(c1.getCont());

        // Se incrementa dos veces más, de 0 a 2:
        c1.Incrementar();
        c1.Incrementar();
        System.out.println(c1.getCont());

    }

}
