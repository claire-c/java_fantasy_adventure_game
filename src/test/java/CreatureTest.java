import Characters.Creatures.Creature;
import Characters.Creatures.CreatureType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreatureTest {

    private Creature troll;
    private Creature dragon;
    private Creature ex;

    @Before
    public void setup(){
        troll = new Creature(CreatureType.TROLL);
        dragon = new Creature(CreatureType.DRAGON);
        ex = new Creature(CreatureType.EX);
    }

    @Test
    public void canGetName(){
        assertEquals("Trolly", troll.getName());
    }

    @Test
    public void canGetHp(){
        assertEquals(100, troll.getHp());
    }

    @Test
    public void canSetHp(){
        troll.setHp(150);
        assertEquals(150, troll.getHp());
    }

    @Test
    public void canGetMv1DamageValue(){
        assertEquals(30, troll.getMv1DamageValue());
    }

    @Test
    public void canGetMv1ChanceValue(){
        assertEquals(8, troll.getMv1ChanceValue());
    }

    @Test
    public void canGetMv2DamageValue(){
        assertEquals(90, troll.getMv2DamageValue());
    }

    @Test
    public void canGetMv2ChanceValue(){
        assertEquals(1, troll.getMv2ChanceValue());
    }

    @Test
    public void canGetCreatureType(){
        assertEquals(CreatureType.TROLL, troll.getType());
    }

    @Test
    public void creatureCanTakeDamage(){
        troll.takeDamage(20);
        assertEquals(80, troll.getHp());
    }



}
