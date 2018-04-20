package Characters.Heros;

import Characters.Character;

public abstract class Fighter extends Character {

    private String name;
    private int hp;
    private Weapon weapon;
    private Defense defense;

    public Fighter(String name){
        super(name);

    }


}
