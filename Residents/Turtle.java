package OOP_HW02_Aquarium.Residents;

import OOP_HW02_Aquarium.EatingFish;
import OOP_HW02_Aquarium.Residents.Base.Amphibians;

public class Turtle extends Amphibians implements EatingFish {

    public Turtle(String type, String name) {
        super(type, name);
    }

    @Override
    public String sound() {
        return "Turtle says:\t\t I don't know any Splinter!";
    }

    @Override
    public int eatedFishes() {
        return 60;
    }
}