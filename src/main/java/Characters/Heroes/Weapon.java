package Characters.Heroes;

import java.util.Random;

public enum Weapon {

    SWORD(20, 10),
    CLUB(30, 8),
    AXE(40, 6),
    TINYAXE(10, 10);

    public final int damageValue;
    public final int chanceValue;
    private static final Weapon[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();


    Weapon(int damageValue, int chanceValue) {
        this.damageValue = damageValue;
        this.chanceValue = chanceValue;
    }

    public int getDamageValue() {
        return damageValue;
    }

    public int getChanceValue() {
        return chanceValue;
    }

    public static Weapon getRandomWeapon() {
        return VALUES[RANDOM.nextInt(SIZE)];
    }


}
