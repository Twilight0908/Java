package Inheritance.personManager.menu;

import Inheritance.personManager.management.WorkerManager;
import Inheritance.personManager.model.Worker;

import java.util.Scanner;

public class MainMenu {
    private WorkerManager workerManager;
    private Scanner scanner=new Scanner(System.in);
    public MainMenu(){
        workerManager=new WorkerManager();
    }

    public void showMainMenu(){
        String menu="-----Menu Chính-----\n" +
                "1.Quản Lý Công Nhân\n" +
                "2.Quản Lý Kỹ Sư\n" +
                "3.Quản Lý Nhân Viên\n" +
                "0.Thoát\n";
        int choice;
        do {
            System.out.println(menu);
            System.out.println("---------");
            System.out.print("Nhập Lựa Chọn: ");
            choice= scanner.nextInt();

            switch (choice){
                case 1:
                    showMenuOfWorker();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Không Có Lựa Chọn "+choice);
                    break;
            }
        }while (choice!=0);
    }

    public void showMenuOfWorker(){
        String menu="-----Quản Lý Công Nhân-----\n" +
                "1.Thêm\n" +
                "2.Sửa\n" +
                "3.Xóa\n" +
                "4.Tìm Kiếm\n" +
                "5.Hiển Thị Tất Cả\n" +
                "0.Thoát";
        int choice;
        do {
            System.out.println(menu);
            System.out.println("----------");
            System.out.print("Nhập Lựa Chọn: ");
            choice= scanner.nextInt();

            switch (choice){
                case 1:
                    addWorker();
                    break;
                case 2:
                    editWorker();
                    break;
                case 3:
                    deleteWorker();
                    break;
                case 4:
                    findWorker();
                    break;
                case 5:
                    showAllWorker();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Không Có Lựa Chọn "+choice);
            }
        }while (choice!=0);
    }

    public void addWorker(){
        System.out.println("-----Thêm Công Nhân-----");
        System.out.print("Nhập Tên: ");
        scanner.nextLine();
        String name=scanner.nextLine();
        System.out.print("Nhập Tuổi: ");
        int age=scanner.nextInt();
        System.out.print("Nhập Giới Tính(0:Nữ|1:Nam|2:Khác): ");
        int sex= scanner.nextInt();
        System.out.print("Nhập Địa Chỉ: ");
        scanner.nextLine();
        String address=scanner.nextLine();
        System.out.print("Nhập Bậc: ");
        int levels= scanner.nextInt();

        Worker worker=new Worker(name,age,sex,address,levels);
        workerManager.add(worker);
    }

    public void editWorker(){
        System.out.println("-----Sửa Công Nhân-----");
        System.out.print("Nhập ID Công Nhân Muốn Sửa: ");
        int id=scanner.nextInt();

        if(id>0||id<workerManager.size){
            System.out.print("Nhập Tên: ");
            scanner.nextLine();
            String name=scanner.nextLine();
            System.out.print("Nhập Tuổi: ");
            int age=scanner.nextInt();
            System.out.print("Nhập Giới Tính(0:Nữ|1:Nam|2:Khác): ");
            int sex= scanner.nextInt();
            System.out.print("Nhập Địa Chỉ: ");
            scanner.nextLine();
            String address=scanner.nextLine();
            System.out.print("Nhập Bậc: ");
            int levels= scanner.nextInt();

            Worker worker=new Worker(name,age,sex,address,levels);
            workerManager.edit(id,worker);
        }
    }

    public void deleteWorker(){
        System.out.println("-----Xóa Công Nhân-----");
        System.out.print("Nhập ID Công Nhân Muốn Xóa: ");
        int id= scanner.nextInt();

        if (id>0||id<workerManager.size){
            workerManager.delete(id);
        }
    }

    public void findWorker(){
        System.out.println("-----Tìm Công Nhân-----");
        System.out.print("Nhập ID Công Nhân Muốn Tìm: ");
        int id= scanner.nextInt();

        if(id>0||id<workerManager.size){
            System.out.println(workerManager.findById(id));
        }

    }

    public void showAllWorker(){
        Worker[] workers=workerManager.showAll();
        int size=workerManager.size;
        System.out.println("-----Danh Sách Công Nhân-----");

        for (int i=0;i<size;i++){
            System.out.println(i+" : "+workers[i].toString());
        }
    }
}
