package OOP_HW02_Aquarium.Residents;

import OOP_HW02_Aquarium.EatingFish;
import OOP_HW02_Aquarium.Residents.Base.AquaResidents;

public class AquaMan extends AquaResidents implements EatingFish {

    public AquaMan(String type, String name) {
        super(type, name);
    }

    @Override
    public String sound() {
        return "AquaMan says:\t\t Submit, landsmen!";
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int eatedFishes() {
        return 9999;
    }
}