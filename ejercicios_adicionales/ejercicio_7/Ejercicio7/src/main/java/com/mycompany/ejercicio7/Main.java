package com.mycompany.ejercicio7;

/**
 *
 * @author Enrique Valle Alcega
 */
public class Main {

    public static void main(String[] args) {

        // CREANDO UN CANDIDATO CON EL CONSTRUCTOR POR DEFECTO:
        Candidatos candidato1 = new Candidatos();

        candidato1.setNombre("Rocío");
        candidato1.setEdad(28);
        candidato1.setVotos(122);

        // CREANDO UN CANDIDATO CON EL CONSTRUCTOR POR PARÁMETROS:
        Candidatos candidato2 = new Candidatos("Iroh", 64, 124);

        // PROBANDO LOS MÉTODOS:
        if (candidato1.buscaMejorCandidato(30)) {
            System.out.println(candidato1.getNombre() + " es un candidato mejor con " + candidato1.getVotos() + " votos.");
        }

        if (candidato2.buscaMejorCandidato(30)) {
            System.out.println(candidato2.getNombre() + " es un candidato mejor con " + candidato1.getVotos() + " votos.");
        }

        double costePublicidad = 5000;
        double costesVarios = 10000;

        System.out.println("El coste total de la campaña es: " + candidato1.costeCampaña(costePublicidad, costesVarios));

        System.out.println("El coste total de la campaña es: " + candidato2.costeCampaña(costePublicidad, costesVarios));

    }

}
