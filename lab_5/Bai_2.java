
package lab_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Hang
 */
public class Bai_2 {
    static Scanner scanner = new Scanner(System.in);
    //1. Nhập vào danh sách họ và ten
    public  static void Nhap(ArrayList<String> ds,int n)
    {
        scanner.nextLine();
        for(int i = 0; i< n; i++)
        {
            System.out.println("Nhập họ tên: ");
            ds.add(scanner.nextLine());
        }
    }
    //2. Xuất danh sách vừa nhập
    public  static void Xuat(ArrayList<String> ds,int n)
    {
        for(String x: ds){
            System.out.println(x);
        }
    }
    //3. Xuất danh sách ngẫu nhiên
     public  static void XuatNgauNhien(ArrayList<String> ds)
     {
         Collections.shuffle(ds);
         Xuat(ds,ds.size());
     }
     //4. Sắp xếp giảm dần và xuất danh sách
     public static void SapXep(ArrayList<String> ds)
     {
         //Sắp xếp tăng dần
         Collections.sort(ds);
         //Đảo ngược để ds giảm dần
         Collections.reverse(ds);
         //Xuất ds
         Xuat(ds,ds.size());
     }
     //5. Tìm và xóa họ tên nhập từ bàn phím
     public static void Xoa(ArrayList<String> ds)
     {
         System.out.println("Nhập vào họ tên cần xóa: ");
         String hoten = scanner.nextLine();
         for(String x: ds)
             if(x.equals(hoten)){
                 ds.remove(x);
                 break;
             }
         System.out.println("Danh sách còn lại sau khi xóa là: ");
         Xuat(ds,ds.size());
     }
     
    public static void main(String[] args) {
        ArrayList<String> ds = new ArrayList<String>();
        System.out.print("Nhập vào số lượng phần tử: ");
        int n = scanner.nextInt();
        Nhap(ds,n);
        System.out.println("Danh sách vừa nhập: ");
        Xuat(ds,n);
        System.out.println("Hiển thị ngẫu nhiên: ");
        XuatNgauNhien(ds);
        System.out.println("Sắp xếp giảm dần: ");
        SapXep(ds);
        System.out.println("Tìm và xóa một họ tên:  ");
        Xoa(ds);
    }
}
