package players;

import equipment.Creatures;
import equipment.Spells;
import equipment.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Weapons weapon;

    @Before
    public void before() {
        knight = new Knight("Sir Prancelot", 100, Weapons.SWORD);

    }

    @Test
    public void hasName() {
        assertEquals("Sir Prancelot", knight.getName());
    }

    @Test
    public void hasSpell() {
        assertEquals(Weapons.SWORD, knight.getWeapons());
    }

    @Test
    public void setSpell() {
        knight.setWeapons(Weapons.SWORD);
        assertEquals(Weapons.SWORD, knight.getWeapons());
    }

}
