package players;

import equipment.Creatures;
import equipment.Spells;

import java.util.ArrayList;

public class Warlock extends Player {


    private Spells spells;
    private Creatures creatures;



    public Warlock(String name, int health, Spells spells, Creatures creatures) {
        super(name, health);
        this.spells = spells;
        this.creatures = creatures;
    }

    public Creatures getCreatures() {
        return creatures;
    }

    public void setCreatures(Creatures creatures) {
        this.creatures = creatures;
    }

    public Spells getSpells() {
        return spells;
    }

    public void setSpells(Spells spells) {
        this.spells = spells;
    }
}
