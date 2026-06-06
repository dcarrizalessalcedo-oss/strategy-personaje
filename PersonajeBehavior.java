package strategy.examples.personaje;

/**
 * Interfaz Strategy: PersonajeBehavior
 *
 * Define el contrato que deben cumplir todas las estrategias
 * de comportamiento de un personaje de videojuego.
 *
 * Inspirado en: strategy/examples/robot/RobotBehavior.java
 * del repositorio github.com/luisburgos/design-patterns
 */
public interface PersonajeBehavior {

    /**
     * Define cómo ataca el personaje.
     * @return daño causado
     */
    int atacar();

    /**
     * Define cómo se defiende el personaje.
     * @return defensa aplicada
     */
    int defender();

    /**
     * Descripción de la estrategia actual.
     */
    @Override
    String toString();
}
