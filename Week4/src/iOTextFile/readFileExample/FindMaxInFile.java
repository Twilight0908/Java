package iOTextFile.readFileExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FindMaxInFile {
    public List<Integer> readFile(String path) {
        List<Integer> list = new ArrayList<>();

        try {
            File file = new File(path);

            if (!file.exists()) {
                throw new FileNotFoundException();
            } else {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    list.add(Integer.parseInt(line));
                }

                bufferedReader.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public int findMax(List<Integer> list) {
        int max = list.get(0);
        for (Integer integer : list) {
            if (max < integer) {
                max = integer;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        String path = "Week4/text/numbers.txt";
        FindMaxInFile findMaxInFile = new FindMaxInFile();

        List<Integer> list = findMaxInFile.readFile(path);
        int value = findMaxInFile.findMax(list);

        System.out.println("Max: " + value);
    }
}
