package studentManagement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOStudent {
    private final File file = new File("Week4/text/student.csv");

    public void writeFile(Student student) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = null;
        String data = "";
        while ((line = bufferedReader.readLine()) != null) {
            data += line + "\n";
        }
        bufferedReader.close();

        data += student.getId() + "," + student.getName() + "," + student.getAge() + "," + student.getAddress();
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(data);
        bufferedWriter.close();
    }

    public void editFile() throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("");
        bufferedWriter.close();
    }

    public List<Student> readFile() throws IOException {
        List<Student> studentList = new ArrayList<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            String[] data = line.split(",");
            studentList.add(new Student(data[0], data[1], Integer.parseInt(data[2]), data[3]));
        }
        bufferedReader.close();

        return studentList;
    }
}
