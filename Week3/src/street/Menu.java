package street;

import java.util.Scanner;

public class Menu {
    private Street street = new Street(1, "Thanh Xuan");
    private Scanner iptNumber = new Scanner(System.in);
    private Scanner iptString = new Scanner(System.in);

    public void showMainMenu() {
        int choice = -1;
        do {
            System.out.println("===== Khu phố ======\n" +
                    "1. Thêm nhà\n" +
                    "2. Sửa nhà theo Id\n" +
                    "3. Xóa nhà\n" +
                    "4. Danh sách các Nhà\n" +
                    "0. Thoát");
            System.out.println("----------");
            System.out.print("\nNhap Lua Chon: ");
            choice = iptNumber.nextInt();
            System.out.println("\n----------");

            switch (choice) {
                case 1:
                    showMenuAddFamily();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    showMenuFamily();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Khong Co Lua Chon !!!");
                    System.out.println("----------");
                    break;
            }
        } while (choice != 0);
    }

    public void showMenuAddFamily() {
        System.out.println("==== Menu Thêm Mới Nhà =====");
        System.out.print("Nhap Id Nha: ");
        int idFamily = iptNumber.nextInt();

        System.out.print("Nhap Ten Nha: ");
        String nameFamily = iptString.nextLine();

        Family family = new Family(idFamily, nameFamily);
        street.add(family);
        System.out.println("----------");
    }

    public void showMenuFamily() {
        int choice = -1;

        String str = "===== Menu Các Hộ Gia Dình =====\n";
        for (int i = 0; i < street.getAll().size(); i++) {
            str += (i + 1) + ". Hộ gia đình " + street.getAll().get(i).getIdFamily() + " " +
                    street.getAll().get(i).getNameFamily() + "\n";
        }
        str += "0. Thoat";
        System.out.println(str);
        System.out.print("Nhập lựa chọn: ");
        choice = iptNumber.nextInt();
        System.out.println("----------");

        if (choice != 0) {
            showMenuPerson(street.getAll().get(choice - 1));
        }
    }

    public void showMenuPerson(Family family) {
        int choice = -1;

        do {
            String str = "===== Menu của nhà số " +
                    family.getIdFamily() + " " + family.getNameFamily() + " =====\n" +
                    "1. Thêm người\n" +
                    "2. Xóa người \n" +
                    "3. Hiển thị cả gia đình\n" +
                    "0. Thoát";
            System.out.println(str);
            System.out.print("Nhập lựa chọn: ");
            choice = iptNumber.nextInt();
            System.out.println("----------");

            switch (choice) {
                case 1:
                    showMenuAddPerson(family);
                    break;
                case 2:
                    break;
                case 3:
                    showAllPerson(family);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Khong Co Lua Chon !!!");
                    System.out.println("----------");
                    break;
            }
        } while (choice != 0);
    }

    public void showMenuAddPerson(Family family) {
        System.out.println("==== Thêm người vào nhà " +
                family.getIdFamily() + " " + family.getNameFamily() + " =====");

        System.out.print(" Nhập Id: ");
        int idPerson = iptNumber.nextInt();

        System.out.print("Nhập Tên: ");
        String namePerson = iptString.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = iptNumber.nextInt();

        System.out.print("Nhập job: ");
        String job = iptString.nextLine();

        Person person = new Person(idPerson, namePerson, age, job);
        family.add(person);
        System.out.println("----------");
    }

    public void showAllPerson(Family family) {
        for (int i = 0; i < family.getAll().size(); i++) {
            System.out.println(family.getAll().get(i));
        }
        System.out.println("----------");
    }
}
