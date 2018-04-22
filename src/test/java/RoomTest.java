import Characters.Creatures.Creature;
import Characters.Creatures.CreatureType;
import Characters.Heroes.Fighters.Knight;
import Characters.Heroes.Healers.Cleric;
import Characters.Heroes.Hero;
import Characters.Heroes.Mages.Spell;
import Characters.Heroes.Mages.Warlock;
import Room.Room;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RoomTest {
    private Room room1;
    private Room fullroom;
    private Hero hero1;
    private Hero hero2;
    private Hero hero3;
    private Creature creature1;
    private ArrayList<Hero> heroes;

    @Before
    public void before(){
        creature1 = new Creature(CreatureType.GIANTSPIDER);
        room1 = new Room();
        hero1 = new Knight("Peter");
        hero2 = new Warlock("Ashley", Spell.FIREBALL, creature1);
        hero3 = new Cleric("Pawel");
        ArrayList<Hero> heroes = new ArrayList<>();
        fullroom = new Room();
        fullroom.addHeroes(hero1);
        fullroom.addHeroes(hero2);
        fullroom.addHeroes(hero3);
    }

    @Test
    public void canAssert(){
        assertEquals(1,1);
    }

    @Test
    public void hasCreature(){
        assertNotNull(room1.getMonster());
    }

    @Test
    public void hasTreasure(){
        assertNotNull(room1.getTreasure());
    }

    @Test
    public void heroesStartEmpty(){
        assertEquals(0, room1.getHeroes().size());
    }

    @Test
    public void canAddHeroesToRoom(){
        assertEquals(3, fullroom.getHeroes().size());
    }

    @Test
    public void startNoHeroesAlive(){
        assertEquals(true, room1.noHeroesAlive());
    }

    @Test public void firstHeroCanCollectTreasureFromRoom(){
        fullroom.heroesCollectTreasure();
        assertEquals(1, hero1.getInventory().size());
        assertEquals(null, fullroom.getTreasure());
    }

//    @Test
//    public void canFight(){
//        room1.encounter(heroes);
//    }
}
