package Inheritance.personManager.model;

public class Person {
    private int id;
    private static int countId=0;
    private String name;
    private int age;
    private int sex;
    private String address;

    public Person(String name, int age, int sex, String address) {
        this.id=countId;
        countId++;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
