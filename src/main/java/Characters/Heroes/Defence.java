package Characters.Heroes;

public enum Defence {

    SHIELD(0.5),
    ARMOUR(0.75),
    ARMGUARDS(0.9);

    public final double defenceValue;


    Defence(double defenceValue) {
        this.defenceValue = defenceValue;
    }

    public double getDefenceValue() {
        return defenceValue;
    }

}

