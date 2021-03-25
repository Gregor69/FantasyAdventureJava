package equipment;

public enum Spells {

    FIREBALL (30),
    LIGHTNING_STRIKE (20),
    DISAPPEAR (95),
    SHRINK (1),
    TURN_TO_STONE (60),
    NOD_OFF (35),
    TRANSFORM_TO_BUNNY (20);

    private final int magicDamage;

    Spells(int magicDamage) {
        this.magicDamage = magicDamage;
    }

    public int getMagicDamage(){
        return this.magicDamage;
    }

}
