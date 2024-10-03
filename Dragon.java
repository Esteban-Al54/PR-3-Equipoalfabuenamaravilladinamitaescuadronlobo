package game;

public class Dragon extends Enemy {

    public Dragon(String rarity) {
        super(rarity);
        this.name = assignName(rarity);
    }

    @Override
    protected void initializeStats() {
        switch (rarity) {
            case "básico":
                stats.setStat(Stats.HP, 100);
                stats.setStat(Stats.ATTACK, 20);
                stats.setStat(Stats.DEFENSE, 10);
                break;
            case "raro":
                stats.setStat(Stats.HP, 200);
                stats.setStat(Stats.ATTACK, 35);
                stats.setStat(Stats.DEFENSE, 20);
                break;
            case "jefe":
                stats.setStat(Stats.HP, 300);
                stats.setStat(Stats.ATTACK, 50);
                stats.setStat(Stats.DEFENSE, 30);
                break;
            case "secreto":
                stats.setStat(Stats.HP, 400);
                stats.setStat(Stats.ATTACK, 60);
                stats.setStat(Stats.DEFENSE, 40);
                break;
        }
    }

    private String assignName(String rarity) {
        switch (rarity) {
            case "básico":
                return "Dragón";
            case "raro":
                return "Dragón de Negro de Ojos Rojos";
            case "jefe":
                return "Dragón Anciano";
            case "secreto":
                return "Dragón Soberano";
            default:
                return "Dragón";
        }
    }
}

