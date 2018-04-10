package lab_2;

import java.util.Scanner;

/**
 *
 * @author Hang
 */
public class Bai_2 {
    public static void main(String[] args)
    {
         Scanner scanner = new Scanner(System.in);
            System.out.printf("Nhập vào a: ");
            String STN = scanner.nextLine();
            int a = Integer.parseInt(STN);
            System.out.printf("Nhập vào b: ");
            int b = Integer.parseInt(scanner.nextLine());
             System.out.printf("Nhập vào c: ");
            String STB = scanner.nextLine();
            int c = Integer.parseInt(STB);
            if(a ==0){
                        if(b==0){
                                   if(c==0){
                                         System.out.printf("Phương trình vô số nghiệm");
                                  }
                                  else
                                        System.out.printf("Phương trình vô nghiệm");
                                     }
                        else 
                       {
                           float x = -c/b;
                           System.out.printf("Nghiệm của phương trình là: %f\n", x);
                       }
            }
             else
             {
                        float x1, x2;
                     float Delta = (float) (Math.pow(b, 2) - 4 * a * c);
                     if(Delta <0)
                     {
                            System.out.println("Vô nghiệm");
                     }
                     if(Delta == 0)
                     {
                         float x= -b/(2 * a);
                         System.out.printf("Nghiệm kép: %f",x);
                       }
                        if  (Delta  > 0)
                             {
                                  x1 = (float) ((-b+Math.sqrt(Delta))/(2 * a));
                                  x2 = (float) ((-b-Math.sqrt(Delta))/(2 * a));
                                 System.out.printf("Phương trình có 2 nghiệm phân biệt: \nx1= %f\n x2 = %f\n",x1,x2);
                             }
             }
            }

    void main() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

