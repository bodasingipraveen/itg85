/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author miracle
 */
public class matrixaddition {
    public static void main(String args[])
    {
        int a,b,c,d;
        Scanner s=new Scanner(System.in);
        System.out.println("enter rows and columns :");
        a=s.nextInt();
        b=s.nextInt();
        int r[][]=new int[a][b];
        int col[][]=new int[a][b];
        int sum[][]=new int[a][b];
        System.out.println("enter first matrix");
        for(c=0;c<a;c++)
            for(d=0;d<b;d++)
                r[c][d]=s.nextInt();
        System.out.println("enter second matrix");
        for(c=0;c<a;c++)
            for(d=0;d<b;d++)
                col[c][d]=s.nextInt();
        for(c=0;c<a;c++)
            for(d=0;d<b;d++)
                sum[c][d]=r[c][d]+col[c][d];
        System.out.println("sum of matrices is");
        for(c=0;c<a;c++){
            for(d=0;d<b;d++)
            {
                System.out.println(sum[c][d]);
            }
        }
            }
    }
    

