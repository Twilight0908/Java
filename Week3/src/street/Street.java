package street;

import java.util.ArrayList;
import java.util.List;

public class Street implements Management<Family> {
    private int idStreet;
    private String nameStreet;
    private int numberFamily = 0;
    private List<Family> familyList = new ArrayList<>();

    public Street(int idStreet, String nameStreet) {
        this.idStreet = idStreet;
        this.nameStreet = nameStreet;
    }

    public int getIdStreet() {
        return idStreet;
    }

    public void setIdStreet(int idStreet) {
        this.idStreet = idStreet;
    }

    public String getNameStreet() {
        return nameStreet;
    }

    public void setNameStreet(String nameStreet) {
        this.nameStreet = nameStreet;
    }

    public int getNumberFamily() {
        return numberFamily;
    }

    public void setNumberFamily(int numberFamily) {
        this.numberFamily = numberFamily;
    }

    @Override
    public void add(Family family) {
        this.familyList.add(family);
        this.numberFamily++;
    }

    @Override
    public void edit(int id, Family family) {
        int index = findIndexById(id);
        if (index != -1) {
            familyList.set(id, family);
        }
    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        if (index != -1) {
            familyList.remove(index);
            numberFamily--;
        }
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < this.familyList.size(); i++) {
            if (id == this.familyList.get(i).getIdFamily()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<Family> getAll() {
        return this.familyList;
    }
}
