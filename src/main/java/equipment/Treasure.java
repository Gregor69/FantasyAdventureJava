package equipment;

public enum Treasure {

    GOLD(75),
    RUBY(20),
    EMERALD(15),
    ROSE_GOLD(10);

    private final int treasureValue;

    Treasure(int treasureValue) {
        this.treasureValue = treasureValue;
    }

    public int getTreasureValue() {
        return treasureValue;
    }
}
