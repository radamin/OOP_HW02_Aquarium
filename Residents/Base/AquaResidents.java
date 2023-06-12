package OOP_HW02_Aquarium.Residents.Base;

import OOP_HW02_Aquarium.AquaSoundAble;


public abstract class AquaResidents implements AquaSoundAble {

    private final String type;
    private final String name;

    public AquaResidents(String type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("- Oh, look! This is %s %s!", type, name);
    }
}