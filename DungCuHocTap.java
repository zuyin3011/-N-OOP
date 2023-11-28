package DUNGCU;

import java.util.Scanner;

public class DungCuHocTap extends SANPHAM {
    private String chucNang;
    private String maDungCu;
    private String loaiDungCu;
     private SANPHAM sanpham;
    Scanner sc= new Scanner (System.in);
    public DungCuHocTap(String tenSP, String NSX, long giaBan, long giaNhap,String maDungCu,String chucNang, String loaiDungCu) {
        super(tenSP, NSX, giaBan, giaNhap);
        this.chucNang = chucNang;
        this.maDungCu = maDungCu;
        this.loaiDungCu = loaiDungCu;
    }

    public DungCuHocTap(SANPHAM sanpham, String maDungCu,String chucNang, String loaiDungCu) {
        this.chucNang = chucNang;
        this.maDungCu = maDungCu;
        this.loaiDungCu = loaiDungCu;
        this.sanpham = sanpham;
    }
       public SANPHAM getSanPham() {
        return this.sanpham;
    }
    public DungCuHocTap() {
    }
     public String getLoaiDungCu() {
        return loaiDungCu;
    }
    public void setLoaiDungCu(String loaiDungCu) {
        this.loaiDungCu = loaiDungCu;
    }

    public String getChucNang() {
        return chucNang;
    }
    public void setChucNang(String chucNang) {
        this.chucNang = chucNang;
    }
    
    public String getMaDungCu() {
        return maDungCu;
    }
    public void setMaDungCu(String maDungCu) {
        this.maDungCu = maDungCu;
    }
    
    @Override
    public void input(){
        super.input();
        System.out.println("Nhap chuc nang:");
        chucNang = sc.nextLine();
        System.out.println("Nhap ma dung cu");
        maDungCu = sc.nextLine();
        boolean c = true;
        while (c == true) {
                System.out.println("Chon loai dung cu:");
                System.out.println("  1. Thuoc");
                System.out.println("  2. Viet");
                System.out.println("  3. Gom");
                System.out.println("Moi ban chon: ");
                int chon = sc.nextInt();
                switch (chon) {
                case 1: {
                    
                    System.out.println("Thuoc");
                    c = false;
                    
                    break;
                }
                case 2: {
                    
                    System.out.println("Viet");
                    c = false;
                    break;
                }
                case 3: {
                    
                    System.out.println("Gom");
                    c = false;
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
                System.out.format("| %10s | %20s | %13s | %20s | %12s | %12s |\n", this.getNSX(),
                    this.getTenSP(), this.getGiaBan(), this.getGiaNhap(),this.getChucNang(),this.getMaDungCu());
        }
        @Override
         public String toString() {
        return "DungCuHocTap [chucNang=" + chucNang + ", maDungCu=" + maDungCu + ", sc=" + sc + "]";
    }
    }

