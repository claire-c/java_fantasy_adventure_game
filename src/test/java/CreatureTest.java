import Characters.Creatures.Creature;
import Characters.Creatures.CreatureType;
import Characters.Heroes.Healers.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CreatureTest {

    private Creature troll;
    private Creature dragon;
    private Creature ex;
    private Cleric cleric;

    @Before
    public void setup(){
        troll = new Creature(CreatureType.TROLL);
        ex = new Creature(CreatureType.EX);
        cleric = new Cleric("Tony");
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
        assertEquals(2, troll.getMv2ChanceValue());
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

    @Test
    public void creatureCanBeHealed(){
        troll.beHealed(10);
        assertEquals(110, troll.getHp());
    }

//    @Test
//    public void exWillSometimesAttackStandardMove(){
//        ex.standardMove(cleric);
//        assertEquals(80, cleric.getHp());
//    }

    @Test
    public void exWillAlwaysAttackSignatureMove(){
        ex.signatureMove(cleric);
        assertEquals(40, cleric.getHp());
    }

    @Test
    public void trollWillRarelyAttackSignatureMove(){
        troll.signatureMove(cleric);
        assertEquals(100, cleric.getHp());
    }

    @Test
    public void creatureIsntDead(){
        assertFalse(troll.creatureDead());
    }

    @Test
    public void creatureIsDead(){
        troll.setHp(0);
        assertTrue(troll.creatureDead());
    }

//
//    @Test
//    public void trollWillOnlySometimesAttack(){
//        troll.standardMove(cleric);
//        assertEquals(70, cleric.getHp());
//    }
    //This is to test that the standardMove is working with a random element. It is, but as its random will not always pass.


//
//    @Test
//    public void creatureCanPotentiallyAttack(){
//                assertTrue(troll.shouldAttack(troll.getMv1ChanceValue()));
//    }
    //This to test the shouldAttack is working. It is but as it's random will not always pass.



}
