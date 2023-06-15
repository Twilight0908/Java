package Inheritance.personManager.model;

public class Staff extends Person {
    private String job;

    public Staff(String name, int age, int sex, String address, String job) {
        super(name, age, sex, address);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        if (this.getSex() == 0) {
            return "Name: " + this.getName() +
                    " Age: " + this.getAge() +
                    " Sex: Female" +
                    " Address: " + this.getAddress() +
                    " Job: " + this.getJob();
        } else if (this.getSex() == 1) {
            return "Name: " + this.getName() +
                    " Age: " + this.getAge() +
                    " Sex: Male" +
                    " Address: " + this.getAddress() +
                    " Job: " + this.getJob();
        }
        return "Name: " + this.getName() +
                " Age: " + this.getAge() +
                " Sex: Other" +
                " Address: " + this.getAddress() +
                " Job: " + this.getJob();
    }
}
