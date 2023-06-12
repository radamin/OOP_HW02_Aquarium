package OOP_HW02_Aquarium;

public interface EatingFish {
    default int eatedFishes() {
        return 0;
    }
}