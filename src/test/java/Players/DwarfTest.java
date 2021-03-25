package players;

import equipment.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Weapons weapon;

    @Before
    public void before() {
        dwarf = new Dwarf("Grumpy", 100, Weapons.MACE);

    }

    @Test
    public void hasName() {
        assertEquals("Grumpy", dwarf.getName());
    }

    @Test
    public void hasSpell() {
        assertEquals(Weapons.MACE, dwarf.getWeapons());
    }

    @Test
    public void setSpell() {
        dwarf.setWeapons(Weapons.MACE);
        assertEquals(Weapons.MACE, dwarf.getWeapons());
    }
}
