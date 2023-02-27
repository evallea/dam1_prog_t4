package fruteria;

public class Fruta extends Producto {

    // ATRIBUTOS:
    protected boolean estadoOptimo; // Se establece en "protected" para que pueda ser llamado en el apartado 3 del menú de la clase Principal.
    private String tipo;

    // CONSTRUCTOR POR DEFECTO:
    Fruta() {
    }

    // CONSTRUCTOR CON PARÁMETROS:
    Fruta(int codigo, double precioBase, boolean estadoOptimo, String tipo) {
        super(codigo, precioBase); // Obtiene los parámetros de la clase Producto mediante el método "super".
        this.estadoOptimo = estadoOptimo;
        this.tipo = tipo;
    }

    // MÉTODOS GET Y SET:
    public boolean getEstadoOptimo() {
        return estadoOptimo;
    }

    public void setEstadoOptimo(boolean estadoOptimo) {
        this.estadoOptimo = estadoOptimo;
    }

    @Override
    public double calcularPrecio() {
        double precioFinal;
        precioFinal = precioBase + (precioBase * 0.4); // El precio final es igual al precio base más el 4% del mismo.
        return precioFinal; // Devuelve el precio final.
    }

    @Override
    public String toString() {
        return "\nCódigo: " + codigo + "\nTipo: " + tipo + "\nEstado: " + estadoOptimo + "\nPrecio final: " + calcularPrecio() + " euros.";
    }

    public boolean validarCodigo() {
        String codigoString = Integer.toString(codigo);
        if (codigoString.length() == 3) { // Si el código introducido tiene 3 carácteres exactamente, devuelve "true".
            return true;
        } else {
            return false;
        }
    }

    /*// Ejemplo del método anterior pero sin utilizar String:
    public boolean validarCodigo(){
        int contador=0; // Se crea una variable de tipo int para usar como contador;
        while (codigo>0) {
            contador++;
            codigo=codigo/10; // Mientras "codigo" sea mayor que cero, se suma 1 al contador, y el valor de "codigo" se actualiza a su valor dividido entre 10.
        }
        if (contador==3){ // Si "contador" es exactamente 3 cuando se sale del bucle anterior, querrá decir que al dividirse "codigo" tres veces entre 10, el resultado es igual o menor que 0, y por tanto tendrá tres dígitos.
            return true;
        } else {
            return false;
        }   
    }*/
}
