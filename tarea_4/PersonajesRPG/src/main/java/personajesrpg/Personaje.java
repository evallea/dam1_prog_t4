package personajesrpg;

/**
 *
 * @author Enrique Valle Alcega
 */
public abstract class Personaje {

    // Variables comunes:
    String nombre; // Nombre del personaje.
    int lvl; // Nivel del personaje.
    int hp; // Puntos de salud.
    int mp; // Puntos de magia.

    // Gets y Sets:
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    // Método abstracto:
    public abstract double calcularPoder(); // Este método calculará el poder de ataque, y realizará operaciones distintas según la clase donde se utilice.

}
