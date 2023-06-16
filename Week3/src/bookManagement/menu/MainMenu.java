package bookManagement.menu;

import bookManagement.management.BookManage;
import bookManagement.model.Book;

import java.util.Scanner;

public class MainMenu {
    private BookManage bookManage = new BookManage();
    private Scanner inputString = new Scanner(System.in);
    private Scanner inputNumber = new Scanner(System.in);

    public void showMainMenu() {
        int choice;
        do {
            System.out.println("=+-* Main Menu =+-*");
            System.out.println("1.Them Tai Lieu");
            System.out.println("2.Sua Tai Lieu");
            System.out.println("3.Xoa Tai Lieu");
            System.out.println("4.Tim Kiem Tai Lieu");
            System.out.println("5.Hien Thi Tai Lieu");
            System.out.println("0.Thoat");

            System.out.println("---------");
            System.out.print("Nhap Lua Chon: ");
            choice = inputNumber.nextInt();
            System.out.println("---------");

            switch (choice) {
                case 1:
                    showAdd();
                    break;
                case 2:
                    showEdit();
                    break;
                case 3:
                    showDelete();
                    break;
                case 4:
                    showFind();
                    break;
                case 5:
                    showShow();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Khong Co Lua Chon");
                    System.out.println("---------");
                    break;
            }
        } while (choice != 0);
    }

    public void showAdd() {
        int choice;
        do {
            System.out.println("===== Them Tai Lieu =====");
            System.out.println("1.Them Sach");
            System.out.println("2.Them Tap Chi");
            System.out.println("3.Them Bao");
            System.out.println("0.Thoat");

            System.out.println("---------");
            System.out.print("Nhap Lua Chon: ");
            choice = inputNumber.nextInt();
            System.out.println("---------");

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Khong Co Lua Chon");
                    System.out.println("---------");
                    break;
            }
        } while (choice != 0);
    }

    public void showEdit() {
        int choice;
        do {
            System.out.println("===== Sua Tai Lieu =====");
            System.out.println("1.Sua Sach");
            System.out.println("2.Sua Tap Chi");
            System.out.println("3.Sua Bao");
            System.out.println("0.Thoat");

            System.out.println("---------");
            System.out.print("Nhap Lua Chon: ");
            choice = inputNumber.nextInt();
            System.out.println("---------");

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Khong Co Lua Chon");
                    System.out.println("---------");
                    break;
            }
        } while (choice != 0);
    }

    public void showDelete() {
        int choice;
        do {
            System.out.println("===== Xoa Tai Lieu =====");
            System.out.println("1.Xoa Sach");
            System.out.println("2.Xoa Tap Chi");
            System.out.println("3.Xoa Bao");
            System.out.println("0.Thoat");

            System.out.println("---------");
            System.out.print("Nhap Lua Chon: ");
            choice = inputNumber.nextInt();
            System.out.println("---------");

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Khong Co Lua Chon");
                    System.out.println("---------");
                    break;
            }
        } while (choice != 0);
    }

    public void showFind() {
        int choice;
        do {
            System.out.println("===== Tim Kiem Tai Lieu =====");
            System.out.println("1.Tim Kiem Sach");
            System.out.println("2.Tim Kiem Tap Chi");
            System.out.println("3.Tim Kiem Bao");
            System.out.println("0.Thoat");

            System.out.println("---------");
            System.out.print("Nhap Lua Chon: ");
            choice = inputNumber.nextInt();
            System.out.println("---------");

            switch (choice) {
                case 1:
                    findBook();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Khong Co Lua Chon");
                    System.out.println("---------");
                    break;
            }
        } while (choice != 0);
    }

    public void showShow() {
        int choice;
        do {
            System.out.println("===== Hien Thi Tai Lieu =====");
            System.out.println("1.Hien Thi Sach");
            System.out.println("2.Hien Thi Tap Chi");
            System.out.println("3.Hien Thi Bao");
            System.out.println("4.Hien Thi Tat Ca");
            System.out.println("0.Thoat");

            System.out.println("---------");
            System.out.print("Nhap Lua Chon: ");
            choice = inputNumber.nextInt();
            System.out.println("---------");

            switch (choice) {
                case 1:
                    showBook();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Khong Co Lua Chon");
                    System.out.println("---------");
                    break;
            }
        } while (choice != 0);
    }

    public void addBook() {
        System.out.println("+++++ Them Sach +++++");
        System.out.print("Nhap Ma Sach: ");
        int bookId = inputNumber.nextInt();

        System.out.print("Nhap Ten Nha Xuat Ban: ");
        String publisherName = inputString.nextLine();

        System.out.print("Nhap So Ban Phat Hanh: ");
        int releaseNumber = inputNumber.nextInt();

        System.out.print("Nhap Ten Tac Gia: ");
        String authorName = inputString.nextLine();

        System.out.print("Nhap So Trang: ");
        int pageNumber = inputNumber.nextInt();

        System.out.println("---------");

        Book book = new Book(bookId, publisherName, releaseNumber, authorName, pageNumber);
        bookManage.add(book);
    }

    public void findBook() {
        System.out.println("+++++ Tim Kiem Sach +++++");
        System.out.print("Nhap Id Sach: ");
        int id=inputNumber.nextInt();
        System.out.println("---------");

        if (bookManage.findIndexById(id)!=-1){
            int index= bookManage.findIndexById(id);
            System.out.println(bookManage.findAll().get(index).toString());
            System.out.println("---------");
        }else {
            System.out.println("Khong Co Id Sach");
            System.out.println("---------");
        }
    }

    public void showBook() {
        System.out.println("+++++ Hien Thi Sach +++++");
        for (Book book : bookManage.findAll()) {
            System.out.println(book.toString());
        }
        System.out.println("---------");
    }
}
