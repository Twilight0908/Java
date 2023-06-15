package Inheritance.personManager.management;

import Inheritance.personManager.model.Worker;

public class WorkerManager implements PersonManager<Worker> {
    private Worker[] workers;
    public static int size = 0;

    public WorkerManager() {
        this.workers = new Worker[100];
    }

    @Override
    public void add(Worker worker) {
        this.workers[size] = worker;
        size++;
    }

    @Override
    public void delete(int id) {
        int index=findIndexById(id);
        for (int i=index;i<size-1;i++){
            this.workers[i]=this.workers[i+1];
        }
        this.workers[size-1]=null;
        size--;
    }

    @Override
    public void edit(int id, Worker worker) {
        int index=findIndexById(id);
        if (index!=-1){
            this.workers[index]=worker;
        }
    }

    @Override
    public Worker findById(int id) {
        int index=findIndexById(id);
        if (index!=-1){
            return this.workers[index];
        }
        return null;
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < size; i++) {
            if (id==this.workers[i].getId()){
                return i;
            }
        }
        return -1;
    }

    @Override
    public Worker[] showAll() {
        return this.workers;
    }
}
