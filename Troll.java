package game;

public class Troll extends Enemy {

    public Troll(String rarity) {
        super(rarity);
        this.name = assignName(rarity);
    }

    @Override
    protected void initializeStats() {
        switch (rarity) {
            case "básico":
                stats.setStat(Stats.HP, 80);
                stats.setStat(Stats.ATTACK, 18);
                stats.setStat(Stats.DEFENSE, 8);
                break;
            case "raro":
                stats.setStat(Stats.HP, 160);
                stats.setStat(Stats.ATTACK, 28);
                stats.setStat(Stats.DEFENSE, 12);
                break;
            case "jefe":
                stats.setStat(Stats.HP, 280);
                stats.setStat(Stats.ATTACK, 38);
                stats.setStat(Stats.DEFENSE, 22);
                break;
            case "secreto":
                stats.setStat(Stats.HP, 380);
                stats.setStat(Stats.ATTACK, 48);
                stats.setStat(Stats.DEFENSE, 28);
                break;
        }
    }

    private String assignName(String rarity) {
        switch (rarity) {
            case "básico":
                return "Troll";
            case "raro":
                return "Troll de Pantano";
            case "jefe":
                return "Troll de Cueva";
            case "secreto":
                return "Troll de las Montañas";
            default:
                return "Troll";
        }
    }
}
