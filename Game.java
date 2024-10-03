package game;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Player player;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Bienvenido al juego. ¿Cuál es tu nombre?");
        String playerName = scanner.nextLine();
        player = new Player(playerName);

        while (true) {
            Enemy enemy = generateRandomEnemy();
            System.out.println("Te enfrentas a un " + enemy.getName() + " (" + enemy.getRarity() + ")");
            battle(enemy);

            if (!player.isAlive()) {
                System.out.println("Has muerto. ¿Quieres jugar de nuevo? (s/n)");
                String response = scanner.nextLine();
                if (response.equalsIgnoreCase("s")) {
                    player.resetStats();
                } else {
                    break;
                }
            }
        }
    }

    private void battle(Enemy enemy) {
        while (player.isAlive() && enemy.isAlive()) {
            player.attack(enemy);
            if (enemy.isAlive()) {
                enemy.attack(player);
            }
        }

        if (player.isAlive()) {
            System.out.println("Has derrotado a " + enemy.getName() + "!");
            player.increaseStrength();
        }
    }

    private Enemy generateRandomEnemy() {
        String[] rarities = {"básico", "raro", "jefe", "secreto"};
        String rarity = rarities[random.nextInt(rarities.length)];

        switch (random.nextInt(2)) {
            case 0:
                return new Goblin(rarity);
            case 1:
                return new Orc(rarity);
            default:
                return new Goblin(rarity); // Fallback a Goblin
        }
    }
}
