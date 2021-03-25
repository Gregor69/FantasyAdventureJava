package Players;

import java.util.ArrayList;

public class Dwarf extends Player {

    private ArrayList<Weapon> weapons;


    public Dwarf(String name, int health) {
        super(name, health);
        this.weapons = new ArrayList<Weapon>();
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

}