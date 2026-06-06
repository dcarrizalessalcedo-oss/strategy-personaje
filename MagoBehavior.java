package strategy.examples.personaje;

/**
 * Estrategia concreta: Mago
 * Ataque mágico poderoso, se protege con barrera mágica.
 */
public class MagoBehavior implements PersonajeBehavior {

    @Override
    public int atacar() {
        System.out.println("  ✨ Mago: lanza bola de fuego!");
        return 55;
    }

    @Override
    public int defender() {
        System.out.println("  🔮 Mago: activa barrera mágica.");
        return 20;
    }

    @Override
    public String toString() {
        return "MagoBehavior [ataque=55, defensa=20]";
    }
}
