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

    public void addToInventory(Treasure treasureItem){
        inventory.add(treasureItem);
    }

    public ArrayList<Treasure> getInventory() {
        return inventory;
    }

    public int getTotalTreasureValue(){
        int total = 0;
        for(Treasure item : inventory){
            total += item.getTreasureValue();
        }
        return total;
    }





}
