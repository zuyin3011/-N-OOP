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
    private DS_SACH dsSach;
//    private DSDungCuHocTap dsDCHT;
    private Scanner scanner;
    Scanner sc=new Scanner(System.in);
            
            
    

   public menuSP() {
        dsSach = new DS_SACH() ;}
  
    private void hienThiMenu() {
        System.out.println("------ MENU ------");
        System.out.println("1. Them San Pham");
        System.out.println("2. Xoa San Pham");
        System.out.println("3. Sua thong tin San Pham");
        System.out.println("4. Hien thi danh sach San Pham");
        System.out.println("5. Tim kiem San Pham");
      
        System.out.println("6. Ghi vao file");
        System.out.println("7.Đoc file San Pham");
        System.out.println("0. Thoat");
    }
        public void run() {
//        DSDungCuHocTap.writeToFile("SanPham.txt");
         dsSach = new DS_SACH();
        int luaChon;
        do {
            hienThiMenu();
            System.out.print("Nhap lua chon cua ban: ");
            luaChon = sc.nextInt();
            sc.nextLine(); 

            switch (luaChon) {
                case 1: {
//                    System.out.println("San Pham Ban muon Xoa");
//                    System.out.println("1.Them Dung cu hoc Tap");
//                    System.out.println("2.Them Sach");
//                    int choice = sc.nextInt();
//                    if(choice == 1){
//                     dsDCHT.Them();
//                    break;
//                    }
//                    if(choice==2){
                    dsSach.Them();
//                    break;
//                    }
//                    else{
//                    System.out.println("Khong hop le.");
//                    }
                    break;}
                case 2:{
//                    System.out.println("San Pham Ban muon Xoa");
//                    System.out.println("1.Xoa Dung cu hoc Tap");
//                    System.out.println("2.Xoa Sach");
//                    int choice = sc.nextInt();
//                    if(choice == 1){
                    dsSach.Xoa();
//                    break;
//                    }
//                    if(choice==2){
//                    dsDCHT.Xoa();
//                    break;
//                    }
//                    else{
//                    System.out.println("Khong hop le.");
//                    }
                     
                    break;}
                case 3:{
//                    System.out.println("San Pham Ban muon Sua");
//                    System.out.println("1Sua Dung cu hoc Tap");
//                    System.out.println("2.Sua Sach");
//                    int choice = sc.nextInt();
//                    if(choice == 1){
                    dsSach.Sua();
//                    break;
//                    }
//                    if(choice==2){
//                    dsDCHT.Sua();
//                    break;
//                    }
//                    else{
//                    System.out.println("Khong hop le.");
//                    }
                     
                    break;}
                case 4:
                    {
//                    System.out.println("San Pham Ban muon hien thi");
//                    System.out.println("1. Dung cu hoc Tap");
//                    System.out.println("2. Sach");
//                    int choice = sc.nextInt();
//                    if(choice == 1){
//                     System.out.println("Danh sach nhan vien:");
                    dsSach.hienThiDanhSach();
//                        dsSach.printFileContents("SanPham.txt");
                        
//                    break;
//                    }
//                    if(choice==2){
//                    System.out.println("Danh sach nhan vien:");
//                    dsDCHT.hienThiDanhSach();
//                    break;
//                    }
//                    else{
//                    System.out.println("Khong hop le.");
//                    }
                
                    break;}
                case 5:{
//                   System.out.println("San Pham Ban muon Tim Kiem");
//                    System.out.println("1.Dung cu hoc Tap");
//                    System.out.println("2. Sach");
//                    int choice = sc.nextInt();
//                    if(choice == 1){
                    dsSach.timKiem();
//                    break;
////                    }
//                    if(choice==2){
//                    dsDCHT.Timkiem();
//                    break;
//                    }
//                    else{
//                    System.out.println("Khong hop le.");
//                    }
                    break;}
                case 6:{
//                    System.out.println("San Pham Ban muon Tim Kiem");
//                    System.out.println("1.Dung cu hoc Tap");
//                    System.out.println("2. Sach");
//                    int choice = sc.nextInt();
//                    if(choice == 1){
                    dsSach.writeToFile("SanPham.txt");
//                    break;
//                    }
//                    if(choice==2){
//                    dsDCHT.writeToFile("SanPham.txt");
//                    break;
//                    }
//                    else{
//                    System.out.println("Khong hop le.");
//                    }
                    break;}
                case 7:{
                dsSach.readFromFile("SanPham.txt");
                break;
                
                }
                case 0:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long nhap lai.");
            }
        } while (luaChon != 0);
    }
}

