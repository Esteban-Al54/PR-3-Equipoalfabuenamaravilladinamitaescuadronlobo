package game;

public class Demon extends Enemy {

    public Demon(String rarity) {
        super(rarity);
        this.name = assignName(rarity);
    }

    @Override
    protected void initializeStats() {
        switch (rarity) {
            case "básico":
                stats.setStat(Stats.HP, 90);
                stats.setStat(Stats.ATTACK, 22);
                stats.setStat(Stats.DEFENSE, 9);
                break;
            case "raro":
                stats.setStat(Stats.HP, 180);
                stats.setStat(Stats.ATTACK, 32);
                stats.setStat(Stats.DEFENSE, 15);
                break;
            case "jefe":
                stats.setStat(Stats.HP, 300);
                stats.setStat(Stats.ATTACK, 45);
                stats.setStat(Stats.DEFENSE, 25);
                break;
            case "secreto":
                stats.setStat(Stats.HP, 400);
                stats.setStat(Stats.ATTACK, 55);
                stats.setStat(Stats.DEFENSE, 35);
                break;
        }
    }

    private String assignName(String rarity) {
        switch (rarity) {
            case "básico":
                return "Demonio";
            case "raro":
                return "Demonio Esbirro";
            case "jefe":
                return "Demonio Primordial";
            case "secreto":
                return "Demonio Soberano";
            default:
                return "Demonio";
        }
    }
}
