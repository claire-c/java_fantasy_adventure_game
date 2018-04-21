import Characters.Creatures.Creature;
import Characters.Creatures.CreatureType;
import Characters.Heroes.Spell;
import Characters.Heroes.Warlock;
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
    public void canSetCreature(){
        warlock.setCreature(troll);
        assertEquals(CreatureType.TROLL, warlock.getCreature().getType());

    }

}

