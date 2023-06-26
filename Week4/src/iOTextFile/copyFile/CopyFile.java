package iOTextFile.copyFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public List<Integer> readFile(String path) {
        List<Integer> integerList = new ArrayList<>();

        try {
            File file = new File(path);

            if (!file.exists()) {
                throw new FileNotFoundException();
            } else {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    integerList.add(Integer.parseInt(line));
                }

                bufferedReader.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return integerList;
    }

    public void writeFile(List<Integer> integerList, String path) {
        try {
            File file = new File(path);

            if (!file.exists()) {
                System.out.println(file.createNewFile());
            } else {
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                String str = "";
                for (Integer integer : integerList) {
                    str += integer + "\n";
                }

                bufferedWriter.write(str);
                bufferedWriter.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String path = "Week4/text/numbers.txt";
        String path2 = "Week4/text/copyNumbers.txt";
        CopyFile copyFile = new CopyFile();

        List<Integer> integerList = copyFile.readFile(path);
        copyFile.writeFile(integerList, path2);
    }
}
