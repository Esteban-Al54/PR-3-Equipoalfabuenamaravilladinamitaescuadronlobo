package game;

import java.util.Random;

public abstract class Enemy {
    protected String name;
    protected String rarity;
    protected Stats stats;

    public Enemy(String rarity) {
        this.rarity = rarity;
        this.stats = new Stats();
        initializeStats();
    }

    protected abstract void initializeStats();

    public String getName() {
        return name;
    }

    public String getRarity() {
        return rarity;
    }

    public void attack(Player player) {
        Random random = new Random();
        boolean criticalHit = random.nextInt(100) < stats.getStat(Stats.CRITICAL_HIT_CHANCE);

        int damage = stats.getStat(Stats.ATTACK);
        if (criticalHit) {
            damage += 50;
            System.out.println("¡Golpe crítico del enemigo!");
        }

        System.out.println(name + " atacó a " + player.getName() + " y causó " + damage + " de daño.");
        player.takeDamage(damage);
    }

    public void takeDamage(int damage) {
        int currentHp = stats.getStat(Stats.HP);
        stats.setStat(Stats.HP, Math.max(currentHp - damage, 0));
        System.out.println(name + " recibió " + damage + " de daño. Vida restante: " + stats.getStat(Stats.HP));
    }

    public boolean isAlive() {
        return stats.getStat(Stats.HP) > 0;
    }
}
