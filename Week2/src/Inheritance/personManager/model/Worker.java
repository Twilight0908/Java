package Inheritance.personManager.model;

public class Worker extends Person {
    private int levels;

    public Worker(String name, int age, int sex, String address, int levels) {
        super(name, age, sex, address);
        this.levels = levels;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    @Override
    public String toString() {
        if (this.getSex() == 0) {
            return "Name: " + this.getName() +
                    " Age: " + this.getAge() +
                    " Sex: Female" +
                    " Address: " + this.getAddress() +
                    " Levels: " + this.getLevels();
        } else if (this.getSex() == 1) {
            return "Name: " + this.getName() +
                    " Age: " + this.getAge() +
                    " Sex: Male" +
                    " Address: " + this.getAddress() +
                    " Levels: " + this.getLevels();
        }
        return "Name: " + this.getName() +
                " Age: " + this.getAge() +
                " Sex: Other" +
                " Address: " + this.getAddress() +
                " Levels: " + this.getLevels();
    }
}
