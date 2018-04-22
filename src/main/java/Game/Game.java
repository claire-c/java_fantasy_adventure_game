package Game;

import Characters.Heroes.Hero;
import Room.Room;

import java.util.ArrayList;

public class Game {
    private String name;
    private ArrayList<Room> rooms;
    private ArrayList<Hero> heroes;

    public Game(String name){
        this.name = name;
        this.rooms = new ArrayList<>();
        this.heroes = new ArrayList<>();
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




}
