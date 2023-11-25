/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SPham;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class menuSP {
    private DS_Sach dsSach;
    private Scanner scanner;

   public menuSP() {
        dsSach = new DS_Sach() {
            @Override
            public void readFromFile(String tenFlie) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void writeToFile() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        scanner = new Scanner(System.in);
    }
    public void run() {
        DS_Sach.writeToFile("SanPham.txt");

        int luaChon;
        do {
            hienThiMenu();
            System.out.print("Nhap lua chon cua ban: ");
            luaChon = scanner.nextInt();
            scanner.nextLine(); 

            switch (luaChon) {
                case 1:
                    dsSach.Them();
                    break;
                case 2:
                    dsSach.Xoa();
                    break;
                case 3:
                    dsSach.Sua();
                    break;
                case 4:
                    System.out.println("Danh sach nhan vien:");
                    dsSach.hienThiDanhSach();
                    break;
                case 5:
                    dsSach.timKiem();
                    break;
                case 6:
                    dsSach.writeToFile("SanPham.txt");
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long nhap lai.");
            }
        } while (luaChon != 0);
    }

    private void hienThiMenu() {
        System.out.println("------ MENU ------");
        System.out.println("1. Them Sach");
        System.out.println("2. Xoa Sach");
        System.out.println("3. Sua thong tin Sach");
        System.out.println("4. Hien thi danh sach Sach");
        System.out.println("5. Tim kiem Sach");
        System.out.println("6. Ghi vao file");
        System.out.println("0. Thoat");
    }
}
