package Characters;

import java.util.Random;

public abstract class Character {

    private String name;
    private int hp;

    public Character(String name){
        this.name = name;
        this.hp = 100;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


    public int diceRoll() {
        Random rand = new Random();
        return 2 + rand.nextInt((12 - 2) + 1);

    }

    public int getRandomNumber(int max) {
        Random rand = new Random();
        return rand.nextInt(max);
    }


}
