import Characters.Creatures.Creature;
import Characters.Creatures.CreatureType;
import Characters.Heroes.Fighters.Barbarian;
import Characters.Heroes.Fighters.Dwarf;
import Characters.Heroes.Fighters.Knight;
import Characters.Heroes.Healers.Cleric;
import Characters.Heroes.Hero;
import Characters.Heroes.Mages.Spell;
import Characters.Heroes.Mages.Warlock;
import org.junit.Before;
import org.junit.Test;

import Game.Game;
import Characters.Character;
import Characters.*;

import static org.junit.Assert.assertEquals;

public class GameTest {
    private Game game1;
    private Hero knight1;
    private Hero dwarf1;
    private Hero barbarian1;
    private Hero cleric1;
    private Hero warlock1;
    private Creature dragon1;

    @Before
    public void before(){
        game1 =  new Game("M&C's Castle of Madness");
        knight1 = new Knight("Mike");
        dwarf1 = new Dwarf("Simon");
        barbarian1 = new Barbarian("Tom");
        cleric1 = new Cleric("Claire");
        dragon1 = new Creature(CreatureType.DRAGON);
        warlock1 = new Warlock("Dave", Spell.FIREBALL, dragon1);

    }

    @Test
    public void canAssert(){
        assertEquals(1,1);
    }

    @Test
    public void hasName(){
        assertEquals("M&C's Castle of Madness", game1.getName());
    }

    @Test
    public void hasRandomRooms(){
        assertEquals(5, game1.getRooms().size());
    }

    @Test
    public void canAddNewKnight(){
        game1.addKnight("Mike");
        assertEquals(1, game1.getHeroes().size());
        assertEquals(knight1.getName(), game1.getHeroes().get(0).getName());
    }

    @Test
    public void canAddNewDwarf(){
        game1.addDwarf("Simon");
        assertEquals(1, game1.getHeroes().size());
        assertEquals(dwarf1.getName(), game1.getHeroes().get(0).getName());
    }

    @Test
    public void canAddNewBarbarian(){
        game1.addBarbarian("Tom");
        assertEquals(1, game1.getHeroes().size());
        assertEquals(barbarian1.getName(), game1.getHeroes().get(0).getName());
    }

    @Test
    public void canAddNewCleric(){
        game1.addCleric("Claire");
        assertEquals(1, game1.getHeroes().size());
        assertEquals(cleric1.getName(), game1.getHeroes().get(0).getName());
    }

    @Test
    public void canAddNewWarlock(){
        game1.addWarlock("Dave", Spell.FIREBALL, dragon1);
        assertEquals(1, game1.getHeroes().size());
        assertEquals(warlock1.getName(), game1.getHeroes().get(0).getName());
    }

    @Test
    public void canHandPlayersToRoom(){

    }


}
