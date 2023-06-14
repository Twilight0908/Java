package Inheritance.animalManager.menu;

import Inheritance.animalManager.management.CatManager;
import Inheritance.animalManager.model.Cat;

import java.util.Scanner;

public class MainMenu {
    private CatManager catManager;
    private Scanner scanner = new Scanner(System.in);

    public MainMenu() {
        catManager = new CatManager();
    }

    public void showMainMenu() {
        String menu = "=======Menu chính=========\n1.Quản lý mèo\n2.Quản lý chó\n0.Thoát";
        int choice = -1;
        do {
            System.out.println(menu);
            System.out.println("Nhập lữa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    showMenuOfCats();
                    break;
                case 2:
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Not Choice");
                    break;
            }
        } while (choice != 0);
    }

    public void showMenuOfCats() {
        String menu = "=======Menu quản lý mèo=========\n1.Thêm mèo\n2.Xóa mèo\n" +
                "3.Sửa mèo\n4.Tìm kiếm\n5.Hiển thị tất\n0.Thoát";
        int choice = -1;
        do {
            System.out.println(menu);
            System.out.println("Nhập lữa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    showMenuAddCat();
                    break;
                case 2:
                    showDeleteCat();
                    break;
                case 5:
                    showAll();
                    break;
                default:
                    System.out.println("Not Choice");
                    break;
            }
        } while (choice != 0);
    }

    public void showMenuAddCat() {
        System.out.println("------Bạn đang thêm mèo------");
        System.out.println("Nhập tên: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Nhập loại: ");
        String type = scanner.nextLine();
//        input.nextLine();
        System.out.println("Có bệnh hay không: ");
        boolean isSick = scanner.nextBoolean();
        Cat cat = new Cat(name, type, isSick);
        catManager.add(cat);
    }

    public void showAll() {
        Cat[] cats = catManager.showAll();
        int size = catManager.size;
        System.out.println("-----Danh sách mèo------");
        for (int i = 0; i < size; i++) {
            System.out.println(i + " - " + cats[i].toString());
        }
    }

    public void showDeleteCat() {
        Cat[] cats = catManager.showAll();
        System.out.println("Nhap id muon xoa: ");
        int id = scanner.nextInt();
        if (id < 0 || id > cats.length) {
            return;
        } else {
            catManager.delete(id);
        }
    }
}
