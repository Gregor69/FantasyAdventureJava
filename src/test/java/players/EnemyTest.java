package players;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Enemy enemy;

    @Before
    public void before(){
        enemy = new Enemy("Bad Guy", 200);
    }

    @Test
    public void hasName(){
        assertEquals("Bad Guy", enemy.getName());
    }

    @Test
    public void getHealth(){
        assertEquals(200, enemy.getHealth());
    }

    @Test
    public void changeHealth(){
        enemy.setHealth(100);
        assertEquals(100, enemy.getHealth());
    }
}
