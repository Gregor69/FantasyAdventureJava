package room;

import equipment.Treasure;
import equipment.Weapons;
import org.junit.Before;
import org.junit.Test;
import players.Dwarf;
import rooms.TreasureRoom;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {


    TreasureRoom treasureRoom;
    Dwarf dwarf;

    @Before
    public void before(){
        treasureRoom = new TreasureRoom("Lovely treasure", Treasure.GOLD, dwarf);
        dwarf = new Dwarf("Happy", 70, Weapons.CROSSBOW);
    }

    @Test
    public void getName(){
        assertEquals("Lovely treasure", treasureRoom.getName());
    }

}
