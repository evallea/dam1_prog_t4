package estaticos;

public class Metodos {

    public static void numeroMayor(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println("El mayor es: " + num1);
        }
        if (num2 > num1 && num2 > num3) {
            System.out.println("El mayor es: " + num2);
        }
        if (num3 > num1 && num3 > num2) {
            System.out.println("El mayor es: " + num3);
        }
    }

    public static void porcentajeDescuento(double pOriginal, double pRebajado) {
        double descuento;
        descuento = (pOriginal - pRebajado) / pOriginal * 100;
        System.out.println("El descuento es de: " + descuento + "%");
    }

    public static void numerosRomanos(int numRomano) {
        if (numRomano == 1) {
            System.out.println("I");
        } else if (numRomano == 5) {
            System.out.println("V");
        } else if (numRomano == 10) {
            System.out.println("X");
        } else if (numRomano == 50) {
            System.out.println("L");
        } else if (numRomano == 100) {
            System.out.println("C");
        }
    }

    public static void volumenEsfera(double r) {
        double volumen;
        volumen = (4.0 / 3.0) * (Math.PI) * (Math.pow(r, 3.0));
        System.out.println("El volumen es: " + volumen);
    }

}
