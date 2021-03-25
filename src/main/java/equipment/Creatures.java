package equipment;

public enum Creatures {

    OGRE (20),
    ORC (35),
    DRAGON (70),
    MERMAID (40),
    YETI (40),
    GHOUL (10),
    TROLL (5),
    MAD_FAIRY (80),
    IMP (30);

    private final int creatureDamage;

    Creatures(int creatureDamage){
        this.creatureDamage = creatureDamage;
    }

    public int getCreatureDamage() {
        return creatureDamage;
    }
}
