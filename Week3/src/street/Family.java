package street;

import java.util.ArrayList;
import java.util.List;

public class Family implements Management<Person> {
    private int idFamily;
    private String nameFamily;
    private int numberPerson = 0;
    private List<Person> personList = new ArrayList<>();

    public Family(int idFamily, String nameFamily) {
        this.idFamily = idFamily;
        this.nameFamily = nameFamily;
    }

    public int getIdFamily() {
        return idFamily;
    }

    public void setIdFamily(int idFamily) {
        this.idFamily = idFamily;
    }

    public String getNameFamily() {
        return nameFamily;
    }

    public void setNameFamily(String nameFamily) {
        this.nameFamily = nameFamily;
    }

    public int getNumberPerson() {
        return numberPerson;
    }

    public void setNumberPerson(int numberPerson) {
        this.numberPerson = numberPerson;
    }

    @Override
    public void add(Person person) {
        this.personList.add(person);
        this.numberPerson++;
    }

    @Override
    public void edit(int id, Person person) {
        int index = findIndexById(id);
        if (index != -1) {
            this.personList.set(index, person);
        }
    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        if (index != -1) {
            this.personList.remove(index);
            this.numberPerson--;
        }
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < this.personList.size(); i++) {
            if (id == this.personList.get(i).getIdPerson()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<Person> getAll() {
        return this.personList;
    }
}
