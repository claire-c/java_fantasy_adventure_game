import org.junit.Before;
import org.junit.Test;

import Game.Game;
import Characters.Character;

import static org.junit.Assert.assertEquals;

public class GameTest {
    private Game game1;

    @Before
    public void before(){
        game1 =  new Game("M&C's Castle of Madness");
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


}
