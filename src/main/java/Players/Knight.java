package Players;

public class Knight extends Player {

    private ArrayList<Weapon> weapons;

    public Knight(String name, int health) {
        super(name, health);
        this.weapons = new ArrayList<Weapon>();
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }
}
