import Characters.Heroes.Fighters.Defence;
import Characters.Heroes.Fighters.Knight;
import Characters.Heroes.Fighters.Weapon;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class KnightTest {
    private Knight knight1;
    private Weapon sword1;
    private Defence defence1;

    @Before
    public void before(){
        knight1 = new Knight("Mike");
        sword1 = Weapon.SWORD;
        defence1 = Defence.SHIELD;
    }

    @Test
    public void canAssert() {
        assertEquals(1, 1);
    }

    @Test
    public void hasName(){
        assertEquals("Mike", knight1.getName());
    }

    @Test
    public void hasSword(){
        assertEquals(sword1, knight1.getWeapon());
    }

    @Test
    public void hasShield(){
        assertEquals(defence1, knight1.getDefence());
    }

    @Test
    public void shieldReducesDamageByHalf(){
        knight1.takeDamage(50);
        assertEquals(75, knight1.getHp());
    }
}
