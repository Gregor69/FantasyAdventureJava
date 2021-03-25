package Players;

import com.sun.org.apache.xml.internal.resolver.readers.CatalogReader;

import java.util.ArrayList;

public class Warlock extends Player {


    private ArrayList<Spell> spells;
    private ArrayList<Creature> creatures;

    public Warlock(String name, int health) {
        super(name, health);
        this.creatures = new ArrayList<Creature>();
        this.spells = new ArrayList<Spell>();
    }


    public ArrayList<Spell> getSpells() {
        return spells;
    }

    public ArrayList<Creature> getCreatures() {
        return creatures;
    }

}
