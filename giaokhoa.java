package SPham;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class giaokhoa extends Sach {
    private int lop;
    private String mon;
    Scanner sc=new Scanner(System.in);

//    public giaokhoa(String tenSP,String NSX, double giaBan, double giaNhap, String maSach, TacGia tacGia, int namXB,String loaiSach) {
//        super(tacGia, namXB, maSach, NSX, giaBan, giaNhap, tenSP, loaiSach);
//    }
    public giaokhoa(String tenSP,String NSX, double giaBan, double giaNhap, String maSach, TacGia tacGia, int namXB,String loaiSach,int lop, String mon) {
        super(tacGia, namXB, maSach, NSX, giaBan, giaNhap, tenSP, loaiSach);
        this.lop = lop;
        this.mon = mon;
    }

  

    public giaokhoa(int lop, String mon, TacGia tacGia, int namXB, String maSach, String loaiSach) {
        super(tacGia, namXB, maSach, loaiSach);
        this.lop = lop;
        this.mon = mon;
    }

    giaokhoa() {
        
    }

  
  

    


    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
         while(lop<1 && lop>12){
         System.out.println("Nhap lai lop cua sach");
         lop=sc.nextInt();
        }
        this.lop = lop;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }
       public giaokhoa(Sach sach,int lop,String mon){
        super(sach.getSanPham(),sach.getMaSach(),sach.getTacGia(),sach.getNamXB(),sach.getLoaiSach());
        this.lop = lop;
        this.mon = mon;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
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
        this.namXB = namXB;
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
        System.out.println("nhap lop cua sach giao khoa:");
        lop=sc.nextInt();
         System.out.println("nhap mon cua sach giao khoa:");
        mon=sc.nextLine();
        }
    @Override
   	public void output () {
            System.out.format("| %6s | %20s | %10s | %13s | %13s | %20s | %12s | %6s | %12s | %12s| \n",  this.getTenSP(),
				this.getNSX(), this.getGiaBan(), this.getGiaNhap(), this.getMaSach(),this.getTacGia(),this.getNamXB(),this.getLoaiSach(),this.mon,this.lop);
	} 
  
    @Override
        public String toString() {
        return getLop()+","+getMon();
        }
  
}
