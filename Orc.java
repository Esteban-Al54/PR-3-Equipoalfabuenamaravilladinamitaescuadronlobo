package game;

public class Orc extends Enemy {

    public Orc(String rarity) {
        super(rarity);
        this.name = assignName(rarity);
    }

    @Override
    protected void initializeStats() {
        switch (rarity) {
            case "básico":
                stats.setStat(Stats.HP, 70);
                stats.setStat(Stats.ATTACK, 15);
                stats.setStat(Stats.DEFENSE, 8);
                break;
            case "raro":
                stats.setStat(Stats.HP, 140);
                stats.setStat(Stats.ATTACK, 25);
                stats.setStat(Stats.DEFENSE, 12);
                break;
            case "jefe":
                stats.setStat(Stats.HP, 250);
                stats.setStat(Stats.ATTACK, 35);
                stats.setStat(Stats.DEFENSE, 20);
                break;
            case "secreto":
                stats.setStat(Stats.HP, 350);
                stats.setStat(Stats.ATTACK, 45);
                stats.setStat(Stats.DEFENSE, 25);
                break;
        }
    }

    private String assignName(String rarity) {
        switch (rarity) {
            case "básico":
                return "Orco";
            case "raro":
                return "Orco de Tierra";
            case "jefe":
                return "Orco Anciano";
            case "secreto":
                return "Orco Soberano";
            default:
                return "Orco";
        }
    }
}


