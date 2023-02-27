package com.mycompany.ejercicio3;

/**
 *
 * @author Enrique Valle Alcega
 */
public class Contador {

    // ATRIBUTOS:
    int cont;

    // CONSTRUCTORES:
    Contador() {
    }

    Contador(int cont) {
        if (cont < 0) { // Si se introduce un número negativo, se establece en cero.
            cont = 0;
        }
        this.cont = cont;
    }

    // MÉTODOS GET Y SET:
    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    // MÉTODO INCREMENTAR:
    public void Incrementar() {
        cont++;
    }

    // MÉTODO DECREMENTAR:
    public void Decrementar() {
        if (cont > 0) { // Solo se decrementa si "cont" es mayor que cero.
            cont--;
        }
    }

}
