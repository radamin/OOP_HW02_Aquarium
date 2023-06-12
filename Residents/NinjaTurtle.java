package OOP_HW02_Aquarium.Residents;

import OOP_HW02_Aquarium.HitingSuperCombo;

public class NinjaTurtle extends Turtle implements HitingSuperCombo {

    private final String superPunch;
    private final String beltColor;
    private final String weapon;

    public NinjaTurtle(String type, String name, String beltColor, String weapon, String superPunch) {
        super(type, name);
        this.beltColor = beltColor;
        this.weapon = weapon;
        this.superPunch = superPunch;
    }

    @Override
    public String sound() {
        return "Ninja-turtle says :\t\t KAWA-BANGA!";
    }

    @Override
    public String toString() {
        return String.format("%s He is %s belt on and keeps his %s.", super.toString(), beltColor, weapon);
    }

    @Override
    public String hitingSuperCombo() {
        return String.format(super.toString(), superPunch, getComboStrength());
    }

    @Override
    public int getComboStrength() {
        return 100;
    }
}