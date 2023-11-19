package SPham;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */

import java.util.Scanner;
public class Truyen extends Sach{
    private String ngonNgu;
    private String loaiTruyen;
    Scanner sc= new Scanner(System.in);

    public Truyen(String ngonNgu, String loaiTruyen, TacGia tacGia, int namXB, String maSach, String NSX, double giaBan, double giaNhap, String tenSP, String loaiSach) {
        super(tacGia, namXB, maSach, NSX, giaBan, giaNhap, tenSP, loaiSach);
        this.ngonNgu = ngonNgu;
        this.loaiTruyen = loaiTruyen;
    }

    public Truyen(String ngonNgu, String loaiTruyen, TacGia tacGia, int namXB, String maSach, String NSX, String tenSP, double giaBan, double giaNhap, String loaiSach) {
        super(tacGia, namXB, maSach, NSX, tenSP, giaBan, giaNhap, loaiSach);
        this.ngonNgu = ngonNgu;
        this.loaiTruyen = loaiTruyen;
    }

    public Truyen(String ngonNgu, String loaiTruyen, TacGia tacGia, int namXB, String maSach, String loaiSach) {
        super(tacGia, namXB, maSach, loaiSach);
        this.ngonNgu = ngonNgu;
        this.loaiTruyen = loaiTruyen;
    }
    
    public String getNgonNgu() {
        return ngonNgu;
    }

    public void setNgonNgu(String ngonNgu) {
        this.ngonNgu = ngonNgu;
    }

    public String getLoaiTruyen() {
        return loaiTruyen;
    }

    public void setLoaiTruyen(String loaiTruyen) {
        this.loaiTruyen = loaiTruyen;
    }
        @Override
        public void input(){
        
        super.input();
        if("Truyen".equals(getLoaiSach())){
        System.out.println("nhap ngon ngu cua truyen:");
        ngonNgu=sc.nextLine();
        System.out.println("nhap loai truyen cua truyen:");
        loaiTruyen=sc.nextLine();
        }
        }
    @Override
   	public void output () {
            System.out.format("| %6s | %20s | %10s | %13s | %13s | %20s | %12s | %6s | %12s | %12s| \n",  this.getTenSP(),
				this.getNSX(), this.getGiaBan(), this.getGiaNhap(), this.getMaSach(),this.getTacGia(),this.getNamXB(),this.getLoaiSach(),this.ngonNgu,this.loaiTruyen);
	}  
    @Override
        public String toString() {
        return getNgonNgu()+","+getLoaiTruyen();
        }
  

    
     
    
}
