package Room;

import Characters.Character;
import Characters.Creatures.Creature;
import Characters.Creatures.CreatureType;
import Characters.Heroes.Hero;
import Characters.Heroes.Treasure;

import java.util.ArrayList;

public class Room {

    private Character monster;
    private Treasure treasure;
    private ArrayList<Hero> heroes;


    public Room(){
        this.monster = new Creature(CreatureType.getRandomCreature());
        this.treasure = Treasure.getRandomTreasure();
        this.heroes = new ArrayList<>();
    }

    public Character getMonster() {
        return monster;
    }

    public Treasure getTreasure() {
        return treasure;
    }

    public ArrayList<Hero> getHeroes() {
        return heroes;
    }

    public Boolean noHeroesAlive(){
        return heroes.isEmpty();
    }

    public void addHeroes(Hero hero){
        heroes.add(hero);
    }

    public void heroesCollectTreasure(){
        Hero hero = heroes.get(0);
        hero.addToInventory(this.treasure);
        this.treasure = null;
    }

    public ArrayList<Hero> returnRemainingHeroes(){
        ArrayList<Hero> remainingHeroes = new ArrayList<>();
        for (Hero hero : heroes){
            if(!hero.characterDead()){
                remainingHeroes.add(hero);
            }
        }
        return remainingHeroes;
    }

//    public ArrayList<Character> encounter( ArrayList<Character> heroes){
//
//    }
}
