package Players;

import java.util.ArrayList;

public class Barbarian extends Player {

    private ArrayList<Weapon> weapons;

    public Barbarian(String name, int health) {
        super(name, health);
        this.weapons = new ArrayList<Weapon>();
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }
}
