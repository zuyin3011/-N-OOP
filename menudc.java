package DUNGCU;
import java.util.Scanner;

public class menudc {
    private DSDungCuHocTap dsDungCuHocTap;
    Scanner sc = new Scanner(System.in);

   public menudc(){
      dsDungCuHocTap = new DSDungCuHocTap();
   }
   private void hienThiMenu() {
    System.out.println("---- MENU ----");
    System.out.println("1. Them dung cu");
    System.out.println("2. Xoa dung cu");
    System.out.println("3. Sua thong tin dung cu");
    System.out.println("4. Hien thi danh sach dung cu");
    System.out.println("5. Tim kiem ten dung cu");
  
    System.out.println("6. Ghi vao file");
    System.out.println("7.Đoc file dung cu");
    System.out.println("0. Thoat");
}
public void rundc() {
    dsDungCuHocTap = new DSDungCuHocTap();
    int luaChon;
    do {
        hienThiMenu();
        System.out.print("Nhap lua chon cua ban: ");
        luaChon = sc.nextInt();
        sc.nextLine(); 

        switch (luaChon) {
            case 1: 
               dsDungCuHocTap.Them();
               break;
            case 2:
               dsDungCuHocTap.Xoa();
               break;
            case 3:
                dsDungCuHocTap.Sua();
                break;
            case 4:
                dsDungCuHocTap.hienThiDanhSach();
                break;
            case 5:
                dsDungCuHocTap.timKiem();
                break;
            case 6:
                dsDungCuHocTap.writeToFile("dungcu.txt");
                break;
            case 7:
                dsDungCuHocTap.readFromFile("dungcu.txt");
                break;
             case 0:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
              default:
                    System.out.println("Lua chon khong hop le, vui long nhap lai.");
            }
        } while (luaChon != 0);
    }
   
}



