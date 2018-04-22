package Characters.Creatures;

import Characters.Character;

public class Creature extends Character {


    private CreatureType type;
    private int mv1DamageValue;
    private int mv1ChanceValue;
    private int mv2DamageValue;
    private int mv2ChanceValue;

    public Creature(CreatureType type){
        super(type.getName());
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

    //move1. This move uses the first move in the creature's enum.
    public void standardMove(Character characterToAttack){
        if(shouldDoMove(this.mv1ChanceValue)){characterToAttack.takeDamage(this.mv1DamageValue);}
    }

    //move2. This move uses the second move in the creature's enum.
    public void signatureMove(Character characterToAttack){
        if(shouldDoMove(this.mv2ChanceValue)){characterToAttack.takeDamage(this.mv2DamageValue);}
    }

    public boolean creatureDead(){
        if(this.hp <= 0){return true;}
        else
            {return false;}
    }


}
