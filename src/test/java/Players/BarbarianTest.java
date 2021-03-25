package players;

import equipment.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Weapons weapon;

    @Before
    public void before() {
        barbarian = new Barbarian("Conan", 100, Weapons.HAMMER);

    }

    @Test
    public void hasName() {
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void hasSpell() {
        assertEquals(Weapons.HAMMER, barbarian.getWeapons());
    }

    @Test
    public void setSpell() {
        barbarian.setWeapons(Weapons.HAMMER);
        assertEquals(Weapons.HAMMER, barbarian.getWeapons());
    }
}
