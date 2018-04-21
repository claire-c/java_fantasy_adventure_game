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
}
