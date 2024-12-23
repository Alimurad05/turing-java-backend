package turing.edu.az.project;

public class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;
    public Pet() {
        this.species = species;
        this.nickname = "";
        this.age = 0;
        this.trickLevel = 0;
        this.habits = new String[0];
    }

    public Pet(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = new String[0];
    }
    public Pet(Species species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }
    public void eat() {
        System.out.println("I am eating");
    }
    public void respond() {
        System.out.println("Hello, owner. I am " + this.nickname + ". I miss you!");
    }
    public void foul() {
        System.out.println("I need to cover it up");
    }


    @Override
    public String toString() {
        StringBuilder habitsStr = new StringBuilder();
        for (int i = 0; i < habits.length; i++) {
            habitsStr.append(habits[i]);
            if (i < habits.length - 1) {
                habitsStr.append(", ");
            }
        }
        return "Species: " + species + " | Nickname: " + nickname + " | Age: " + age +
                " | Trick Level: " + trickLevel + " | Habits: [" + habitsStr + "]";
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }
}
