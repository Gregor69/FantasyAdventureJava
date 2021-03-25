package players;

import equipment.Creatures;
import equipment.Spells;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    Spells spells;
    Creatures creatures;

    @Before
    public void before (){
        warlock = new Warlock("Hagar", 100, Spells.TRANSFORM_TO_BUNNY, Creatures.MAD_FAIRY);

    }

    @Test
    public void hasName(){
        assertEquals("Hagar", warlock.getName());
    }

    @Test
    public void hasSpell(){
        assertEquals(Spells.TRANSFORM_TO_BUNNY, warlock.getSpells());
    }

    @Test
    public void setSpell(){
        warlock.setSpells(Spells.SHRINK);
        assertEquals(Spells.SHRINK, warlock.getSpells());
    }

    @Test
    public void hasCreature(){
        assertEquals(Creatures.MAD_FAIRY, warlock.getCreatures());
    }

    @Test
    public void setCreature(){
        warlock.setCreatures(Creatures.OGRE);
        assertEquals(Creatures.OGRE, warlock.getCreatures());
    }
}
