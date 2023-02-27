package paquete1.comics;

public class CreaComic {

    public static void main(String[] args) {

        // CREACIÓN DEL OBJETO "c1" USANDO EL CONSTRUCTOR CON PARÁMETROS;
        // Comic c1 = new Comic("Watchmen", "Alan Moore", "Dave Gibbons", 3);
        // System.out.println("El título el cómic es: " + c1.getTitulo());
        
        // CREACIÓN DEL OBJETO "comicWatchmen" MEDIANTE ARRAY:
        Comic comicWatchmen[] = new Comic[12];

        // DAR VALORES MEDIANTE BUCLE "FOR":
        for (int i = 0; i < 12; i++) {
            comicWatchmen[i] = new Comic();
            comicWatchmen[i].setTitulo("Watchmen");
            comicWatchmen[i].setGuionista("Alan Moore");
            comicWatchmen[i].setDibujante("Dave Gibbons");
            comicWatchmen[i].setNumero(i + 1);
        }
        
        /*// DAR VALORES SIN BUCLE "FOR":
        comicWatchmen[0] = new Comic("Watchmen", "Alan Moore", "Dave Gibbons", 1);
        comicWatchmen[1] = new Comic("Watchmen", "Alan Moore", "Dave Gibbons", 2);
        comicWatchmen[2] = new Comic("Watchmen", "Alan Moore", "Dave Gibbons", 3);
        comicWatchmen[3] = new Comic("Watchmen", "Alan Moore", "Dave Gibbons", 4);
        comicWatchmen[4] = new Comic("Watchmen", "Alan Moore", "Dave Gibbons", 5);
        comicWatchmen[5] = new Comic("Watchmen", "Alan Moore", "Dave Gibbons", 6);
        comicWatchmen[6] = new Comic("Watchmen", "Alan Moore", "Dave Gibbons", 7);
        comicWatchmen[7] = new Comic("Watchmen", "Alan Moore", "Dave Gibbons", 8);
        comicWatchmen[8] = new Comic("Watchmen", "Alan Moore", "Dave Gibbons", 9);
        comicWatchmen[9] = new Comic("Watchmen", "Alan Moore", "Dave Gibbons", 10);
        comicWatchmen[10] = new Comic("Watchmen", "Alan Moore", "Dave Gibbons", 11);
        comicWatchmen[11] = new Comic("Watchmen", "Alan Moore", "Dave Gibbons", 12);*/
        
        System.out.println(comicWatchmen[8].mostrarInformacion());

        // CREACIÓN DEL OBJETO "novelaGrafica1" USANDO EL CONSTRUCTOR CON PARÁMETROS:
        NovelaGrafica novelaGrafica1 = new NovelaGrafica("Los Campbell: El Oro de San Brandamo", "José Luis Munuera", "José Luis Munuera", 4, 56);

        System.out.println(novelaGrafica1.mostrarInformacion() + "\nTiene un total de: " + novelaGrafica1.getNumPag() + " páginas.");

    }
}
