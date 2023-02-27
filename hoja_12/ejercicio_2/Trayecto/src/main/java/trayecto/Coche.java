package trayecto;

public class Coche extends Vehiculo {

    // ATRIBUTOS:
    double litrosCombus; // Litros de combustible consumido en el trayecto.
    double precioCombus; // Precio del combustible (euros/litro).

    // CONSTRUCTOR POR DEFECTO:
    public Coche(){
        
    }
    
    /*// CONSTRUCTOR CON PARÁMETROS:
    public Coche(double kms, double tiempo, double litrosCombus, double precioCombus) {
        this.kms = kms;
        this.tiempo = tiempo;
        this.litrosCombus = litrosCombus;
        this.precioCombus = precioCombus;
    }*/

    // MÉTODOS:
    @Override
    public double calcularVelocidad() { // La velocidad = Kilómetros / Horas
        return super.getKms() / super.getTiempo();
    }

    public double consumoMedio() { // Consumo medio del vehículo (en litros cada 100 kilómetros).
        return (litrosCombus / kms) * 100; // Primero se calculan los litros por cada unidad de Km, y luego se multiplica por 100 para calcularlo cada 100 Km.
    }

    public double consumoEuros() { // Consumo medio del vehículo (en euros cada 100 Kilómetros).
        return consumoMedio() * precioCombus;
    }

    // GETS Y SETS:
    public double getLitrosCombus() {
        return litrosCombus;
    }

    public void setLitrosCombus(double litrosCombus) {
        this.litrosCombus = litrosCombus;
    }

    public double getPrecioCombus() {
        return precioCombus;
    }

    public void setPrecioCombus(double precioCombus) {
        this.precioCombus = precioCombus;
    }

}
