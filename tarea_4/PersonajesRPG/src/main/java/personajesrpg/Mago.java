package personajesrpg;

/**
 *
 * @author Enrique Valle Alcega
 */
public class Mago extends Personaje {

    // Variable específica:
    int inteligencia; // Puntos de inteligencia.

    // Constructor por defecto:
    public Mago() {
    }

    // Constructor con parámetros:
    public Mago(String nombre, int lvl, int hp, int mp, int inteligencia) {
        this.nombre = nombre;
        this.lvl = lvl;
        this.hp = hp;
        this.mp = mp;
        this.inteligencia = inteligencia;
    }

    // Gets y sets:
    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    // Utilización del método abstracto:
    @Override
    // El poder de un mago es el resultado de multiplicar su inteligencia por su nivel, y de sumar a dicho resultado la división de sus puntos de magia entre sus puntos de salud.
    public double calcularPoder() {
        return (inteligencia * lvl) + (mp / hp);
    }

    // Método para mostrar la información:
    public void mostrarInformacion() {
        System.out.println("MAGO:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + lvl);
        System.out.println("Puntos de salud: " + hp);
        System.out.println("Puntos de magia: " + mp);
        System.out.println("Inteligencia: " + inteligencia);
    }

}
