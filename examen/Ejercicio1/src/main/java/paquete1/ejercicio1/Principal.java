package paquete1.ejercicio1;

public class Principal {

    public static void main(String[] args) {

        // Se crea "prod1" con el constructor por defecto:
        Farmacia prod1 = new Farmacia();

        // Se asignan valores a los atributos mediante los métodos "set":
        prod1.setProducto("tiritas");
        prod1.setCantidad(2);
        prod1.setPrecio(2);

        // Se crea "prod2" con el constructor con parámetros:
        Farmacia prod2 = new Farmacia("melatonina", 4, 15);

        // Se crea "prod3" con el constructor copia:
        Farmacia prod3 = new Farmacia(prod2);

        System.out.println(prod1.toString());
        System.out.println("Su precio total es de: " + prod1.calculaPrecio() + " euros.");

        System.out.println("**********");

        System.out.println(prod2.toString());
        System.out.println("Su precio total es de: " + prod2.calculaPrecio() + " euros.");

    }

}
