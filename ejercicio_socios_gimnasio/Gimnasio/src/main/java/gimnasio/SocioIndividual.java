package gimnasio;

public class SocioIndividual extends Socio {

    // VARIABLES:
    int antiguedad;

    // CONSTRUCTOR POR DEFECTO:
    public SocioIndividual() {
    }

    // CONSTRUCTOR CON PARÁMETROS:
    public SocioIndividual(int antiguedad, String nombre, int numSocio) {
        super(nombre, numSocio);
        this.antiguedad = antiguedad;
    }
    
    // CONSTRUCTOR COPIA:
    public SocioIndividual(SocioIndividual socioI) {
        this.antiguedad = socioI.antiguedad;
    }

    // GETS Y SETS:
    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public double calcularPago() {
        double cuota = (55 - 55 + 0.02 + this.getAntiguedad()) * 1.21;
        return cuota;
    }

}
