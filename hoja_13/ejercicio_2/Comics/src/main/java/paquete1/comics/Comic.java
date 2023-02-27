package paquete1.comics;

public class Comic {

    // VARIABLES:
    String titulo;
    String guionista;
    String dibujante;
    int numero;

    // CONSTRUCTOR POR DEFECTO:
    public Comic() {
    }

    // CONSTRUCTOR CON PARÁMETROS:
    public Comic(String titulo, String guionista, String dibujante, int numero) {
        this.titulo = titulo;
        this.guionista = guionista;
        this.dibujante = dibujante;
        this.numero = numero;
    }
    
    // GETS Y SETS:
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGuionista() {
        return guionista;
    }

    public void setGuionista(String guionista) {
        this.guionista = guionista;
    }

    public String getDibujante() {
        return dibujante;
    }

    public void setDibujante(String dibujante) {
        this.dibujante = dibujante;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    // MÉTODO PARA MOSTRAR TODA LA INFORMACIÓN DEL OBJETO:
    public String mostrarInformacion() {
        return "\nTítulo: " +  titulo + "\nGuionista: " + guionista + "\nDibujante: " + dibujante + "\nNúmero: " + numero;
    }

}
