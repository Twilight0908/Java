package Inheritance.animalManager.model;

public class Animal {
    private int id;
    private String name;
    private static int countId = 0;

    public Animal(String name) {
        this.id = countId;
        countId++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
