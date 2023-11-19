package SPham;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class TacGia {
    private String tenTG;
    private String queQuan;
    private Date ngSinh;
    private String gioiTinh;
    Scanner sc=new Scanner(System.in);

    public TacGia() {
    }

    public TacGia(String tenTG, String queQuan, Date ngSinh, String gioiTinh) {
        this.tenTG = tenTG;
        this.queQuan = queQuan;
        this.ngSinh = ngSinh;
        this.gioiTinh = gioiTinh;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
         while(tenTG.length() < 2 || tenTG.length() > 50 || !tenTG.matches("[a-zA-Z ]+") || !Character.isUpperCase(tenTG.charAt(0)) ) {
                System.out.println("Nhap lai Ten tac Gia");
                tenTG=sc.nextLine();
        }
        this.tenTG = tenTG;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
         while(queQuan.length() < 2 || !queQuan.matches("[a-zA-Z ]+") || !Character.isUpperCase(queQuan.charAt(0)) ) {
                System.out.println("Nhap lai Que Quan");
                queQuan=sc.nextLine();
        }
        this.queQuan = queQuan;
    }
    public String getNgaySinhFormat() {
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		return df.format(ngSinh);
	}
    public Date getNgSinh() {
        return ngSinh;
    }

    public void setNgSinh(Date ngSinh) {
        this.ngSinh = ngSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public void input(){
        System.out.println("Nhap ho ten Tac Gia:");
        this.tenTG=sc.nextLine();
        System.out.println("Nhap que quan cua Tac Gia:");
        this.queQuan=sc.nextLine();
        System.out.println("Chon gioi tinh: ");
       System.out.println("  1. Nam");
       System.out.println("  2. Nu");
       System.out.println("Moi ban chon: ");
       while(true) {
       	int luaChon = sc.nextInt();
        switch (luaChon) {
   		case 1: {
   			setGioiTinh("nam");
   			System.out.println("  Gioi tinh nam");
   			break;
   		}
   		case 2: {
   			setGioiTinh("nu");
   			System.out.println("  Gioi tinh nu");
   			break;
        }
   		default:
   			System.out.println("Lua chon khong dung yeu cau ! Vui long chon lai");
        } 
       
        sc.nextLine();
    
        System.out.println("Nhap ngay sinh (dd-MM-yyyy): ");
        SimpleDateFormat df= new SimpleDateFormat("dd-MM-yyyy");
        boolean m = false;
        do {
       		try {
       			setNgSinh(df.parse(sc.nextLine()));
       			m = true;
       			break;
       		} catch (ParseException e) {
       			System.out.println("Khong dung cu phap !");
       		}
		} while (m == false);
       }
    }   

}