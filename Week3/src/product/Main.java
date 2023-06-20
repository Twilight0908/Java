package product;

import java.util.Scanner;

public class Main {
    private static ProductManager productManager = new ProductManager();
    private static Scanner inpString = new Scanner(System.in);
    private static Scanner inpNumber = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        int choice;
        do {
            System.out.println("===== Main Menu =====");
            System.out.println("1.Them San Pham");
            System.out.println("2.Sua San Pham");
            System.out.println("3.Xoa San Pham");
            System.out.println("4.Hien Thi San Pham");
            System.out.println("5.Tim Kiem San Pham");
            System.out.println("6.Sap Xep San Pham");
            System.out.println("0.Thoat");

            System.out.println("-------------");
            System.out.print("Nhap Lua Chon: ");
            choice = inpNumber.nextInt();
            System.out.println("-------------");

            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    show();
                    break;
                case 5:
                    find();
                    break;
                case 6:
                    sort();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Khong Co Lua Chon");
                    System.out.println("-------------");
                    break;
            }
        } while (choice != 0);
    }

    public static void add() {
        System.out.println("+++++ Them San Pham +++++");
        System.out.print("Nhap Ma San Pham: ");
        int proId = inpNumber.nextInt();

        System.out.print("Nhap Ten San Pham: ");
        String proName = inpString.nextLine();

        System.out.print("Nham So Luong San Pham: ");
        int quantity = inpNumber.nextInt();

        System.out.println("------------");
        Product product = new Product(proId, proName, quantity);
        productManager.add(product);
    }

    public static void edit() {
        System.out.println("***** Sua San Pham *****");
        System.out.print("Nham Id San Pham: ");
        int proId = inpNumber.nextInt();
        if (productManager.findIndexById(proId) != -1) {
            System.out.print("Nhap Ten San Pham: ");
            String proName = inpString.nextLine();

            System.out.print("Nham So Luong San Pham: ");
            int quantity = inpNumber.nextInt();

            System.out.println("------------");
            Product product = new Product(proId, proName, quantity);
            productManager.edit(proId, product);
        } else {
            System.out.println("Khong co id san pham");
        }
    }

    public static void delete() {
        System.out.println("----- Xoa San Pham -----");
        System.out.print("Nham Id San Pham: ");
        int proId = inpNumber.nextInt();
        productManager.delete(proId);
    }

    public static void show() {
        System.out.println("##### Hien Thi San Pham #####");
        for (Product product : productManager.findAll()) {
            System.out.println(product.toString());
        }
        System.out.println("--------");
    }

    public static void find() {
        System.out.println("%%%%% Tim Kiem San Pham %%%%%");
        System.out.print("Nham Id San Pham: ");
        int proId = inpNumber.nextInt();
        int index = productManager.findIndexById(proId);
        if (index != -1) {
            System.out.println(productManager.findAll().get(index).toString());
        } else {
            System.out.println("Khong Co San Pham");
        }
    }

    public static void sort() {
        int choice;
        do {
            System.out.println("$$$$$ Sap Xep $$$$$");
            System.out.println("1.Tang Dan");
            System.out.println("2.Giam Dan");
            System.out.println("0.Thoat");

            System.out.print("Nhap lua chon: ");
            choice = inpNumber.nextInt();

            switch (choice) {
                case 1:
                    productManager.sortASC();
                    break;
                case 2:
                    productManager.sortDEC();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Khong Co Lua Chon");
                    break;
            }
        } while (choice != 0);
    }
}
