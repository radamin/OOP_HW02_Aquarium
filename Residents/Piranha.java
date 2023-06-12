package OOP_HW02_Aquarium.Residents;

import OOP_HW02_Aquarium.Residents.Base.PredatoryFish;

public class Piranha extends PredatoryFish {

    public Piranha(String type, String name) {
        super(type, name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int eatedFishes() {
        return 1234;
    }
}