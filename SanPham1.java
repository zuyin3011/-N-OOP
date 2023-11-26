package SPham;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
///*import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;*/
import java.util.Scanner;
public class SanPham1 {
    private String NSX;
    private String tenSP;
    private double giaBan;
    private double giaNhap;
    Scanner sc= new Scanner (System.in);

    public SanPham1(String NSX, double giaBan, double giaNhap, String tenSP) {
        this( NSX, tenSP, giaBan, giaNhap);
    }

    public SanPham1( String NSX, String tenSP, double giaBan, double giaNhap) {
    
        this.NSX = NSX;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.giaNhap = giaNhap;
    
    }

    /**
     *
     */
    public SanPham1() {
        
    }

//    SanPham(String NSX, String tenSP, double giaBan, double giaNhap) {
//          this.NSX = NSX;
//        this.tenSP = tenSP;
//        this.giaBan = giaBan;
//        this.giaNhap = giaNhap;
//    }

    SanPham1(String string, String string0, double parseDouble, double parseDouble0, int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 
    public String getNSX() {
        return NSX;
    }

    public void setNSX(String NSX) {
        while(NSX.length() < 2 || NSX.length() > 30 ){
         System.out.println("Nhap lai Nha san Xuat");
         NSX=sc.nextLine();
        }
        this.NSX = NSX;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        while(tenSP.length() < 2 || tenSP.length() > 30 ){
         System.out.println("Nhap lai Ten San Pham");
         tenSP=sc.nextLine();
        }
        this.tenSP = tenSP;
    }
     public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double Gia) {
        while( giaBan<0 || giaBan>1000000000){
            System.out.println("Nhap lai gia Ban cua San Pham");
            giaBan=sc.nextDouble();
        }
        this.giaBan = giaBan;
    }
    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double Gia) {
        while( giaNhap<0 || giaNhap>1000000000){
            System.out.println("Nhap lai gia Nhap cua San Pham");
            giaNhap=sc.nextDouble();
        }
        this.giaNhap = giaNhap;
    }


    public void input(){
            System.out.println("Nhap NSX: ");
            this.NSX = this.sc.nextLine();
            System.out.println("Nhap ten San Pham: ");
            this.tenSP = this.sc.nextLine();
            System.out.println("Nhap gia Ban: ");
            this.giaBan = this.sc.nextDouble();
            System.out.println("Nhap gia Nhap: ");
            this.giaNhap = this.sc.nextDouble();
          
        
    
}
    public void output() {
       System.out.format("| %20s | %10s | %13s | %13s |\n", this.tenSP,
				this.NSX, this.giaBan, this.giaNhap);
   }
 
    @Override
   public String toString() {
      return  this.getTenSP() + "," + this.getNSX() + "," + this.getGiaBan() + "," + this.getGiaNhap() ;
   } 
   

   
}