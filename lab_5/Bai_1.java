/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hang
 */
public class Bai_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Double> arrlist = new ArrayList<>();
        Double sum  = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập danh sách các số thực: ");
        while(true){
            Double x =scanner.nextDouble();
            arrlist.add(x);
            
            System.out.println("Nhập thêm (Y/N)?");
            if(scanner.nextLine().equals("N") || scanner.nextLine().equals("n"))
            {
                break;
            }            
        }
        System.out.println("Danh sách vừa nhập: ");
        for(Double x: arrlist)
        {
            System.out.printf("%.2f \t ",x);
            sum  += x;
         }
        System.out.println("Tổng các phần tử: " + sum);
    }
}
