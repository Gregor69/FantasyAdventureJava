package players;

import equipment.Creatures;
import equipment.Spells;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;


    @Before
    public void before (){
        warlock = new Warlock("Hagar", 100, Spells.TRANSFORM_TO_BUNNY, Creatures.GHOUL);

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
        warlock.setSpells(Spells.TURN_TO_STONE);
        assertEquals(Spells.TURN_TO_STONE, warlock.getSpells());
    }

    @Test
    public void hasCreature(){
        assertEquals(Creatures.GHOUL, warlock.getCreatures());
    }

    @Test
    public void setCreature(){
        warlock.setCreatures(Creatures.OGRE);
        assertEquals(Creatures.OGRE, warlock.getCreatures());
    }
}
