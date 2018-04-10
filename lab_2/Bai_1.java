
package lab_2;

import java.util.Scanner;

public class Bai_1 {
     public static void main(String[] args) {
      //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        scanner: đọc dữ liệu từ bàn phím
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Nhập vào a: ");
            String STN = scanner.nextLine();
            int a = Integer.parseInt(STN);
            System.out.printf("Nhập vào b: ");
            String STH = scanner.nextLine();
            int b = Integer.parseInt(STH);
            if(a==0){
                if(b==0){
                    System.out.printf("Phương trình vô số nghiệm");
                }
                else
                    System.out.printf("Phương trình vô nghiệm");
            }
            else 
                       {
                           float x = -b/a;
                           System.out.printf("Nghiệm của phương trình là: %f\n", x);
                       }
    }
}
