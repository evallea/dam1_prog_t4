package ejercicio1;

public class Libro {

    String titulo;
    String autor;
    int ejemplares;
    int prestados;

    // CONSTRUCTOR POR DEFECTO:
    public Libro() {
    }

    // CONSTRUCTOR CON PARÁMETROS:
    public Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    // GETS Y SETS:
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    // MÉTODO PARA PRESTADOS:
    public boolean prestamo() {

        if (ejemplares > 0) {
            prestados++;
            ejemplares--;
            return true;
        } else {
            return false;
        }
    }

    // MÉTODO PARA DEVOLUCIONES:
    public boolean devolucion() {

        if (prestados > 0) {
            ejemplares++;
            prestados--;
            return true;
        } else {
            return false;
        }
    }
    
    // MÉTODO PARA MOSTRAR LOS DATOS DE LOS LIBROS:
    @Override // Se usa para sobreescribir el método toString ya existente en Java y así evitar problemas.
    public String toString() {
        String cadena = ("Título: " + titulo + "\nAutor: " + autor + "\nHay " + ejemplares + " ejemplar(es) en stock" + " y " + prestados + " ejemplar(es) prestado(s).");
        return cadena;
    }
}
