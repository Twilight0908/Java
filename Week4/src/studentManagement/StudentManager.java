package studentManagement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentManager implements Management<Student> {
    private List<Student> studentList = null;
    private final IOStudent ioStudent = new IOStudent();
    private int numberStudent = 0;

    public StudentManager() {
        try {
            this.studentList = this.ioStudent.readFile();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int getNumberStudent() {
        return numberStudent;
    }

    @Override
    public void add(Student student) {
        try {
            this.studentList.add(student);
            this.ioStudent.writeFile(this.studentList);
            this.numberStudent++;
            System.out.println("Them Thanh Cong !\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void edit(String id, Student student) {
        int index = findIndexById(id);
        if (index != -1) {
            this.studentList.set(index, student);

            try {
                this.ioStudent.writeFile(this.studentList);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Sua Thanh Cong !\n");
        } else {
            System.out.println("Khong Co Id Muon Sua\n");
        }
    }

    @Override
    public void delete(String id) {
        int index = findIndexById(id);
        if (index != -1) {
            this.studentList.remove(index);
            this.numberStudent--;

            try {
                this.ioStudent.writeFile(this.studentList);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Xoa Thanh Cong !\n");
        } else {
            System.out.println("Khong Co Id Muon Xoa\n");
        }
    }

    @Override
    public int findIndexById(String id) {
        for (int i = 0; i < this.studentList.size(); i++) {
            if (id.equals(this.studentList.get(i).getId())) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<Student> getAll() {
        try {
            return this.ioStudent.readFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Student> findByName(String name) {
        List<Student> list = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getName().toLowerCase().contains(name.toLowerCase())) {
                list.add(student);
            }
        }
        return list;
    }
}
