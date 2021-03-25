package players;

import equipment.HealingPower;
import equipment.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    HealingPower healingPower;

    @Before
    public void before() {
        cleric = new Cleric("Tina", 100, HealingPower.HERBS);

    }

    @Test
    public void hasName() {
        assertEquals("Tina", cleric.getName());
    }

    @Test
    public void hasSpell() {
        assertEquals(HealingPower.HERBS, cleric.getHealingPower());
    }

    @Test
    public void setSpell() {
        cleric.setHealingPower(HealingPower.STICKING_PLASTER);
        assertEquals(HealingPower.STICKING_PLASTER, cleric.getHealingPower());
    }

    @Test
    public void addHealthFromHealer(){
        cleric.addHealthFromHealingPower(HealingPower.HERBS);
        assertEquals(105, cleric.getHealth());
    }
}
