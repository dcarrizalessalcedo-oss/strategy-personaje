package strategy.examples.personaje;

import java.util.Scanner;

/**
 * Aplicación interactiva por consola.
 * Patrón Strategy aplicado a personajes de videojuego.
 *
 * Inspirado en: github.com/luisburgos/design-patterns
 * Ejemplo propio: Personaje con estrategias Guerrero, Mago y Asasino.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Personaje personaje = new Personaje();
        personaje.setNombre("Héroe");
        personaje.setBehavior(new GuerreroBehavior());

        System.out.println("=========================================");
        System.out.println("   PATRÓN STRATEGY - Personaje de juego ");
        System.out.println("=========================================");
        System.out.println("Personaje listo: " + personaje.getNombre());
        System.out.println("Estrategia inicial: " + personaje.getBehavior());

        boolean corriendo = true;
        while (corriendo) {
            System.out.println();
            System.out.println("--- ¿Qué deseas hacer? ---");
            System.out.println("1. Atacar");
            System.out.println("2. Defender");
            System.out.println("3. Cambiar estrategia");
            System.out.println("4. Ver estrategia actual");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            String opcion = scanner.nextLine().trim();

            switch (opcion) {
                case "1":
                    personaje.atacar();
                    break;
                case "2":
                    personaje.defender();
                    break;
                case "3":
                    System.out.println("Elige nueva estrategia:");
                    System.out.println("  1. Guerrero (ataque=40, defensa=10)");
                    System.out.println("  2. Mago     (ataque=55, defensa=20)");
                    System.out.println("  3. Asasino  (ataque=65, defensa=30)");
                    System.out.print("  Estrategia: ");
                    String eleccion = scanner.nextLine().trim();
                    switch (eleccion) {
                        case "1": personaje.setBehavior(new GuerreroBehavior()); break;
                        case "2": personaje.setBehavior(new MagoBehavior());     break;
                        case "3": personaje.setBehavior(new AsasinoBehavior());  break;
                        default:  System.out.println("Opción no válida."); continue;
                    }
                    System.out.println("✓ Estrategia cambiada a: " + personaje.getBehavior());
                    break;
                case "4":
                    System.out.println("Estrategia actual: " + personaje.getBehavior());
                    break;
                case "5":
                    corriendo = false;
                    System.out.println("¡Hasta la próxima aventura!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
