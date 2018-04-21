import Characters.Creatures.CreatureType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreatureTypeTest {

    @Test
    public void canGetName(){
        assertEquals("Trolly", CreatureType.TROLL.getName());
    }

    @Test
    public void canGetHp(){
        assertEquals(100, CreatureType.TROLL.getHp());
    }

    @Test
    public void canGetMv1DamageValue(){
        assertEquals(30, CreatureType.TROLL.getMv1DamageValue());
    }

    @Test
    public void canGetMv2DamageValue(){
        assertEquals(90, CreatureType.TROLL.getMv2DamageValue());
    }

    @Test
    public void canGetMv1ChanceValue(){
        assertEquals(8, CreatureType.TROLL.getMv1ChanceValue());
    }

    @Test
    public void canGetMv2ChanceValue(){
        assertEquals(1, CreatureType.TROLL.getMv2ChanceValue());
    }

}
