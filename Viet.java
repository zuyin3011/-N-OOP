package DUNGCU;

import java.util.Scanner;

public class Viet extends DungCuHocTap {
    private String mauSac;
    private String loaiViet;
    Scanner sc = new Scanner(System.in);
    public Viet() {
    }
     public Viet(SANPHAM sanpham,String maDungCu,String chucNang, String loaiDungCu, String mauSac,String loaiViet) {
        super(sanpham, maDungCu,chucNang,loaiDungCu);
        this.mauSac =mauSac;
        this.loaiViet = loaiViet;
    }
    public Viet(String tenSP,String NSX,long giaBan, long giaNhap,String maDungCu, String chucNang,String loaiDungCu, String mauSac,String loaiViet) {
        super(tenSP,NSX,giaBan, giaNhap,maDungCu,chucNang,loaiDungCu);
        this.mauSac =mauSac;
        this.loaiViet = loaiViet;
    }

    public String getMauSac() {
        return mauSac;
    }
    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    public String getLoaiViet() {
        return loaiViet;
    }
    public void setLoaiViet(String loaiViet) {
        this.loaiViet = loaiViet;
    }
    @Override
    public void input(){
        super.input();
        System.out.println("Nhap mau sac cua viet:");
        mauSac=sc.nextLine();
        System.out.println("Nhap loai viet:");
        loaiViet=sc.nextLine();
    }
    @Override
    public void output(){
        System.out.format("| %6s | %13s | %12s | %14s | %13s | %20s  | %10s | %13s\n", this.getNSX(),this.getTenSP(),this.getGiaBan(),this.getGiaNhap(),this.getChucNang(),this.getMaDungCu(),this.getMauSac(),this.getLoaiViet());
    }
    @Override
    public String toString() {
        return getMauSac()+","+getLoaiViet();
    }

    
}
