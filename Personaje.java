package strategy.examples.personaje;

/**
 * Clase Contexto: Personaje
 *
 * Equivalente a Robot.java del repositorio original.
 * El personaje no sabe cómo ataca ni cómo se defiende;
 * delega esa responsabilidad a su PersonajeBehavior.
 *
 * La estrategia puede cambiar en tiempo de ejecución
 * usando setBehavior() — esa es la esencia del patrón Strategy.
 */
public class Personaje {

    private String nombre;
    private PersonajeBehavior behavior;

    public Personaje() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PersonajeBehavior getBehavior() {
        return behavior;
    }

    public void setBehavior(PersonajeBehavior behavior) {
        this.behavior = behavior;
    }

    public void atacar() {
        int dano = behavior.atacar();
        System.out.println("  → " + nombre + " causó " + dano + " de daño. " + behavior.toString());
    }

    public void defender() {
        int defensa = behavior.defender();
        System.out.println("  → " + nombre + " bloqueó " + defensa + " de daño. " + behavior.toString());
    }
}
