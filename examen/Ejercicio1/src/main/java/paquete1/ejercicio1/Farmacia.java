package paquete1.ejercicio1;

public class Farmacia {

    String producto;
    int cantidad;
    double precio;

    // CONSTRUCTOR POR DEFECTO:
    Farmacia() {
    }

    // CONSTRUCTOR POR PARÁMETROS:
    Farmacia(String producto, int cantidad, double precio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    // CONSTRUCTOR COPIA:
    Farmacia(Farmacia copia) {
        this.producto = copia.getProducto();
        this.cantidad = copia.getCantidad();
        this.precio = copia.getPrecio();
    }

    // MÉTODOS GET Y SET:
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // MÉTODO "toString":
    @Override
    public String toString() {
        return "Producto: " + producto + "\nCantidad: " + cantidad;
    }

    // MÉTODO "calculaPrecio":
    public double calculaPrecio() {
        double precioTotal;
        precioTotal = cantidad * precio; // El precio total de los productos.
        if (precioTotal < 30) { // Si el precio total es menor que 30 euros, se aplica un 10% adicional.
            precioTotal = precioTotal + (precioTotal * 0.10);
        } else { // En caso contrario, se aplica un 18% adicional.
            precioTotal = precioTotal + (precioTotal * 0.18);
        }
        return precioTotal; // Devuelve el precio total con los cálculos realizados.
    }
}
