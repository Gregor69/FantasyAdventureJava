package players;

import equipment.Creatures;
import equipment.Spells;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Spells spells;
    Creatures creatures;

    @Before
    public void before (){
        wizard = new Wizard("Rincewind", 100, Spells.NOD_OFF, Creatures.MAD_FAIRY);

    }

    @Test
    public void hasName(){
        assertEquals("Rincewind", wizard.getName());
    }

    @Test
    public void hasSpell(){
        assertEquals(Spells.NOD_OFF, wizard.getSpells());
    }

    @Test
    public void setSpell(){
        wizard.setSpells(Spells.SHRINK);
        assertEquals(Spells.SHRINK, wizard.getSpells());
    }

    @Test
    public void hasCreature(){
        assertEquals(Creatures.MAD_FAIRY, wizard.getCreatures());
    }

    @Test
    public void setCreature(){
        wizard.setCreatures(Creatures.OGRE);
        assertEquals(Creatures.OGRE, wizard.getCreatures());
    }

}
