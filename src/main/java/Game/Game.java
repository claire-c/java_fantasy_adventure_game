package Game;

import Characters.Creatures.Creature;
import Characters.Heroes.Fighters.Barbarian;
import Characters.Heroes.Fighters.Dwarf;
import Characters.Heroes.Fighters.Knight;
import Characters.Heroes.Healers.Cleric;
import Characters.Heroes.Hero;
import Characters.Heroes.Mages.Spell;
import Characters.Heroes.Mages.Warlock;
import Room.Room;

import java.util.ArrayList;

public class Game {
    private String name;
    private ArrayList<Room> rooms;
    private ArrayList<Hero> heroes;
    private Room room1;
    private Room room2;
    private Room room3;
    private Room room4;
    private Room room5;







    public Game(String name){
        this.name = name;
        this.heroes = new ArrayList<>();

        ArrayList<Room> generatedRooms = new ArrayList<>();
        room1 = new Room();
        room2 = new Room();
        room3 = new Room();
        room4 = new Room();
        room5 = new Room();
        generatedRooms.add(room1);
        generatedRooms.add(room2);
        generatedRooms.add(room3);
        generatedRooms.add(room4);
        generatedRooms.add(room5);
        this.rooms = generatedRooms;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public ArrayList<Hero> getHeroes() {
        return heroes;
    }

    public void addKnight(String name){
        heroes.add(new Knight(name));
    }

    public void addDwarf(String name){
        heroes.add(new Dwarf(name));
    }

    public void addBarbarian(String name){
        heroes.add(new Barbarian(name));
    }

    public void addCleric(String name){
        heroes.add(new Cleric(name));
    }

    public void addWarlock(String name, Spell spell, Creature creature){
        heroes.add(new Warlock(name, spell, creature));
    }

    public void addHeroesToFirstRoom(){
        ArrayList<Hero> heroesInHallway = new ArrayList<>();
        int heroCount = heroes.size();
        for (int i = 0; i < heroCount ; i++) {
            heroesInHallway.add(heroes.remove(0));}
            rooms.get(0).addHeroesFromHallway(heroesInHallway);
        }
}
