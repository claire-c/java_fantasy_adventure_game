import Characters.Creatures.Creature;
import Characters.Creatures.CreatureType;
import Characters.Heroes.Fighters.Barbarian;
import Characters.Heroes.Fighters.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BarbarianTest {
    private Barbarian barb1;
    private Creature dragon1;

    @Before
    public void before(){
        barb1 = new Barbarian ("Doug");
        dragon1 = new Creature(CreatureType.DRAGON);
    }

    @Test
    public void canAssert(){
        assertEquals(1,1);
    }

    @Test
    public void hasName(){
        assertEquals("Doug", barb1.getName());
    }

    @Test
    public void hasClub(){
        assertEquals(Weapon.CLUB, barb1.getWeapon());
    }

    @Test
    public void armGuardReduceDamage(){
        barb1.takeDamage(100);
        assertEquals(10, barb1.getHp());
    }

//    Commented out due to randomness of tests.

//    @Test
//    public void canUseStandardMove() {
//        barb1.standardMove(dragon1);
//        assertEquals(120, dragon1.getHp());
//    }
//
//    @Test
//    public void canUseSignatureMove(){
//        barb1.signatureMove(dragon1);
//        assertEquals(0, dragon1.getHp());
//    }

}
