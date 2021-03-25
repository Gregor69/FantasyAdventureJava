package players;

import equipment.*;

public abstract class Player {

    private String name;
    private int health;

    public Player (String name, int health){
        this.name = name;
        this.health = health;

    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void removeHealthFromWeapon(Weapons weapons){
        this.health -= weapons.getDamage();
    }

    public void removeHealthFromSpells(Spells spells){
        this.health -= spells.getMagicDamage();
    }

    public void removeHealthFromCreatures(Creatures creatures){
        this.health -= creatures.getCreatureDamage();
    }

    public void addHealthFromHealingPower(HealingPower healingPower){
        this.health += healingPower.getHealingValue();
    }

    public void addHealthFromTreasure(Treasure treasure){
        this.health += treasure.getTreasureValue();
    }

    public void
}

