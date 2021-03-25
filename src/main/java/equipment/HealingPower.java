package equipment;

public enum HealingPower {

    POTION (20),
    HERBS (5),
    STICKING_PLASTER (1),
    RESURRECTION (100),
    HEALING_TOUCH (30);

    private final int healingValue;

    HealingPower(int healingValue) {
        this.healingValue = healingValue;
    }

    public int getHealingValue(){
        return this.healingValue;
    }
}
