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


//import QLPhieuNhap.ChiTietPhieuNhap;
public class DS_Sach //implements InOut,ChucNang 
{
    private static Sach[] sach = new Sach[200];
    private static int soLuong = 0;
    static Scanner sc = new Scanner(System.in);

    public DS_Sach() {
    }

    public static Sach[] getDS_Sach() {
        return sach;
    }

    public static int getSoLuong() {
        return soLuong;
    }
//    @Override
    public static void readFromFile() {
		try {
			FileReader fr = new FileReader("DS_.txt");
			BufferedReader br = new BufferedReader(fr);
                        
			String line = "";
			while (true) {
                                line =br.readLine();
				if (line == null) {
					break;
				}
				line = br.readLine();
				String txt[] = line.split(",");
				String tenSP = txt[0];
				String NSX = txt[1];
				double giaBan = Double.parseDouble(txt[2]);
				double giaNhap = Double.parseDouble(txt[3]);
				String maSach = txt[5];
                                String tacGia = txt[6];
                                int namXB = Integer.parseInt(txt[7]);
                                String loaiSach = txt[8];
				Sach u = new Sach(tenSP,NSX,giaBan,giaNhap,maSach,tacGia,namXB,loaiSach);
				sach[soLuong] = u;
				soLuong++;
			}
			br.close();
			fr.close();

		} catch (IOException e) {
		}
                
	}
//     @Override
    public void ghiFile(){
        try {
            FileWriter fw= new FileWriter("");
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i=0; i<soLuong; i++){
                String line= sach[i].getTenSP()+","+sach[i].getNSX()+","+
                             sach[i].getGiaBan()+","+
                             sach[i].getGiaNhap()+","+
                             sach[i].getMaSach()+","+sach[i].getTacGia()+","+sach[i].getNamXB()+","+sach[i].getLoaiSach();
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Xuất file thành công!");
            bw.close();
            fw.close();
        } catch (IOException e) {
        }
        
    }
//    @Override
//        public void them(){
//        System.out.println("Thêm sách: ");
//        System.out.println("1.Thêm một loại sách");
//        System.out.println("2.Thêm nhiều loại sách");
//        System.out.println("3.Thoát");
//       
//       	int luaChon = sc.nextInt();
//        switch (luaChon) {
//   		case 1: {
//          SanPham sp=new SanPham();
//        System.out.println("-----------------------------------");
//        s.nhap();
//        ChiTietPhieuNhap chiTiet= new ChiTietPhieuNhap();
//        PhieuNhap pnhap=new PhieuNhap();
//        ChiTietPhieuNhap.setSlSach(s.getSoLuongSach());
//        ChiTietPhieuNhap.setSach(s);
//        pnhap.thietLapPhieu();
//        dssach[soLuong]=s;
//        soLuong++;
//        
//    
//   		}
//   		case 2: {
//        PhieuNhap pnhap=new PhieuNhap();
//        System.out.println("Nhap so luong sach can them vao: ");
//        int slCanThem= Integer.parseInt(sc.nextLine());
//        int count =0;
//        while(count<slCanThem){
//            Sach s= new Sach();
//            s.nhap();
//            
//            SP[soLuong]=s;
//            soLuong++;
//            ChiTietPhieuNhap chiTiet= new ChiTietPhieuNhap();
//            chiTiet.setSlSach(s.getSoLuongSach());
//            chiTiet.setSach(s);
//            
//            pnhap.setSl(pnhap.sl+1);
//            count++;
//            System.out.println("--------------------------");
//        }
            //O class chi tiet phieu nhap phai co ham thietLapPhieu
//        pnhap.thietLapPhieu();
//    }
//   		case 3:
//   			System.out.println("Lua chon khong dung yeu cau ! Vui long chon lai");
//        } 
//        }
    
//    @Override
//    public void sua(){
//        System.out.println("Nhap ma San Pham can chinh sua: ");
//        String maSPCanSua=sc.nextLine();
           //Nhap 4 ki tu
//        while (!IDsua.matches("\\d{4}")){
//            System.out.println("ID sach khong hop le. Vui long nhap vao 4 so.");
//            IDsua=sc.nextLine();
//        }
//       
//        int index=-1;
//        for (int i=0; i<soLuong; i++){
//            if (SP[i].getMaSP().equals(maSPCanSua)){
//                index=i;
//            }
//        }
//        if (index==-1){
//            System.out.println("khong ton tai ID sach nay");
//        }
//        else {
//            SanPham s=new  SanPham();
//            s.setMaSP(maSPCanSua);
//            s.setSoLuong(SP[index].getSoLuong());
                    //Chua co ham nhapKhongDoi
//            s.nhapKhongDoiID();  
//            SP[index]=s;
//        }
//    }
//         @Override
//    public void xoa(){
//        System.out.println("Nhap vao ma San Pham cần xóa: ");
//        String maSPCanXoa=sc.nextLine();
//        int index=-1;
//        for (int i=0; i<soLuong; i++){
//            if (SP[i].getMaSP().equals(maSPCanXoa)){
//                index=i;
//            }
//        }
//        if (index==-1)
//            System.out.println("Không tồn tại ma San Pham");
//        else {
//            for (int i=index; i<soLuong; i++)
//                SP[i]=SP[i+1];
//            System.out.println("Đã xóa sách co ma SP la: "+maSPCanXoa);
//            soLuong--;
//        }
//    }
//     @Override
//    public void timKiem(){
//        System.out.println("Tìm kiếm San Pham theo: ");
//        System.out.println("1.ma san pham");
//        System.out.println("2.Tem San Pham");
//        System.out.println("3.Khoang Gia Ban");
//        System.out.println("0.Thoát");
//        int luaChon=-1;
//        while (luaChon!=0){
//            System.out.println("Vui lòng nhập vào lựa chọn: ");
//            luaChon= Integer.parseInt(sc.nextLine());
//            switch(luaChon){
//                case 1:
//                    while(true){
//                        System.out.println("Nhap vao ma San Pham: ");
//                        String ID=sc.nextLine();
//                        SanPham SP[]=this.getDS_SanPham();
//                        boolean check=false;
//                        for (int i=0; i<soLuong; i++){
//                            if (SP[i].getMaSP().equals(ID)){
//                                check=true;
//                                break;
//                            }
//
//
//                        }
//                        if (check==true){
//                            for (int i=0; i<soLuong; i++){
//                                if (SP[i].getMaSP().equals(ID))
//                                    SP[i].output();
//                            }
//                            break;
//                        }
//                        else
//                            System.out.println("Ma San Pham không tồn tại.Vui lòng nhập lại.");
//                        }
//                    
//                    break;
//                    
//                case 2:
//                    while (true){
//                        System.out.println("Nhập vào tên sách: ");
//                        String tenSach=sc.nextLine();
////                        Sach dssach[]=this.getDSSach();
//                        boolean check=false;
//                        for (int i=0; i<soLuong; i++){
//                            if (SP[i].getTenSP().equalsIgnoreCase(tenSach)){
//                                check=true;
//                                break;
//                            }
//                        }   
//                        if (check==true){
//                            for (int i=0; i<soLuong; i++){
//                                if (SP[i].getTenSP().equalsIgnoreCase(tenSach))
//                                    SP[i].xuat();
//                            }
//                            break;
//                        }
//                        else{
//                            System.out.println("Tên San Pham không tồn tại. Vui lòng nhập lại. ");  
//                        }
//                        
//                    }
//                    break;
//                case 3:
//                    
//                    
//                case 0:
//                    break;
//                default:
//                    System.out.println("Lựa chọn không đúng. Vui lòng chọn lại");
//                
//                
//            }
//        }
//    }
//    @Override
//    public void sapXep(){
//        System.out.println("Sắp xếp theo: ");
//        System.out.println("1.ID sách");
//        System.out.println("2.Tên sách");
//        System.out.println("3.Giá tiền");
//        System.out.println("0.Thoát");
//        System.out.println("Vui lòng nhập vào lựa chọn: ");
//        int luaChon=Integer.parseInt(sc.nextLine());
//        while (luaChon!=0){
//            SanPham [] SP=this.getDS_SanPham();
//            switch(luaChon){
//                case 1:
//                    
//                    for (int i=0; i<soLuong-1; i++){
//                        for (int j=i+1; j<soLuong; j++){
//                            if (SP[i].getMaSP().compareTo(SP[j].getMaSP())>0){
//                                Sach temp=SP[i];
//                                SP[i]=SP[j];
//                                SP[j]=temp;
//                            }
//                        }
//                    }
//                    System.out.println("Danh sách sau khi sắp xếp: ");
//                    for (int i=0; i<soLuong; i++)
//                        SP[i].xuat();
//                    break;
//                case 2:
//                    for (int i=0; i<soLuong-1; i++){
//                        for (int j=i+1; j<soLuong; j++){
//                            if (SP[i].getTenSP().compareTo(SP[j].getTenSP())>0){
//                                SanPham temp=SP[i];
//                                SP[i]=SP[j];
//                                SP[j]=temp;
//                            }
//                        }
//                    }
//                    System.out.println("Danh sách sau khi sắp xếp: ");
//                    for (int i=0; i<soLuong; i++)
//                        SP[i].input();
//                    break;
//                case 3:
//                    for (int i=0; i<soLuong-1; i++){
//                        for (int j=i+1; j<soLuong; j++){
//                            if (SP[i].getGiaBan()>SP[j].getGiaBan()){
//                                SanPham temp=SP[i];
//                                SP[i]=SP[j];
//                                SP[j]=temp;
//                            }
//                        }
//                    }
//                    System.out.println("Danh sách sau khi sắp xếp: ");
//                    for (int i=0; i<soLuong; i++)
//                        SP[i].input();
//                    break;
//                default:
//                    System.out.println("Lựa chọn không đúng. Vui lòng chọn lại.");
//                    System.out.println("Vui lòng nhập lựa chọn: ");
//            }
//        }
//    }    
//    public void xuatDanhSach(){
//        System.out.println(
//                "-------------------------------------------------------------------------------------------------------------------------------------------");
//        System.out.format("|%-7s|%-30s|%-8s|%-8s|%-8s",
//                "Ma San Pham","Ten Sach","So Luong","Gia Nhap","Gia Ban");
//        for (int i=0; i<soLuong; i++){
//            SP[i].output();
//        }
//        System.out.println(
//                "-------------------------------------------------------------------------------------------------------------------------------------------");
//    }
    public static void main(String[] args) {
        DS_Sach DS_Sach= new DS_Sach();
        DS_Sach.readFromFile();
//         DSSP.them();
//         DSSP.sua();
//         DSSP.xoa();
//         DSSP.xuatDanhSach();
//          DSSP.timKiem();
//           DSSP.sapXep();
         DS_Sach.ghiFile();
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

    


