package iOTextFile;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoPrintWriter {
    public static void main(String[] args) {
        File file = new File("Week4/text/text1.txt");

        try {
            if (!file.exists()) {
                System.out.println(file.createNewFile());
            } else {
                PrintWriter printWriter = new PrintWriter(file);
                printWriter.println("This is a test1.txt");
                printWriter.println(20);
                printWriter.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
