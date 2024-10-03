package game;

import java.util.Scanner;
import java.util.Random;

public class Player {
    private String name;
    private Stats stats;
    private int experience;

    public Player(String name) {
        this.name = name;
        this.stats = new Stats();
        this.experience = 0;
        initializeStats();
    }

    private void initializeStats() {
        stats.setStat(Stats.HP, 100);
        stats.setStat(Stats.ATTACK, 10);
        stats.setStat(Stats.DEFENSE, 5);
        stats.setStat(Stats.CRITICAL_HIT_CHANCE, 5);
        stats.setStat(Stats.SPEED, 10);
    }

    public void increaseStrength() {
        stats.setStat(Stats.ATTACK, stats.getStat(Stats.ATTACK) + 1);
        stats.setStat(Stats.HP, stats.getStat(Stats.HP) + 5);
        stats.setStat(Stats.DEFENSE, stats.getStat(Stats.DEFENSE) + 1);
        System.out.println(name + " se ha vuelto más fuerte.");
    }

    public void attack(Enemy enemy) {
        Random random = new Random();
        boolean criticalHit = random.nextInt(100) < stats.getStat(Stats.CRITICAL_HIT_CHANCE);
        int damage = stats.getStat(Stats.ATTACK);

        if (criticalHit) {
            damage += 50;
            System.out.println("¡Golpe crítico!");
        }

        System.out.println(name + " atacó a " + enemy.getName() + " y causó " + damage + " de daño.");
        enemy.takeDamage(damage);
    }

    public void takeDamage(int damage) {
        int currentHp = stats.getStat(Stats.HP);
        stats.setStat(Stats.HP, Math.max(currentHp - damage, 0));
        System.out.println(name + " recibió " + damage + " de daño. Vida restante: " + stats.getStat(Stats.HP));
    }

    public boolean isAlive() {
        return stats.getStat(Stats.HP) > 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void resetStats() {
        initializeStats();
    }
}
