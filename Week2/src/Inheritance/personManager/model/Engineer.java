package Inheritance.personManager.model;

public class Engineer extends Person {
    private String Majors;

    public Engineer(String name, int age, int sex, String address, String majors) {
        super(name, age, sex, address);
        Majors = majors;
    }

    public String getMajors() {
        return Majors;
    }

    public void setMajors(String majors) {
        Majors = majors;
    }

    @Override
    public String toString() {
        if (this.getSex() == 0) {
            return "Name: " + this.getName() +
                    " Age: " + this.getAge() +
                    " Sex: Female" +
                    " Address: " + this.getAddress() +
                    " Majors: " + this.getMajors();
        } else if (this.getSex() == 1) {
            return "Name: " + this.getName() +
                    " Age: " + this.getAge() +
                    " Sex: Male" +
                    " Address: " + this.getAddress() +
                    " Majors: " + this.getMajors();
        }
        return "Name: " + this.getName() +
                " Age: " + this.getAge() +
                " Sex: Other" +
                " Address: " + this.getAddress() +
                " Majors: " + this.getMajors();
    }
}
