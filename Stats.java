package game;

import java.util.HashMap;
import java.util.Map;

public class Stats {
    public static final String HP = "HP";
    public static final String ATTACK = "Attack";
    public static final String DEFENSE = "Defense";
    public static final String CRITICAL_HIT_CHANCE = "CriticalHitChance";
    public static final String SPEED = "Speed";

    private Map<String, Integer> stats;

    public Stats() {
        stats = new HashMap<>();
    }

    public int getStat(String statName) {
        return stats.getOrDefault(statName, 0);
    }

    public void setStat(String statName, int value) {
        stats.put(statName, value);
    }
}
