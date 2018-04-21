import Characters.Heroes.HealingTool;
import org.junit.Before;
import org.junit.Test;
import Characters.Heroes.Cleric;

import static org.junit.Assert.assertEquals;

public class ClericTest {


    private Cleric cleric;
    private Cleric cleric2;

    @Before
    public void setup() {
        cleric = new Cleric("Tony");
        cleric2 = new Cleric("random");

    }

    @Test
    public void canGetName() {
        assertEquals("Tony", cleric.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, cleric.getHp());
    }

    @Test
    public void canSetHealth(){
        cleric.setHp(150);
        assertEquals(150, cleric.getHp());
    }

    @Test
    public void canSetHealingTool(){
        cleric.setHealingTool(HealingTool.BITTEROOT);
        assertEquals(HealingTool.BITTEROOT, cleric.getHealingTool());
    }

    @Test
    public void canGetHealingTool(){
        assertEquals(HealingTool.AGOODSNOOZE, cleric.getHealingTool());
    }


    @Test
    public void canGetHealingToolValue(){
        assertEquals(50, cleric.getHealingTool().getHealingValue());
    }

    @Test
    public void canGetHealingToolChanceValue(){
        assertEquals(3, cleric.getHealingTool().getChanceValue());

    }

    @Test
    public void canRollDice(){
        assertEquals(2, cleric.diceRoll());
    }

    @Test
    public void canTakeDamage(){
        cleric.takeDamage(20);
        assertEquals(80, cleric.getHp());
    }

    @Test
    public void canBeHealed(){
        cleric.beHealed(10);
        assertEquals(110, cleric.getHp());
    }



//    @Test
//    public void canGetHealingTool(){
//        HealingTool tool = cleric.getHealingTool();
//        assertEquals(5, tool.getChanceValue());
//    }
// So this test is failing but it's defo bringing back a random HealingTool object. Each test has returned a different int - not the same random one, argh.




}

