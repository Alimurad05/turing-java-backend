package turing.edu.az.project;
public enum Species {
    CAT("Cat", 4, true, false),
    DOG("Dog", 4, true, true),
    BIRD("Bird", 2, false, false),
    FISH("Fish", 0, false, false),
    HAMSTER("Hamster", 4, false, true);

    private String species;
    private int numberOfLegs;
    private boolean canFly;
    private boolean hasFur;

    Species(String species, int numberOfLegs, boolean canFly, boolean hasFur) {
        this.species = species;
        this.numberOfLegs = numberOfLegs;
        this.canFly = canFly;
        this.hasFur = hasFur;
    }

    @Override
    public String toString() {
        return "Species: " + species + " | Legs: " + numberOfLegs + " | Can Fly: " + canFly + " | Has Fur: " + hasFur;
    }
}

