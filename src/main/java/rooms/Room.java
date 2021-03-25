package rooms;

import players.Player;

import java.util.ArrayList;

public abstract class Room {


    private String name;
    private Player player;

    public Room(String name, Player player) {
        this.name = name;
        this.player = player;
    }


    public String getName() {
        return name;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player addPlayer(Player player){
        return this.player;
    }
}
