package Characters.Heroes;

import java.util.Random;

public enum Spell {


    FIREBALL(30, 6),
    LIGHTENING(70, 3),
    BLINDNESS(80, 2),
    CONFUSION(20, 10);

    public final int damageValue;
    public final int chanceValue;
    private static final Spell[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();


    Spell(int damageValue, int chanceValue) {
        this.damageValue = damageValue;
        this.chanceValue = chanceValue;
    }

    public int getDamageValue() {
        return damageValue;
    }

    public int getChanceValue() {
        return chanceValue;
    }

    public static Spell getRandomSpell() {
        return VALUES[RANDOM.nextInt(SIZE)];
    }

}
