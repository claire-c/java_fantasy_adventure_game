package Characters.Heroes;

import Characters.Character;

import java.util.ArrayList;

public abstract class Hero extends Character {

    private String name;
    private int hp;
    private ArrayList<Treasure> inventory;

    public Hero(String name){
        super(name);
        this.inventory = new ArrayList<Treasure>();
        }







}
