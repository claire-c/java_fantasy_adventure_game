package Characters.Heroes.Mages;

import Characters.Character;
import Characters.Creatures.Creature;
import Characters.Heroes.Treasure;

import java.util.ArrayList;

public class Warlock extends Mage {

    private String name;
    private int hp;
    private ArrayList<Treasure> inventory;
    private Spell spell;
    private Creature creature;

    public Warlock(String name, Spell spell, Creature creature){
        super(name, spell, creature);
    }

    //move 2. This takes the Warlock's creature's second attack, which is high damage but low chance and will apply it to the character being attacked.
    //There is a weird bug in this method. I should just be able to call this.creature but instead I have to call its getter. Why?

    public void signatureMove(Character characterToAttack){
        if (shouldDoMove(getCreature().getMv2ChanceValue())) {
            characterToAttack.takeDamage(getCreature().getMv2DamageValue());
        }
    }

}
