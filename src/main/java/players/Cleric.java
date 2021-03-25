package players;

import equipment.HealingPower;

import java.util.ArrayList;

public class Cleric extends Player {


    private HealingPower healingPower;


    public Cleric(String name, int health, HealingPower healingPower) {
        super(name, health);
        this.healingPower = healingPower;

    }

    public HealingPower getHealingPower() {
        return healingPower;
    }

    public void setHealingPower(HealingPower healingPower) {
        this.healingPower = healingPower;
    }
}
