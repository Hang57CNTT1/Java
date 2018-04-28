package Lap_3;
import static java.lang.System.in;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author Hang
 */
public class Bai_4 {
    public static String XepLoai(double diem){
        if (diem < 5)
            return "Yếu";
        else if (diem >= 5 && diem < 6.5)
            return "Trung Bình";
        else if (diem >= 6.5 && diem < 7.5)
            return "Khá";
        else if (diem >= 7.5 && diem < 9)
            return "Giỏi";
        else 
            return "Xuất Sắc";
    }
    public static final <T> void swap (T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    

    public static void SapXep(String[] hoten, Double[] diem, int n){
        for (int i = 0; i < n- 1; i++)
            for (int j = i+1; j < n; j++)
                if (diem[i] > diem[j]){
                    swap(hoten, i, j);
                    swap(diem, i, j);
                }
    }
    public static void main(String[] args){
        String[] HoTen;
        Double[] Diem;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập vào số lượng sinh viên: ");
        n = scanner.nextInt();
        HoTen = new String[n];
        Diem = new Double[n];
        for (int i = 0; i < n; i++){
            System.out.print("Nhập thông tin sinh viên ["+(i+1)+"]: \n");
            System.out.print("Họ Tên: ");
            scanner.nextLine();
            HoTen[i] = scanner.nextLine();
            System.out.print("Điểm: ");
            Diem[i] = scanner.nextDouble();
        }
        SapXep(HoTen,Diem,n);
        // Xuất mảng thông tin sinh viên và xếp loại 
        for (int i = 0; i < n; i++){
           System.out.printf("Sinh viên %d: %s %.2f %s\n",(i+1),HoTen[i],Diem[i],XepLoai(Diem[i])); 
           
        }  
    }
    
}
