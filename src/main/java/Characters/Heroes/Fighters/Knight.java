package Characters.Heroes.Fighters;

import Characters.Character;

public class Knight extends Fighter {

    public Knight(String name){
        super(name);
        this.weapon = Weapon.SWORD;
        this.defence = Defence.SHIELD;
    }

    public int stab(){
        return 20;
    }

    //move2
    //For the knight the stab has 100% chance of hitting.
    public void signatureMove(Character characterToAttack){
       {characterToAttack.takeDamage(this.stab());}
    }


}
