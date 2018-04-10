
package lab_1;

import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập vào cạnh của khối lập phương: ");
        String lp = scanner.nextLine();
        float a = Float.parseFloat(lp);
        double TT =  Math.pow(a, 3);
        System.out.printf("Thể tích khối lập phương là: %f\n",TT);
    }
}
