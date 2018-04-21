package Characters.Heroes;

import java.util.Random;

public enum Treasure {

    GOLDCUP(30),
    GOLDCOIN(20),
    DIAMOND(50),
    FAKEMOUSTACHE(1),
    BRANDEDPEN(3),
    UNUSEDBUSTICKET(5);

    public final int treasureValue;
    private static final Treasure[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();


    Treasure(int treasureValue) {
        this.treasureValue = treasureValue;
    }


    public int getTreasureValue() {
        return treasureValue;
    }


    public static Treasure getRandomTreasure() {
        return VALUES[RANDOM.nextInt(SIZE)];
    }

}


