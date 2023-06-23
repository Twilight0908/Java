package street;

public class Person {
    private int idPerson;
    private String namePerson;
    private int age;
    private String job;

    public Person(int idPerson, String namePerson, int age, String job) {
        this.idPerson = idPerson;
        this.namePerson = namePerson;
        this.age = age;
        this.job = job;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Id: " + idPerson +
                " Ten: " + namePerson +
                " Tuoi: " + age +
                " Cong Viec: " + job;
    }
}
