package turing.edu.az.project;

public class Human {
    private String name;
    private String surname;
    private int birthYear;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private Family family;
    private String[][] schedule;

    public Human() {
        this.name = "";
        this.surname = "";
        this.birthYear = 0;
        this.iq = 0;
        this.pet = null;
        this.mother = null;
        this.father = null;
        this.schedule = new String[7][0];
    }

    public Human(String name, String surname, int birthYear,int iq) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.iq = iq;
        this.pet = null;
        this.mother = null;
        this.father = null;
        this.schedule = new String[7][0];
    }

    public Human(String name, String surname, int birthYear, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }
    public void greetPet() {
        System.out.println("Hello " + this.pet.getNickname());
    }
    public void describePet(){
        String slyness = this.pet.getTrickLevel() > 50 ? "very sly" : "almost not sly";
        System.out.println("I have an " + this.pet.getSpecies() + " is " + this.pet.getAge() + " years old, he is " + slyness );
    }
    public boolean feedPet(boolean isFeedingTime) {
        if (this.pet == null) {
            System.out.println("This human has no pet to feed.");
            return false;
        }

        if (isFeedingTime) {
            System.out.println("Hm... I will feed " + this.pet.getNickname());
            return true;
        } else {
            int random = new java.util.Random().nextInt(100);
            if (this.pet.getTrickLevel() > random) {
                System.out.println("Hm... I will feed " + this.pet.getNickname());
                return true;
            } else {
                System.out.println("I think " + this.pet.getNickname() + " is not hungry.");
                return false;
            }
        }
    }

    @Override
    public String toString() {
        String motherName = (mother != null) ? mother.getName() + " " + getSurname() : "unknown";
        String fatherName = (father != null) ? father.getName() + " " + getSurname() : "unknown";
        return "Human{name='" + name + "', surname='" + surname + "', year=" + birthYear +
                ", iq=" + iq + ", mother=" + motherName + ", father=" + fatherName + ", pet=" + pet + "}";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule() {
        schedule[DayOfWeek.MONDAY.ordinal()] = new String[] {"Math", "English"};
        schedule[DayOfWeek.TUESDAY.ordinal()] = new String[] {"History", "Art"};
        schedule[DayOfWeek.WEDNESDAY.ordinal()] = new String[] {"Physics", "Chemistry"};
        schedule[DayOfWeek.THURSDAY.ordinal()] = new String[] {"Biology", "Music"};
        schedule[DayOfWeek.FRIDAY.ordinal()] = new String[] {"Literature", "PE"};
        schedule[DayOfWeek.SATURDAY.ordinal()] = new String[] {"Drawing", "Sports"};
        schedule[DayOfWeek.SUNDAY.ordinal()] = new String[] {"Rest", "Family time"};
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }
}
