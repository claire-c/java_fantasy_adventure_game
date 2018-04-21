package Characters.Heroes;

import Characters.Character;

public abstract class Fighter extends Character {

    private String name;
    private int hp;
    private Weapon weapon;
    private Defence defence;

    public Fighter(String name){
        super(name);

    }


}
