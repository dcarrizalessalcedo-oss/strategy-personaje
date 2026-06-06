package strategy.examples.personaje;

/**
 * Estrategia concreta: Guerrero
 * Alto ataque, baja defensa. Va directo al frente.
 */
public class GuerreroBehavior implements PersonajeBehavior {

    @Override
    public int atacar() {
        System.out.println("  ⚔ Guerrero: golpe de espada brutal!");
        return 40;
    }

    @Override
    public int defender() {
        System.out.println("  🛡 Guerrero: bloqueo con escudo (defensa básica).");
        return 10;
    }

    @Override
    public String toString() {
        return "GuerreroBehavior [ataque=40, defensa=10]";
    }
}
