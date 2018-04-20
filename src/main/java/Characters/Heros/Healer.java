package Characters.Heros;

import Characters.Character;

public abstract class Healer extends Character {

    private String name;
    private int hp;
    private HealingTool healingTool;

    public Healer(String name){
        super(name);
        this.healingTool = randomTool();
    }

    public HealingTool getHealingTool() {
        return healingTool;
    }

    public HealingTool randomTool(){

    }


}
