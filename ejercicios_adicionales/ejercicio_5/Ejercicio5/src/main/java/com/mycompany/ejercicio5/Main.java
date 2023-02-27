package com.mycompany.ejercicio5;

/**
 *
 * @author Enrique Valle Alcega
 */
public class Main {

    public static void main(String[] args) {

        Rebajas producto1 = new Rebajas(100, 20);
        Rebajas producto2 = new Rebajas(50, 25);
        Rebajas producto3 = new Rebajas(75, 36);
        Rebajas producto4 = new Rebajas(100, 80);

        System.out.println(producto1.averiguarDescuento() + "%");
        System.out.println(producto2.averiguarDescuento() + "%");
        System.out.println(producto3.averiguarDescuento() + "%");
        System.out.println(producto4.averiguarDescuento() + "%");

    }

}
