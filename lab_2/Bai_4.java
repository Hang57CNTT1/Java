package lab_2;

import java.util.Scanner;

/**
 *
 * @author Hang
 */
public class Bai_4 {
    public static void main(String[] args)
    {
        System.out.println("+-----------------------------------+");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện ");
        System.out.println("Kết thúc");
        System.out.println("+-----------------------------------+");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập lựa chọn: ");
        Bai_1 b1 = new Bai_1();
        Bai_2 b2 = new Bai_2();
        Bai_3 b3 = new Bai_3();
        int c = Integer.parseInt(scanner.nextLine());
        switch(c)
        {
            case 1: b1.main();break;
            case 2: b2.main(); break;
            case 3: b3.main(); break;
            case 4: 
                System.out.printf("Kết thúc chương trình");
                System.exit(0);
        }
    }
}
