package Game;

import Characters.Heroes.Hero;
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




}
