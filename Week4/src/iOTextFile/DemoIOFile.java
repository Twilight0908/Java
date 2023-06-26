package iOTextFile;

import java.io.*;

public class DemoIOFile {
    public static void main(String[] args) {
        File file = new File("Week4/text/test.txt");
        String str = "This is a test.txt";

        try {
            if (!file.exists()) {
                System.out.println(file.createNewFile());
            } else {
                System.out.println(file.getAbsolutePath());
                System.out.println(file.exists());
                System.out.println(file.getName());

                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                bufferedWriter.write(str);
                bufferedWriter.close();

                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
                bufferedReader.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
