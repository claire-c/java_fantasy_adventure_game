package Characters.Heroes;

import Characters.Creatures.Creature;
import Characters.Character;

public abstract class Mage extends Hero{

    private String name;
    private int hp;
    private Spell spell;
    private Creature creature;

    public Mage(String name, Spell spell, Creature creature){
        super(name);
//        this.spell = Spell.getRandomSpell();
//        this.creature = Creature.getRandomCreature();
        //Massive problem still with this random element for newing up objects. Need to fix.
        this.spell = spell;
        this.creature = creature;
    }

    public Creature getCreature(){
        return this.creature;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    //move 1. This is the move to use the spell that the Mage has assigned to them.
    public void standardMove(Character characterToAttack){
        if(shouldDoMove(this.spell.getChanceValue())){
            characterToAttack.takeDamage(this.spell.getDamageValue());
        }
    }


}
