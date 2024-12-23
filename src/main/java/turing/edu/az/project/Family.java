package turing.edu.az.project;
public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;
    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
    }

    public void addChild(Human child) {
        Human[] newChildren = new Human[children.length + 1];
        for (int i = 0; i < children.length; i++) {
            newChildren[i] = children[i];
        }
        newChildren[children.length] = child;
        this.children = newChildren;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Family object is being removed: " + this);
        super.finalize();
    }
    public void deleteChild(Human child){
        if (child == null) {
            System.out.println("Provided child is null, no changes made.");
            return;
        }
        Human[] editingdchild=new Human[children.length-1];
        boolean found=false;
        for (int i = 0, j = 0; i < children.length; i++) {
            if (!children[i].equals(child)) {
                editingdchild[j++] = children[i];
            } else {
                found = true;
            }
        }
        if(found){
            this.children=editingdchild;
            child.setFamily(null);
        }
    }
    public int familycount(){
        int count=2+ children.length;
        return count;
    }
    @Override
    public String toString() {
        StringBuilder childrenList = new StringBuilder();
        for (Human child : children) {
            childrenList.append(child.getName()).append(" ").append(child.getSurname()).append(" ");
        }
        return "Family{mother=" + mother.getName() + ", father=" + father.getName() +
                ", children=[" + childrenList + "], pet=" + pet + "}";
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }
}
