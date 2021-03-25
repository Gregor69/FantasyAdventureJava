package rooms;

import equipment.Treasure;
import players.Player;

import java.util.ArrayList;

public class TreasureRoom extends Room {

    private Treasure treasure;
    private Player player;

    public TreasureRoom(String name, Treasure treasure, Player player) {
        super(name, player);
        this.treasure = treasure;
    }

    public Treasure getTreasure() {
        return treasure;
    }

    public addPlayer(){
        this.addPlayer(player);
        this.getPlayer() += this.getTreasure().getTreasureValue();
    }
}
