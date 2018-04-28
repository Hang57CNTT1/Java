package Lap_3;

import java.util.Scanner;

public class Bai_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập vào số n: ");
        int n = Integer.parseInt(scanner.nextLine());
        boolean ok = true;
        for(int i = 2; i < n-1;i++)
        {
            if(n%i == 0)
            {
                ok = false;
                System.out.printf("%d không phải là số nguyên tố \n", n);
                break;             
            }
            System.out.printf("%d là số nguyên tố \n", n);
            i++;
        }
    }
    
}
