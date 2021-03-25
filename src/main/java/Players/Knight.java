package players;

import equipment.Weapons;

public class Knight extends Player {

    private Weapons weapons;

    public Knight (String name, int health, Weapons weapons) {
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

