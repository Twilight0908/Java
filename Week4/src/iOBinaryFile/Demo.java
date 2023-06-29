package iOBinaryFile;

import java.io.FileInputStream;
import java.io.InputStream;

public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.inputStreamExample();
    }

    public void readByteConsole() {
        try {
            InputStream inputStream = System.in;
            while (true) {
                System.out.print("Nhap 1 Ky Tu: ");
                int ch = inputStream.read();
                if (ch == 'q') {
                    System.out.println("Finished!");
                    break;
                }
                inputStream.skip(2);
                System.out.println("Ky Tu Nhan Duoc: " + (char) ch);

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void inputStreamExample() {
        try {
            InputStream inputStream = new FileInputStream("Week4/text/test.txt");

            int i=-1;
            while ((i=inputStream.read())!=-1){
                System.out.println((char) i);
            }
            inputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
