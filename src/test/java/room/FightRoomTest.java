package room;

import org.junit.Before;
import org.junit.Test;
import rooms.FightRoom;

import static org.junit.Assert.assertEquals;

public class FightRoomTest {

    FightRoom fightRoom;

    @Before
    public void before(){
        fightRoom = new FightRoom("Get it round you");
    }

    @Test
    public void getName(){
        assertEquals("Get it round you", fightRoom.getName());
    }
}
