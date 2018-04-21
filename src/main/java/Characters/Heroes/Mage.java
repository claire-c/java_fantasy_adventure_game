package Characters.Heroes;

import Characters.Creatures.Creature;
import Characters.Character;

public abstract class Mage extends Character{

    private String name;
    private int hp;
    private Spell spell;
    private Creature creature;

    public Mage(String name){
        super(name);
        this.spell = Spell.getRandomSpell();
        this.creature = Creature.getRandomCreature();
        //Massive problem still with this random element for newing up objects. Need to fix.
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


}
