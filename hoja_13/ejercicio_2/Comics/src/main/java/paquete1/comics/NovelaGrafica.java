package paquete1.comics;

public class NovelaGrafica extends Comic {
   
    // VARIABLES:
    int numPag;
    
    // CONSTRUCTOR POR DEFECTO:
    public NovelaGrafica() {
    }
    
    // CONSTRUCTOR CON PARÁMETROS:
    public NovelaGrafica(String titulo, String guionista, String dibujante, int numero, int numPag) { // Hereda los parámetros de la clase "Comic".
        super(titulo, guionista, dibujante, numero);
        this.numPag = numPag;
    }
    
    // GETS Y SETS:

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
    
}
