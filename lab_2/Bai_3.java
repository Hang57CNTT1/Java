
package lab_2;

import java.util.Scanner;

/**
 *
 * @author Hang
 */
public class Bai_3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập vào số điện của tháng: ");       
        int d = Integer.parseInt(scanner.nextLine());
        int tien;
        if(d < 50)
        {
            tien = d*1000;
            System.out.printf("Số tiền điện phải trả với mức dưới 50 là: %d\n",tien);
        }
        else
        {
             tien = 50 * 1000 + (d - 50)*1200;
            System.out.printf("Số tiền điện phải trả với mức điện trên 50 là: %d\n",tien);
        }
    }

    void main() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
