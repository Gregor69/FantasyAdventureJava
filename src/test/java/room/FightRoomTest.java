package room;

import equipment.Weapons;
import org.junit.Before;
import org.junit.Test;
import players.Dwarf;
import rooms.FightRoom;

import static org.junit.Assert.assertEquals;

public class FightRoomTest {

    FightRoom fightRoom;
    Dwarf dwarf;

    @Before
    public void before(){
        fightRoom = new FightRoom("Get it round you", dwarf);
        dwarf = new Dwarf("Grumpy", 100, Weapons.MACE);
    }

    @Test
    public void getName(){
        assertEquals("Get it round you", fightRoom.getName());
    }
}
