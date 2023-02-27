package ejercicio2;

/**
 * @author Enrique Valle Alcega
 */
public class Cuenta {

    // VARIABLES:
    String nombreCliente;
    String numCuenta;
    double tipoInteres;
    double saldo;

    // CONSTRUCTOR POR DEFECTO:
    public Cuenta() {
    }

    /*// CONSTRUCTOR CON PARÁMETROS:
    public Cuenta(String nombreCliente, String numCuenta, double tipoInteres, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numCuenta = numCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }*/

    // GETS Y SETS:
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // MÉTODO INGRESAR (aumenta el saldo en una cantidad):
    public boolean ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo = saldo + cantidad;
            return true;
        } else {
            System.out.println("Debes introducir una cantidad mayor que 0.");
            return false;
        }
    }

    // MÉTODO REINTEGRAR (disminuye el saldo en una cantidad):
    public boolean reintegrar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) { // Para que el saldo se pueda disminuir una cantidad concreta, la cantidad debe ser al menos menor o igual al saldo de la cuenta.
            saldo = saldo - cantidad;
            return true;
        } else {
            System.out.println("No hay saldo suficiente para realizar el reintegro.");
            return false;
        }
    }

    // MÉTODO TRANSFERIR:
    public boolean transferir(Cuenta destino, double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo = saldo - cantidad;
            destino.ingresar(cantidad);
            return true;
        } else {
            return false;
        }
    }

    // MÉTODO PARA MOSTRAR LOS DATOS DE LA CUENTA:
    @Override // Se usa para sobreescribir el método toString ya existente en Java y así evitar problemas.
    public String toString() {
        String cadena = ("Nombre del cliente: " + nombreCliente + "\nNúmero de cuenta: " + numCuenta + "\nTipo de interés: " + tipoInteres + "\nSaldo: " + saldo);
        return cadena;
    }

}
