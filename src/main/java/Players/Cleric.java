package Players;

import java.util.ArrayList;

public class Cleric extends Player {


    private ArrayList<HealingTool> healingTools;


    public Cleric(String name, int health) {
        super(name, health);
        this.healingTools = new ArrayList<HealingTool>();

    }

    public ArrayList<HealingTool> getHealingTools() {
        return healingTools;
    }


}
