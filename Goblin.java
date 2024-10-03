package game;

public class Goblin extends Enemy {

    public Goblin(String rarity) {
        super(rarity);
        this.name = assignName(rarity);
    }

    @Override
    protected void initializeStats() {
        switch (rarity) {
            case "básico":
                stats.setStat(Stats.HP, 50);
                stats.setStat(Stats.ATTACK, 10);
                stats.setStat(Stats.DEFENSE, 5);
                break;
            case "raro":
                stats.setStat(Stats.HP, 100);
                stats.setStat(Stats.ATTACK, 20);
                stats.setStat(Stats.DEFENSE, 10);
                break;
            case "jefe":
                stats.setStat(Stats.HP, 200);
                stats.setStat(Stats.ATTACK, 30);
                stats.setStat(Stats.DEFENSE, 20);
                break;
            case "secreto":
                stats.setStat(Stats.HP, 300);
                stats.setStat(Stats.ATTACK, 40);
                stats.setStat(Stats.DEFENSE, 30);
                break;
        }
    }

    private String assignName(String rarity) {
        switch (rarity) {
            case "básico":
                return "Goblin";
            case "raro":
                return "Goblin de las Sombras";
            case "jefe":
                return "Lord Goblin ";
            case "secreto":
                return "Goblin Ancestral";
            default:
                return "Goblin";
        }
    }
}
