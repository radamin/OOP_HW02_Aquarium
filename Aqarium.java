package OOP_HW02_Aquarium;

import OOP_HW02_Aquarium.Residents.Base.AquaResidents;

import java.util.ArrayList;
import java.util.List;

public class Aqarium {
    private final Water water = new Water();
    private final List<AquaResidents> aquarium = new ArrayList<>();
    private final Cleaner joe = new Cleaner("Joe", "mop", "Holly trash!");
    private final Cleaner bob = new Cleaner("Bob", "broomstick", "Heavy cleaning");

    public Aqarium addAquaResidents(AquaResidents residents) {
        aquarium.add(residents);
        return this;
    }

    private List<AquaSoundAble> getAquaSoundable() {
        List<AquaSoundAble> result = new ArrayList<>(aquarium);
        result.add(water);
        return result;
    }

    public String getAquaSound() {
        StringBuilder builder = new StringBuilder();
        for (AquaSoundAble soundable : getAquaSoundable()) {
            builder.append(soundable.sound()).append('\n');
        }
        return builder.toString();
    }

    public List<EatingFish> ateFishes() {
        List<EatingFish> fishEaters = new ArrayList<>();
        for (AquaResidents fishers : aquarium) {
            if (fishers instanceof EatingFish) {
                fishEaters.add((EatingFish) fishers);
            }
        }
        fishEaters.add(joe);
        return fishEaters;
    }

    public List<HitingSuperCombo> heroes() {
        List<HitingSuperCombo> superHeroes = new ArrayList<>();
        for (AquaResidents hero : aquarium) {
            if (hero instanceof HitingSuperCombo) {
                superHeroes.add((HitingSuperCombo) hero);
            }
        }
        superHeroes.add(joe);
        superHeroes.add(bob);
        return superHeroes;
    }

    public HitingSuperCombo getSuperChamp(List<HitingSuperCombo> supers) {
        HitingSuperCombo superSuper = supers.get(0);
        for (HitingSuperCombo isSuper : supers) {
            if (isSuper.getComboStrength() > superSuper.getComboStrength()) {
                superSuper = isSuper;
            }
        }
        return superSuper;
    }

    public EatingFish getMainGuzzler(List<EatingFish> eaters) {
        EatingFish mainEater = eaters.get(0);
        for (EatingFish eater : eaters) {
            if (eater.eatedFishes() > mainEater.eatedFishes()) {
                mainEater = eater;
            }
        }
        return mainEater;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n *** Let's look, who is there in our aquarium: *** \n");
        for (AquaResidents residents : aquarium) {
            builder.append(residents).append("\n");
        }
        return builder.toString();
    }
}