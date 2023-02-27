package personajesrpg;

/**
 *
 * @author Enrique Valle Alcega
 */
public class Guerrero extends Personaje {

    // Variable específica:
    int fuerza; // Puntos de fuerza.

    // Constructor por defecto:
    public Guerrero() {
    }

    // Constructor con parámetros:
    public Guerrero(String nombre, int lvl, int hp, int mp, int fuerza) {
        this.nombre = nombre;
        this.lvl = lvl;
        this.hp = hp;
        this.mp = mp;
        this.fuerza = fuerza;
    }

    // Gets y sets:
    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    // Utilización del método abstracto:
    @Override
    // El poder de un guerrero es el resultado de multiplicar su fuerza por su nivel, y de sumar a dicho resultado la división de sus puntos de salud entre sus puntos de magia.
    public double calcularPoder() {
        return (fuerza * lvl) + (hp / mp);
    }

    // Método para mostrar la información:
    public void mostrarInformacion() {
        System.out.println("GUERRERO:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + lvl);
        System.out.println("Puntos de salud: " + hp);
        System.out.println("Puntos de magia: " + mp);
        System.out.println("Fuerza: " + fuerza);
    }

}
