package com.mycompany.ejercicio6;

/**
 *
 * @author Enrique Valle Alcega
 */
public class Consumo {

    double kmsRecorridos;
    double litrosConsumidos;
    double velocidadMedia; // En Km/h
    double precioGasolina;

    public Consumo(double kmsRecorridos, double litrosConsumidos, double velocidadMedia, double precioGasolina) {
        this.kmsRecorridos = kmsRecorridos;
        this.litrosConsumidos = litrosConsumidos;
        this.velocidadMedia = velocidadMedia;
        this.precioGasolina = precioGasolina;
    }

    // MÉTODOS:
    public double getTiempo() {
        return kmsRecorridos / velocidadMedia;
    }

    public double consumoMedio() {
        return litrosConsumidos / kmsRecorridos * 100;
    }

    public double consumoEuros() {
        return (litrosConsumidos / kmsRecorridos) * precioGasolina * 100;
    }

    public void mostrarDatos() {
        System.out.println("Kms recorridos: " + kmsRecorridos);
        System.out.println("Litros consumidos: " + litrosConsumidos);
        System.out.println("Velocidad media: " + velocidadMedia + " Km/h");
        System.out.println("Precio de la gasolina: " + precioGasolina + " €");
    }

}
