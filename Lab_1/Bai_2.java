
package lab_1;

import java.util.Scanner;
import org.omg.CORBA.DoubleSeqHolder;
public class Bai_2 {  
    public static void main(String[] args)
    {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Chiều dài: ");
            String cd = scanner.nextLine();
            float a = Float.parseFloat(cd);
            System.out.printf("Chiều rộng: ");
            String cr = scanner.nextLine();
            float b = Float.parseFloat(cr);
            float CV = (a + b) * 2;
            float DT = a * b;
            float CNN = Math.min(a,b);
             System.out.printf("Chu vi: %f\nDiện tích:%f\nCạnh nhỏ nhất:%f \n",CV,DT,CNN);
    }
}
