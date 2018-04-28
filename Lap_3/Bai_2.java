/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap_3;

/**
 *
 * @author Hang
 */
public class Bai_2 {
    public static void main(String[] args)
    {
        int x=8;
        for(int i = 1;i <= 9;i++)
        {
            for(int j = 1;j <=10;j++)
            {
                System.out.printf("%d x %d = %d\n ",i,j,i*j);
            }
            System.out.printf("%d x %d = %d\n",x,i,x*i );
        }
    }
}
