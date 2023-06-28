package studentManagement;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private final StudentManager studentManager = new StudentManager();
    private final Scanner INPUT = new Scanner(System.in);

    public int checkInput() {
        int input;
        while (true) {
            try {
                input = Integer.parseInt(INPUT.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Hay Nhap So !!!");
                System.out.print("Nhap Lua Chon: ");
            }
        }
        return input;
    }

    public void mainMenu() {
        int choice = -1;
        do {
            String str = "===== Quan Ly Hoc Sinh =====\n" +
                    "1. Them Hoc Sinh\n" +
                    "2. Sua Hoc Sinh\n" +
                    "3. Xoa Hoc Sinh\n" +
                    "4. Tim Kiem Hoc Sinh\n" +
                    "5. Hien Thi Danh Sach Hoc Sinh\n" +
                    "0. Thoat\n";
            System.out.println(str);
            System.out.println("----------\n");
            System.out.print("Nhap Lua Chon: ");
            choice = checkInput();
            System.out.println("----------\n");

            switch (choice) {
                case 1:
                    addMenu();
                    break;
                case 2:
                    editMenu();
                    break;
                case 3:
                    deleteMenu();
                    break;
                case 4:
                    findMenu();
                    break;
                case 5:
                    showAll();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Khong Co Lua Chon !!!\n");
                    System.out.println("----------\n");
            }
        } while (choice != 0);
    }

    public void addMenu() {
        System.out.println("+++++ Them Hoc Sinh +++++\n");
        String id;
        while (true) {
            System.out.print("Nhap Id: ");
            id = INPUT.nextLine();
            if (studentManager.findIndexById(id) == -1) {
                break;
            }
            System.out.println("Id Da Co !!!");
        }

        System.out.print("Nhap Ten: ");
        String name = INPUT.nextLine();

        System.out.print("Nhap Tuoi: ");
        int age = checkInput();

        System.out.print("Nhap Dia Chi: ");
        String address = INPUT.nextLine();

        Student student = new Student(id, name, age, address);
        studentManager.add(student);

        System.out.println("\n");
    }

    public void editMenu() {
        System.out.println("!!!! Sua Hoc Sinh !!!!!\n");
        System.out.print("Nhap Id: ");
        String id = INPUT.nextLine();
        if (studentManager.findIndexById(id) == -1) {
            System.out.println("Khong Co Id Muon Sua\n");
        } else {
            System.out.print("Nhap Ten: ");
            String name = INPUT.nextLine();

            System.out.print("Nhap Tuoi: ");
            int age = checkInput();

            System.out.print("Nhap Dia Chi: ");
            String address = INPUT.nextLine();

            Student student = new Student(id, name, age, address);
            studentManager.edit(id, student);
        }
    }

    public void deleteMenu() {
        System.out.println("----- Xoa Hoc Sinh -----\n");
        System.out.print("Nhap Id: ");
        String id = INPUT.nextLine();

        studentManager.delete(id);

        System.out.println("\n");
    }

    public void findMenu() {
        int choice = -1;
        do {
            String str = "===== Tim Kiem Hoc Sinh =====\n" +
                    "1. Theo Ten Hoc Sinh\n" +
                    "2. Theo Id Hoc Sinh\n" +
                    "0. Thoat\n";
            System.out.println(str);
            System.out.println("----------\n");
            System.out.print("Nhap Lua Chon: ");
            choice = checkInput();
            System.out.println("----------\n");

            switch (choice) {
                case 1:
                    findByNameMenu();
                    break;
                case 2:
                    findByIdMenu();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Khong Co Lua Chon !!!\n");
                    System.out.println("----------\n");
            }
        } while (choice != 0);
    }

    public void findByNameMenu() {
        System.out.println("%%%%% Tim Kiem Hoc Sinh Theo Ten %%%%%\n");
        System.out.print("Nhap Ten: ");
        String name = INPUT.nextLine();
        System.out.println("----------\n");
        List<Student> list = studentManager.findByName(name);
        if (list.size() != 0) {
            for (Student student : list) {
                System.out.println(student.toString());
                System.out.println("**********\n");
            }
        } else {
            System.out.println("Khong Tim Thay Hoc Sinh !!!");
        }
        System.out.println("----------\n");
    }

    public void findByIdMenu() {
        System.out.println("%%%%% Tim Kiem Hoc Sinh Theo Id %%%%%\n");
        System.out.print("Nhap Id: ");
        String id = INPUT.nextLine();
        System.out.println("----------\n");
        int index = studentManager.findIndexById(id);
        if (index != -1) {
            System.out.println(studentManager.getAll().get(index).toString());
            System.out.println("----------\n");
        } else {
            System.out.println("Khong Tim Thay Hoc Sinh !!!");
            System.out.println("----------\n");
        }
    }

    public void showAll() {
        System.out.println("***** Danh Sach Hoc Sinh *****\n");
        for (Student student : studentManager.getAll()) {
            System.out.println(student.toString());
            System.out.println("**********\n");
        }
        System.out.println("----------\n");
    }
}
