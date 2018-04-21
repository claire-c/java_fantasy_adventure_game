package Characters.Heroes;

import Characters.Creatures.Creature;

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


}
