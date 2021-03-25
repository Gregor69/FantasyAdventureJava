package Players;

public class Wizard extends Player {


    private ArrayList<Spell> spells;
    private ArrayList<Creature> creatures;

    public Wizard(String name, int health) {
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

