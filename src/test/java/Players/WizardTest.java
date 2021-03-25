package Players;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before (){
        wizard = new Wizard("Rincewind", 100);

    }


    @Test
    public void hasName(){
        assertEquals("Rincewind", wizard.getName());
    }
}
