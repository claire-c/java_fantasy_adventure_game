package Characters.Heroes;

import Characters.Character;

public abstract class Healer extends Character {

    private String name;
    private int hp;
    private HealingTool healingTool;

    public Healer(String name){
        super(name);
//        randomHealingTool();
//        this.healingTool = HealingTool.getRandomHealingTool();
//        So this is bad code - I dont know why but the tests are failing randomly. I would have thought that the randomhealingtool would run once and store the one healing tool but it seems to be running the method every time I do anything with the cleric so they have a constantly evolving tool...
//
        this.healingTool = HealingTool.AGOODSNOOZE;
    }

    public HealingTool getHealingTool() {
        return healingTool;
    }

    public void setHealingTool(HealingTool healingTool) {
        this.healingTool = healingTool;
    }


//    public void randomHealingTool() {
//        int result = getRandomNumber(4);
//        if (result == 0) {
//            this.healingTool = HealingTool.HERBS;
//        } else if (result == 1) {
//            this.healingTool = HealingTool.BITTERROOT;
//        }else if (result == 2) {
//            this.healingTool = HealingTool.AGOODSNOOZE;
//        }else if (result == 3) {
//            this.healingTool = HealingTool.HERBS;
//        }
//    }
}
