package DUNGCU;

import java.util.Scanner;

public class Gom extends DungCuHocTap{

    private String loaiGom;
    private String kichCo;
    Scanner sc = new Scanner(System.in);
    public Gom() {
        super();
    }

    public Gom(SANPHAM sanpham,String maDungCu,String chucNang, String loaiDungCu, String kichCo, String loaiGom) {
        super(sanpham,maDungCu ,chucNang, loaiDungCu);
        this.kichCo = kichCo;
        this.loaiGom = loaiGom;
    }

    public Gom(String tenSP,String NSX,long giaBan, long giaNhap,String maDungCu, String chucNang,String loaiDungCu,String loaiGom,String kichCo) {
        super(tenSP,NSX,giaBan, giaNhap,maDungCu,chucNang,loaiDungCu);
        this.loaiGom = loaiGom;
        this.kichCo = kichCo;
    }
    public String getLoaiGom() {
        return loaiGom;
    }
    public void setLoaiGom(String loaiGom) {
        this.loaiGom = loaiGom;
    }
    public String getKichCo() {
        return kichCo;
    }
    public void setKichCo(String kichCo) {
        this.kichCo = kichCo;
    }
    @Override
    public void input(){
        super.input();
        System.out.println("Nhap loai gom:");
        loaiGom=sc.nextLine();
        System.out.println("Nhap kich co cua gom:");
        kichCo=sc.nextLine();
    }
    @Override
    public void output(){
        System.out.format("| %6s | %13s | %12s| 10%s | 10%s | 12%s| 15%s| 12%s| \n", this.getNSX(),this.getTenSP(),this.getGiaBan(),this.getGiaNhap(),
      this.getChucNang(),this.getMaDungCu(),this.getLoaiGom(),this.getKichCo());
    }
    @Override
    public String toString() {
        return "Gom [loaiGom=" + loaiGom + ", kichCo=" + kichCo + "]";
    }
    
}
