package com.mycompany.ejercicio6;

/**
 *
 * @author Enrique Valle Alcega
 */
public class Main {

    public static void main(String[] args) {
        
        Consumo coche1 = new Consumo(100,5,20,7);
        
        coche1.mostrarDatos();
        
        System.out.println("\nTiempo empleado en realizar el viaje: " + coche1.getTiempo() + " horas.");
        System.out.println("\nConsumo medio de gasolina durante el viaje (por cada 100 km): " + coche1.consumoMedio() + " litros.");
        System.out.println("\nConsumo medio de euros durante el viaje (por cada 100 km): " + coche1.consumoEuros() + " euros.");
    }

}
