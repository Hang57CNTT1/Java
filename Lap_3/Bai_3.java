
package Lap_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hang
 */
public class Bai_3 {
    public static void NhapMang(int arrInt[], int n)
    {
        Scanner scanner = new Scanner(System.in);
        for(int i =0; i< n; i++)
        {
            System.out.printf("Nhập a[ " + (i +1) + "] = ");
            arrInt[i] = scanner.nextInt();
        }
    }
    public static void XuatMang(int arrInt[], int n)
    {
        for(int i =0;i<n;i++)
        {
            System.out.printf("%4d",arrInt[i]);
        }
        System.out.println("");
    }
    public static int Min(int arrInt[],int n)
    {
        int min = arrInt[0];
        for(int i=1;i<n;i++)
            min = Math.min(min, arrInt[i]);
        return min;
    }
    public static double Tong3(int arrInt[],int n)
    {
        double sum = 0;
        int count = 0;
        for(int i = 0; i<n; i++)
        {
            if(arrInt[i] % 3 ==0)
                sum +=arrInt[i];
                count++;
        }
        return sum*1.0/count;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n; int arrInt[];
        System.out.println("Nhập vào số lượng phần tử: ");
        n = scanner.nextInt();
        arrInt =new int[n];
        NhapMang(arrInt, n);
        System.out.println("Mang vừa nhập là: ");
        XuatMang(arrInt, n);
        
        Arrays.sort(arrInt);
        System.out.printf("Mảng vừa sắp xếp: %s\n",Arrays.toString(arrInt));
        System.out.println("Giá trị nhỏ nhất của mảng là: " + Min(arrInt, n));
        System.out.println("Trung bình tổng các số chia hết cho 3 là: " + Tong3(arrInt, n));
    }
}
