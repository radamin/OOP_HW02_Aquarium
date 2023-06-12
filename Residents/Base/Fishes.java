package OOP_HW02_Aquarium.Residents.Base;

public abstract class Fishes extends AquaResidents {


    public Fishes(String type, String name) {
        super(type, name);
    }

    @Override
    public String sound() {
        return "Fish says:\t\t Blop-blop";
    }

}