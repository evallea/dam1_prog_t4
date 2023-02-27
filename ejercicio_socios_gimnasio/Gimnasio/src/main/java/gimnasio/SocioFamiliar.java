package gimnasio;

public class SocioFamiliar extends Socio {

    // VARIABLES:
    int numHijos;

    // CONSTRUCTOR POR DEFECTO:
    public SocioFamiliar() {
    }

    // CONSTRUCTOR CON PARÁMETROS:
    public SocioFamiliar(int numHijos, String nombre, int numSocio) {
        super(nombre, numSocio);
        this.numHijos = numHijos;
    }
    
    // CONSTRUCTOR COPIA:
    public SocioFamiliar(SocioFamiliar socioF)  {
        this.numHijos=socioF.numHijos;
    }

    // GETS Y SETS:
    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

}
