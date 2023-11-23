package SPham;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
import SPham.SanPham;
import SPham.Sach;
import SPham.Truyen;
import SPham.giaokhoa;
import SPham.TacGia;

//import QLPhieuNhap.ChiTietPhieuNhap;
public class DS_Sach {
    private static Sach[] dssach = new Sach[200];
    private static int soLuong = 0;
    static Scanner sc = new Scanner(System.in);

    public DS_Sach() {
    }

    public static Sach[] getDS_Sach() {
        return dssach;
    }

    public static int getSoLuong() {
        return soLuong;
    }

    public static void readFromFile() {
        try {
            FileReader fr = new FileReader("DS_.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            while ((line = br.readLine()) != null) {
                String txt[] = line.split(",");
                SanPham sp = new SanPham(txt[0], txt[1], Double.parseDouble(txt[2]), Double.parseDouble(txt[3]));
                TacGia tacGia = new TacGia(txt[5]);
                Sach sach = new Sach(sp, txt[4], tacGia , Integer.parseInt(txt[6]),txt[7]);

                if (txt[7].equals("truyen")) {
                    Truyen truyen = new Truyen(sach, txt[8], txt[9]);
                    dssach[soLuong] = truyen;
                } else if(txt[7].equals("giao khoa")){
                    giaokhoa gk = new giaokhoa(sach, Integer.parseInt(txt[8]), txt[9]);
                    dssach[soLuong] = gk;  
                }
                soLuong++;
            }
            br.close();
            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//     @Override
public static void writeToFile() {
    try {
        FileWriter fw = new FileWriter("DS_.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 0; i < soLuong; i++) {
            Sach sach = dssach[i];
            TacGia tacGia = sach.getTacGia();

            String line = sach.getTenSP() + "," + sach.getNSX() + "," + sach.getGiaBan() + "," + sach.getGiaNhap() + "," + sach.getMaSach() + "," + tacGia.toString() + "," + sach.getNamXB();

            if (sach instanceof Truyen) {
                Truyen truyen = (Truyen) sach;
                line += ",truyen," + truyen.getNgonNgu() + "," + truyen.getLoaiTruyen();
            } else if(sach instanceof giaokhoa){
                giaokhoa gk = (giaokhoa) sach;
                line += ",giao khoa," + gk.getLop() + "," + gk.getMon();
            }

            bw.write(line);
            bw.newLine();
        }

        bw.close();
        fw.close();

    } catch (IOException e) {
        e.printStackTrace();
    }
}


//     @Override
//    public void Them() {
//        if (soLuong == dssach.length) {
//            dssach = java.util.Arrays.copyOf(dssach, dssach.length * 2);
//        }
//
//        System.out.println("Chon chuc vu nhan vien:");
//        System.out.println("1. Truyen");
//        System.out.println("2. Giao khoa");
//        int choice = sc.nextInt();
//
//        Sach sach1=null;
//        
//        switch (choice) {
//            case 1:
//                sach1 = new Truyen();
//                break;
//            case 2:
//                sach1 = new giaokhoa();
//                break;
//            default:
//                System.out.println("Lua chon khong hop le.");
//                return; 
//        }
//
//        if (sach1 != null) {
//            sach1.input();
//            dssach[soLuong] = sach1;
//            soLuong++;
//            System.out.println("Them nhan vien thanh cong.");
//        }
//    }
    
// @Override
//    public void Sua() {
//        System.out.println("Nhap ma Sach can sua: ");
//        String maSach = sc.nextLine();
//        for (Sach sach2 : dssach) {
//            if (sach2 != null &&sach2.getMaSach().equals(maSach)) {
//                sach2.input();
//                System.out.println("Sua Sach thanh cong.");
//                return;
//            }
//        }
//
//        System.out.println("Khong tim thay Sach co ma " + maSach);
//    }

//         @Override
//    public void xoa(){
//        System.out.println("Nhap vao ma Sach cần xóa: ");
//        String maSachCanXoa=sc.nextLine();
//        int index=-1;
//        for (int i=0; i<soLuong; i++){
//            if (sach[i].getMaSach().equals(maSachCanXoa)){
//                index=i;
//            }
//        }
//        if (index==-1)
//            System.out.println("Không tồn tại ma San Pham");
//        else {
//            for (int i=index; i<soLuong; i++)
//                sach[i]=sach[i+1];
//            System.out.println("Đã xóa sách co ma Sach la: "+maSachCanXoa);
//            soLuong--;
//        }
//    }
//     @Override
//    public void timKiem(){
//        System.out.println("Tìm kiếm San Pham theo: ");
//        System.out.println("1.ma san pham");
//        System.out.println("2.Ten San Pham");
//        System.out.println("3.Khoang Gia Ban");
//         System.out.println("4.Loai Sach");
//        System.out.println("0.Thoát");
//        int luaChon=-1;
//        while (luaChon>=0){
//            System.out.println("Vui lòng nhập vào lựa chọn: ");
//            luaChon= Integer.parseInt(sc.nextLine());
//            switch(luaChon){
//                case 1:
//                    while(true){
//                        System.out.println("Nhap vao ma Sach: ");
//                        String ID=sc.nextLine();
//                        Sach sach[]=this.getDS_Sach();
//                        boolean check=false;
//                        for (int i=0; i<soLuong; i++){
//                            if (sach[i].getMaSach().equals(ID)){
//                                check=true;
//                                break;
//                            }
//
//
//                        }
//                        if (check==true){
//                            for (int i=0; i<soLuong; i++){
//                                if (sach[i].getMaSach().equals(ID))
//                                    sach[i].output();
//                                    System.out.println("--------------------");
//                            }
//                            break;
//                        }
//                        else
//                            System.out.println("Ma Sach không tồn tại.Vui lòng nhập lại.");
//                        }
//                    
//                    break;
//                    
//                case 2:
//                   while (true) {
//					System.out.println("Nhap ten Sach: ");
//					String tenSach = sc.nextLine().toUpperCase();
//					Sach S1[] = DS_Sach.getDS_Sach();
//					boolean check = false;
//					for (int i = 0; i < DS_Sach.getSoLuong();i++) {
//						if (S1[i].getTenSP().toUpperCase().compareTo(tenSach) == 0) {
//							check = true;
//							break;
//						}
//					}
//					if (check == true) {
//						for (int i = 0; i < soLuong; i++) {
//							if (S1[i].getTenSP().toUpperCase().equals(tenSach) == true) {
//                                                            S1[i].output();
//                                                            System.out.println("--------------------");
//								
//						}
//						break;
//					} else {
//						System.out.println("Ten Sach khong ton tai!! Vui long nhap lai");
//					}
//				}
//				break;
//                case 3:
//                                      while (true) {
//					System.out.println("Nhap gia tien thap nhat: ");
//					double giaThapNhat=sc.nextdouble();
//                                      System.out.println("Nhap gia tien cao nhat: ");
//					double giaCaoNhat=sc.nextdouble();
//					Sach S2[] = DS_Sach.getDS_Sach();
//					boolean check = false;
//					for (int i = 0; i < DS_Sach.getSoLuong();i++) {
//						if (S2[i].getGiaBan()>giaThapNhat && S2[i].getGiaBan()<giaCaoNhap ){
//							check = true;
//							break;
//						}
//					}
//					if (check == true) {
//						for (int i = 0; i < soLuong; i++) {
//							if (S2[i].getGiaBan()>giaThapNhat && S2[i].getGiaBan()<giaCaoNhap) {
//                                                            S1[i].output();
//                                                            System.out.println("--------------------");
//								
//						}
//						break;
//					} else {
//						System.out.println("Ten Sach khong ton tai!! Vui long nhap lai");
//					}
//				}
//				break;
//                    
//                case 4:
//        System.out.println("Chon loai sach can tim:");
//        System.out.println("1. Truyen");
//        System.out.println("2. Giao khoa");
//        int choice = sc.nextInt();
//
//        Sach S3[]=this.getDS_Sach();
//        
//        switch (choice) {
//            case 1:{
//                      for (int i=0; i< DS_Sach.getSoLuong(); i++){
//                            if (S3[i].getLoaiSach().equals("Truyen")){
//                                check=true;
//                                break;
//                            }
//                        }
//                     for (int i=0; i< DS_Sach.getSoLuong(); i++){
//                                if (S3[i].getLoaiSach().equals("Truyen")){
//                                          S1[i].output();
//                                          System.out.println("--------------------");     
//                                  }
//                     break;
//                      }   
//            case 2:
//                      for (int i=0; i< DS_Sach.getSoLuong(); i++){
//                            if (S3[i].getLoaiSach().equals("Giao Khoa")){
//                                check=true;
//                                break;
//                            }
//                        }
//                     for (int i=0; i< DS_Sach.getSoLuong(); i++){
//                                if (S3[i].getLoaiSach().equals("Giao Khoa")){
//                                          S1[i].output();
//                                          System.out.println("--------------------");     
//                                  }
//                     break;
//                      }       

//                
//            default:
//                System.out.println("Lua chon khong hop le.");
//                return;
//        }
//
//@Override
//            public void hienThiDanhSach() {
//            for (Sach S4 : dssach) {
//            if (S4 != null) { 
//                S4.output();
//                System.out.println("--------------------");
//            }
//        }
//    }

    public static void main(String[] args) {
//        DS_Sach.readFromFile();
//         DSSP.them();
//         DSSP.sua();
//         DSSP.xoa();
//         DSSP.xuatDanhSach();
//          DSSP.timKiem();
//           DSSP.sapXep();
//         DS_Sach.ghiFile();
    }
    
    
//    public static void Menu(){
//        DSSach dSSach= new DSSach();
//        while (true){  
//            System.out.println("1.Xem thông tin sách trong kho");
//            System.out.println("2.Thêm sách vào kho");
//            System.out.println("3.Sửa thông tin sách trong kho");
//            System.out.println("4.Xóa sách  trong kho");
//            System.out.println("5.Tìm kiếm sách trong kho");
//            System.out.println("6.Sắp xếp sách trong kho");
//            System.out.println("7.Xuất ra file text");
//            System.out.println("0.Thoát");
//            System.out.println("Vui lòng nhập lựa chọn: ");
//            int luaChon=Integer.parseInt(sc.nextLine());
//            switch(luaChon){
//                case 1:
//                    dSSach.xuatDanhSach();
//                    break;
//                case 2:
//                    dSSach.them();
//                
//            }
//        }
//    }
    
//}

    
    
    
    
        }

    


