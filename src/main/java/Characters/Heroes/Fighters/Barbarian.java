package Characters.Heroes.Fighters;

import Characters.Character;

public class Barbarian extends Fighter {

    public Barbarian(String name){
        super(name);
        weapon = Weapon.CLUB;
        defence = Defence.ARMGUARDS;
    }

    public void signatureMove(Character characterToAttack){
        if (shouldDoMove(weapon.chanceValue / 2))
        {characterToAttack.setHp(0);
        this.setHp(0);
        }
    }
}
