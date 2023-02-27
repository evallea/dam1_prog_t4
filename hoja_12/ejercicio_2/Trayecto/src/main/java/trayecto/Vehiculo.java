package trayecto;

public abstract class Vehiculo {

    // ATRIBUTOS:
    double kms; // Kilómetros recorridos en el trayecto.
    double tiempo; // Tiempo en horas empleado en el trayecto.

    // MÉTODO ABSTRACTO:
    public abstract double calcularVelocidad();
    
    // GETS Y SETS:
    public double getKms() {
        return kms;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

}
