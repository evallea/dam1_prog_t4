package com.mycompany.ejercicio5;

/**
 *
 * @author Enrique Valle Alcega
 */
public class Rebajas {
    
    // ATRIBUTOS:
    double pOriginal;
    double pRebajado;
    
    // CONSTRUCTOR POR PARÁMETROS:
    Rebajas(double pOriginal, double pRebajado) {
        this.pOriginal = pOriginal;
        this.pRebajado = pRebajado;
    }
    
    // MÉTODOS GET Y SET:
    public double getpOriginal() {
        return pOriginal;
    }

    public void setpOriginal(double pOriginal) {
        this.pOriginal = pOriginal;
    }

    public double getpRebajado() {
        return pRebajado;
    }

    public void setpRebajado(double pRebajado) {
        this.pRebajado = pRebajado;
    }
    
    // MÉTODO PARA AVERIGUAR DESCUENTO:
    public double averiguarDescuento(){
       return ((pOriginal-pRebajado)/pOriginal)*100; // Se resta el precio original con el precio rebajado y el resultado se divide entre el precio original. Finalmente se multiplica por 100. 
    }
    
}
