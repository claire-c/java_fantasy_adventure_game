package Characters.Heros;

import java.util.ArrayList;
import java.util.Random;

public enum HealingTool {

    POTION(20, 8),
    BITTERROOT(10, 10),
    AGOODSNOOZE(50, 3),
    HERBS(30, 5);

    public final int healingValue;
    public final int chanceValue;
    private static final HealingTool[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();


    HealingTool(int healingValue, int chanceValue) {
        this.healingValue = healingValue;
        this.chanceValue = chanceValue;
    }

    public int getHealingValue() {
        return healingValue;
    }

    public int getChanceValue() {
        return chanceValue;
    }

    public static HealingTool getRandomHealingTool()  {
        return VALUES[RANDOM.nextInt(SIZE)];
    }






}
