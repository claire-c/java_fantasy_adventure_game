package Characters.Heroes;

import Characters.Character;

import java.util.ArrayList;

public abstract class Hero extends Character {

    private ArrayList<Treasure> inventory;

    public Hero(String name){
        super(name);
        this.inventory = new ArrayList<Treasure>();
        }

    public void addToInventory(Treasure treasureItem){
        inventory.add(treasureItem);
    }

    public Treasure removeFromInventory(){
        Treasure itemToRemove = null;
        if(inventory.size() > 0){itemToRemove = inventory.remove(0);}
        return itemToRemove;
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
