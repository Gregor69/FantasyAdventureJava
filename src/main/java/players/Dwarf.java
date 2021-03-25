package players;

import equipment.Weapons;

import java.util.ArrayList;

public class Dwarf extends Player {

    private Weapons weapons;


    public Dwarf(String name, int health, Weapons weapons) {
        super(name, health);
        this.weapons = weapons;
    }

    public Weapons getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapons weapons) {
        this.weapons = weapons;
    }
}
