package fruteria;

public abstract class Producto {

    // ATRIBUTOS:
    int codigo;
    double precioBase;

    // CONSTRUCTOR POR DEFECTO:
    public Producto() {
    }

    // CONSTRUCTOR CON PARÁMETROS:
    public Producto(int codigo, double precioBase) {
        this.codigo = codigo;
        this.precioBase = precioBase;
    }

    // MÉTODO ABSTRACTO:
    public abstract double calcularPrecio();

}
