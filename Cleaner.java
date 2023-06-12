package OOP_HW02_Aquarium;

public class Cleaner implements HitingSuperCombo, EatingFish {

    String cleanerName;
    String cleanerWeapon;
    String cleanerSuperPunch;

    public Cleaner(String cleanerName, String cleanerWeapon, String cleanerSuperPunch) {
        this.cleanerName = cleanerName;
        this.cleanerWeapon = cleanerWeapon;
        this.cleanerSuperPunch = cleanerSuperPunch;
    }

    @Override
    public String hitingSuperCombo() {
        return String.format("- Just look at %s! He used his %s to make %s!!!"
                , cleanerName, cleanerWeapon, cleanerSuperPunch);
    }

    @Override
    public int getComboStrength() {
        return 30;
    }

    @Override
    public String toString() {
        return String.format("- It's just a cleaner %s with him %s.", cleanerName, cleanerWeapon);
    }

    @Override
    public int eatedFishes() {
        return 20;
    }
}