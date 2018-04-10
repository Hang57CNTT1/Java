
package lab_1;

import java.util.Scanner;



public class Bai_1 {
 public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Họ và Tên: ");
        String hoten = scanner.nextLine();
        System.out.printf("Điểm TB: ");
        double diemTB = scanner.nextDouble();
        System.out.printf("%s %fđiểm",hoten,diemTB);

    }
    
}
