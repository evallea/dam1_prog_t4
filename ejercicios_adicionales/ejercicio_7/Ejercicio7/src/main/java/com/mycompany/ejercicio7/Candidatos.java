package com.mycompany.ejercicio7;

/**
 *
 * @author Enrique Valle Alcega
 */
public class Candidatos {

    String nombre;
    int edad;
    int votos;

    static String mejorCandidato;
    static int votosMejorCandidato;

    public Candidatos() {
    }

    public Candidatos(String nombre, int edad, int votos) {
        this.nombre = nombre;
        this.edad = edad;
        this.votos = votos;
    }

    // MÉTODOS GET Y SET:
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public static String getMejorCandidato() {
        return mejorCandidato;
    }

    public static void setMejorCandidato(String mejorCandidato) {
        Candidatos.mejorCandidato = mejorCandidato;
    }

    public static int getVotosMejorCandidato() {
        return votosMejorCandidato;
    }

    public static void setVotosMejorCandidato(int votosMejorCandidato) {
        Candidatos.votosMejorCandidato = votosMejorCandidato;
    }

    // OTROS MÉTODOS:
    public boolean buscaMejorCandidato(int edadMinima) {
        if (edad > edadMinima && votos > 100) {
            return true;
        } else {
            return false;
        }
    }

    public double costeCampaña(double costePublicidad, double costesVarios) {
        costesVarios = costesVarios - (votos * 100);
        if (edad > 50) {
            return (costePublicidad + costesVarios) - 20;
        } else {
            return costePublicidad + costesVarios;
        }
    }

}
