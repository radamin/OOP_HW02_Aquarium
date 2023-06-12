package OOP_HW02_Aquarium.Residents.Base;

import OOP_HW02_Aquarium.EatingFish;

public abstract class PredatoryFish extends Fishes implements EatingFish {

    public PredatoryFish(String type, String name) {
        super(type, name);
    }

}