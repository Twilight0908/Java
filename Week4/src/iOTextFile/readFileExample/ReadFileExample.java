package iOTextFile.readFileExample;

import java.io.*;

public class ReadFileExample {
    public void readFileTxt(String path) {
        try {
            File file = new File(path);

            if (!file.exists()) {
                throw new FileNotFoundException();
            } else {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line = null;
                int sum = 0;

                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                    sum += Integer.parseInt(line);
                }

                bufferedReader.close();

                System.out.println("Total: " + sum);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String path = "Week4/text/numbers.txt";

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileTxt(path);
    }
}
