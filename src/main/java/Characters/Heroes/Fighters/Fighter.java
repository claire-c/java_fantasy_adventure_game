package Characters.Heroes.Fighters;

import Characters.Character;
import Characters.Heroes.Hero;

public abstract class Fighter extends Hero {

    private String name;
    private int hp;
    private Weapon weapon;
    private Defence defence;

    public Fighter(String name){
        super(name);
        this.weapon = null;
        this.defence = null;

    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Defence getDefence() {
        return defence;
    }

    public void setDefence(Defence defence) {
        this.defence = defence;
    }

    public void takeDamage(int damage){
        this.hp -= (damage * defence.getDefenceValue());
    }

    public int wield(Weapon weapon){
        return weapon.damageValue;
    }

    //move1
    public void standardMove(Character characterToAttack){
        if(shouldDoMove(this.weapon.chanceValue)){characterToAttack.takeDamage(this.wield(weapon));}
    }
}
