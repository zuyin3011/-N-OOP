package DUNGCU;

import java.util.Scanner;

public class Thuoc extends DungCuHocTap{
    private String kichCoThuoc;
    private String loaiThuoc;
    Scanner sc = new Scanner(System.in);
    public Thuoc() {
    }

    public Thuoc(SANPHAM sanpham,String maDungCu,String chucNang, String loaiDungCu, String kichCoThuoc, String loaiThuoc) {
        super(sanpham, maDungCu,chucNang,loaiDungCu);
        this.kichCoThuoc = kichCoThuoc;
        this.loaiThuoc = loaiThuoc;
    }
    public Thuoc(String tenSP,String NSX,long giaBan, long giaNhap,String maDungCu, String chucNang,String loaiDungCu, String kichCoThuoc, String loaiThuoc) {
        super(tenSP,NSX,giaBan, giaNhap,maDungCu,chucNang,loaiDungCu);
        this.kichCoThuoc =kichCoThuoc;
        this.loaiThuoc = loaiThuoc;
    }

    public String getLoaiThuoc(){
        return this.loaiThuoc;
    }
    public void setLoaiThuoc(String loaiThuoc){
        this.loaiThuoc=loaiThuoc;
    }
     public String getKichCoThuoc(){
        return kichCoThuoc;
    }
    public void setKichCoThuoc (String kichCoThuoc){
        this.kichCoThuoc=kichCoThuoc;
    }
    @Override
    public void input(){
        super.input();
        System.out.println("nhap kich co cua thuoc");
        kichCoThuoc=sc.nextLine();
        System.out.println("Nhap loai thuoc");
        loaiThuoc=sc.nextLine();
    }
    @Override
    public void output() {
        System.out.format("| %12s | %5s | %14s | %13s | %20s  | %10s | %13s|%12s| \n", this.getNSX(),this.getTenSP(),this.getGiaBan(),this.getGiaNhap(),
        this.getChucNang(),this.getMaDungCu(),this.getKichCoThuoc(),this.getLoaiThuoc());
    }
    @Override
    public String toString() {
        return "Thuoc [kichCo=" + kichCoThuoc + ", loaiThuoc=" + loaiThuoc + "]";
    }
}