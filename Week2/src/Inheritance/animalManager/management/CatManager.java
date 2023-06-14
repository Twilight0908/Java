package Inheritance.animalManager.management;

import Inheritance.animalManager.model.Cat;

public class CatManager implements Manager<Cat> {
    private Cat[] cats;
    public static int size = 0;

    public CatManager() {
        this.cats = new Cat[100];
    }

    @Override
    public void add(Cat cat) {
        this.cats[size] = cat;
        size++;
    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        for (int i = index; i < size - 1; i++) {
            this.cats[i] = this.cats[i + 1];
        }
        this.cats[size - 1] = null;
        size--;
    }

    @Override
    public void edit(int id, Cat cat) {
        int index = findIndexById(id);
        if (findIndexById(id) == -1) {
            System.out.println("Not Found");
        } else {
            this.cats[index] = cat;
        }
    }

    @Override
    public Cat findById(int id) {
        return null;
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < size; i++) {
            if (id == this.cats[i].getId()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Cat[] showAll() {
        return this.cats;
    }
}
