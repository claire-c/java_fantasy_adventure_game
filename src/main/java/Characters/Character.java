package Characters;

import Characters.Creatures.CreatureType;

import java.util.Random;

public abstract class Character {

    private String name;
    private int hp;
    private CreatureType type;
    private int mv1DamageValue;
    private int mv1ChanceValue;
    private int mv2DamageValue;
    private int mv2ChanceValue;

    public Character(String name){
        this.name = name;
        this.hp = 100;
    }

    public Character(CreatureType type){
        this.name = type.getName();
        this.type = type;
        this.hp = type.getHp();
//        this.mv1DamageValue = type.getMv1DamageValue();
//        this.mv1ChanceValue = type.getMv1ChanceValue();
//        this.mv2DamageValue = type.getMv2DamageValue();
//        this.mv2ChanceValue = type.getMv2ChanceValue();
    }

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
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

    public void takeDamage(int damage){
        hp -= damage;
    }

    public void beHealed(int health){
        hp += health;
    }

    public boolean shouldDoMove(int chanceValue){
        if(diceRoll() <= chanceValue){return true;}
        else{return false;}
    }

    //move1
    public void standardMove(Character characterToAttack){
        if(shouldDoMove(this.mv1ChanceValue)){characterToAttack.takeDamage(this.mv1DamageValue);}
    }

    //move2
    public void signatureMove(Character characterToAttack){
        if(shouldDoMove(this.mv2ChanceValue)){characterToAttack.takeDamage(this.mv2DamageValue);}
    }



}
