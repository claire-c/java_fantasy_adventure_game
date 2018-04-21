package Characters.Creatures;

import Characters.Character;

public class Creature extends Character {

    private String name;
    private CreatureType type;
    private int hp;
    private int mv1DamageValue;
    private int mv1ChanceValue;
    private int mv2DamageValue;
    private int mv2ChanceValue;

    public Creature(CreatureType type){
        super(type);
        this.name = type.getName();
        this.type = type;
        this.hp = type.getHp();
        this.mv1DamageValue = type.getMv1DamageValue();
        this.mv1ChanceValue = type.getMv1ChanceValue();
        this.mv2DamageValue = type.getMv2DamageValue();
        this.mv2ChanceValue = type.getMv2ChanceValue();
    }

    public CreatureType getType() {
        return type;
    }


    public int getMv1DamageValue() {
        return mv1DamageValue;
    }

    public int getMv1ChanceValue() {
        return mv1ChanceValue;
    }

    public int getMv2DamageValue() {
        return mv2DamageValue;
    }

    public int getMv2ChanceValue() {
        return mv2ChanceValue;
    }

    //move1
    public void standardMove(Character characterToAttack){
        if(shouldAttack(this.mv1ChanceValue)){characterToAttack.takeDamage(this.mv1DamageValue);}
    }

    //move2
    public void signatureMove(Character characterToAttack){
        if(shouldAttack(this.mv2ChanceValue)){characterToAttack.takeDamage(this.mv2DamageValue);}
    }


}
