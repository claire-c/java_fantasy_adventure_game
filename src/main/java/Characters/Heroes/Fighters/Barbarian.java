package Characters.Heroes.Fighters;

import Characters.Character;

public class Barbarian extends Fighter {
    private int rageChance;

    public Barbarian(String name){
        super(name);
        weapon = Weapon.CLUB;
        defence = Defence.ARMGUARDS;
        rageChance = 6;
    }

    public void signatureMove(Character characterToAttack) {
        if (hp < 20) {
            characterToAttack.setHp(0);
            this.setHp(0);
        } else if (shouldDoMove(rageChance)) {
            characterToAttack.setHp(0);
            this.setHp(0);
        }
    }
}
