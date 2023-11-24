package SPham;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 * 
 */
//import util.java.Scanner;
public class Sach extends SanPham1{
    String maSach;
    TacGia tacGia;
    int namXB;
    String loaiSach;
    private SanPham1 sanPham;
    
    public Sach(TacGia tacGia, int namXB, String maSach, String NSX, double giaBan, double giaNhap, String tenSP,String loaiSach) {
        this(maSach, NSX, giaBan, giaNhap, tenSP, loaiSach, namXB, loaiSach);
    }

    public Sach(String maSach, String NSX, double giaBan, double giaNhap, String tenSP, String loaiSach, int namXB, String loaiSach1) {
        super(NSX, giaBan, giaNhap, tenSP);
        this.maSach = maSach;
        this.tacGia = tacGia;
        this.namXB = namXB;
        this.loaiSach = loaiSach;
    }

    public Sach(TacGia tacGia, int namXB, String maSach, String NSX, String tenSP, double giaBan, double giaNhap,String loaiSach) {
        super(NSX, tenSP, giaBan, giaNhap);
        this.maSach=maSach;
        this.tacGia = tacGia;
        this.namXB = namXB;
        this.loaiSach=loaiSach;

    }

    public Sach() {
    }
     


    public SanPham1 getSanPham() {
        return this.sanPham;
    }
    public Sach(TacGia tacGia, int namXB, String maSach,String loaiSach) {
        this.tacGia = tacGia;
        this.namXB = namXB;
        this.maSach=maSach;
        this.loaiSach=loaiSach;

    }

//    Sach(SanPham sp, String string, TacGia tacGia, int parseInt) {
//        this(sp, string, tacGia, parseInt, txt[7]);
//    }

    Sach(SanPham1 sp, String string, TacGia tacGia, int parseInt, String par1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public TacGia getTacGia() {
        return tacGia;
    }

    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        while(namXB<1900 && namXB>2023){
         System.out.println("Nhap lai nam xuat ban");
         namXB=sc.nextInt();
        }
        this.namXB = namXB;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getLoaiSach() {
        return loaiSach;
    }

    public void setLoaiSach(String loaiSach) {
        this.loaiSach = loaiSach;
    }

  

    @Override
        public void input(){
        super.input();
        tacGia.input();
        System.out.println("Nhap ma so cua sach:");
        String maSach=sc.nextLine(); 
        System.out.println("Nam Xuat Ban cua Sach:");
        namXB=sc.nextInt();
        boolean k = true;
	while (k == true) {
			System.out.println("Chon loai Sach:");
			System.out.println("  1. Truyen");
			System.out.println("  2. Giao Khoa");
			System.out.println("Moi ban chon: ");
			int chon = sc.nextInt();
			switch (chon) {
			case 1: {
				setLoaiSach("Truyen");
				System.out.println("Truyen");
				k = false;
				break;
			}
			case 2: {
				setLoaiSach("Giao Khoa");
				System.out.println("GiaoKhoa");
				k = false;
				break;
			}
			default:{
				System.out.println("Lua chon khong dung yeu cau ! Vui long chon lai");
			}
		}
	}
        }
       
    @Override
    public void output () {
            System.out.format("| %6s | %20s | %10s | %13s | %20s | %12s | %12s |%12s |\n", this.getTenSP(),
				this.getNSX(), this.getGiaBan(), this.getGiaNhap(),this.maSach, this.namXB,this.tacGia,this.loaiSach);
	}
  
    @Override
        public String toString() {
        return getTacGia()+","+getNamXB()+getMaSach()+getLoaiSach();
    }

  

    
    
}
