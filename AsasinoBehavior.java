package strategy.examples.personaje;

/**
 * Estrategia concreta: Asasino
 * Ataque rápido y certero, se esconde para evitar daño.
 */
public class AsasinoBehavior implements PersonajeBehavior {

    @Override
    public int atacar() {
        System.out.println("  🗡 Asasino: ataque furtivo por la espalda!");
        return 65;
    }

    @Override
    public int defender() {
        System.out.println("  👤 Asasino: se camufla y esquiva.");
        return 30;
    }

    @Override
    public String toString() {
        return "AsasinoBehavior [ataque=65, defensa=30]";
    }
}
