package room;

import org.junit.Before;
import org.junit.Test;
import rooms.TreasureRoom;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {


    TreasureRoom treasureRoom;

    @Before
    public void before(){
        treasureRoom = new TreasureRoom("Lovely treasure");
    }

    @Test
    public void getName(){
        assertEquals("Lovely treasure", treasureRoom.getName());
    }

}
