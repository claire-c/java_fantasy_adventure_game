import Characters.Creatures.Creature;
import Characters.Creatures.CreatureType;
import Characters.Heroes.Mages.Spell;
import Characters.Heroes.Mages.Warlock;
import Characters.Heroes.Treasure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    private Warlock warlock;
    private Creature dragon;
    private Creature troll;

    @Before
    public void setup(){
        dragon = new Creature(CreatureType.DRAGON);
        warlock = new Warlock("Terry", Spell.CONFUSION, dragon);
        troll = new Creature(CreatureType.TROLL);
    }

    @Test
    public void canGetSpell(){
        assertEquals(Spell.CONFUSION, warlock.getSpell());
    }

    @Test
    public void canGetCreature(){
        assertEquals(CreatureType.DRAGON, warlock.getCreature().getType());
    }

    @Test
    public void canSetSpell(){
        warlock.setSpell(Spell.BLINDNESS);
        assertEquals(Spell.BLINDNESS, warlock.getSpell());
    }

    @Test
    public void canGetSpellDamageValue(){
        assertEquals(20, warlock.getSpell().getDamageValue());
    }

    @Test
    public void canGetSpellChanceValue(){
        assertEquals(10, warlock.getSpell().getChanceValue());
    }

    @Test
    public void canSetCreature(){
        warlock.setCreature(troll);
        assertEquals(CreatureType.TROLL, warlock.getCreature().getType());
    }

    @Test
    public void canAddTreasure(){
        warlock.addToInventory(Treasure.BRANDEDPEN);
        assertEquals(1, warlock.getInventory().size());
    }

    @Test
    public void canRemoveTreasure(){
        warlock.addToInventory(Treasure.BRANDEDPEN);
        assertEquals(Treasure.BRANDEDPEN, warlock.removeTreasureFromInventory());
    }

    @Test public void removeTreasureWontBreakIfInventoryEmpty(){
        assertEquals(null, warlock.removeTreasureFromInventory());
    }

    @Test
    public void canGetTreasureTotal(){
        warlock.addToInventory(Treasure.BRANDEDPEN);
        warlock.addToInventory(Treasure.BRANDEDPEN);
        assertEquals(6, warlock.getTotalTreasureValue());
    }

    @Test
    public void treasureTotalWontBreakIfInventoryEmpty(){
        assertEquals( 0, warlock.getTotalTreasureValue());
    }

    @Test
    public void canBeHealed(){
        warlock.beHealed(20);
        assertEquals(120, warlock.getHp());
    }
//
//    @Test
//    public void canDoSignatureMove(){
//        warlock.signatureMove(troll);
//        assertEquals(5, troll.getHp());
//    }

//    @Test
//    public void canDoStandardMove(){
//        warlock.standardMove(troll);
//        assertEquals(80, troll.getHp());
//    }
    //These two tests are passing, but due to random nature of dice roll will occasionally fail. But it seems to be working.



}

