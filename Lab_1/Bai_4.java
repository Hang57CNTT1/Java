package lab_1;

import java.util.Scanner;

public class Bai_4 {
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập vào a: ");
        String STN = scanner.nextLine();
        float a = Float.parseFloat(STN);
        System.out.printf("Nhập vào b: ");
        String STH = scanner.nextLine();
        float b = Float.parseFloat(STH);
        System.out.printf("Nhập vào c: ");
        String STB = scanner.nextLine();
        float c = Float.parseFloat(STB);
        float Delta = (float) (Math.pow(b, 2) - 4 * a * c);
        System.out.printf("Giá trị delta là: %f\n Căn delta = %f\n",Delta, Math.sqrt(Delta));
    
    }
}
