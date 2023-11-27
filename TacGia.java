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
public class TacGia {
    private String tenTG;
    private String queQuan;
    Scanner sc=new Scanner(System.in);

    public TacGia() {
    }

    public TacGia(String tenTG, String queQuan, String gioiTinh) {
        this.tenTG = tenTG;
        this.queQuan = queQuan;
     
    }


    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    public void input1(){
        System.out.println("Nhap ho ten Tac Gia:");
        this.tenTG=sc.nextLine();
        System.out.println("Nhap que quan cua Tac Gia:");
        this.queQuan=sc.nextLine();
        sc.nextLine();
     
    }

  @Override
public String toString() {
    return tenTG + "," + queQuan ; // thay đổi này tùy thuộc vào các thuộc tính của bạn
}

   

    
}