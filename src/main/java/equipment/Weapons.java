package equipment;

public enum Weapons {

    SWORD (20),
    AXE (10),
    STAVE (15),
    SHIELD (5),
    DAGGER (2),
    MACE (25),
    CROSSBOW (40),
    HAMMER (25);

    private final int damage;

    Weapons(int damage) {
        this.damage = damage;
    }

    public int getDamage(){
        return this.damage;
    }
}
