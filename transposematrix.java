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
public class transposematrix {
     public static void main(String args[])
    {
        int a,b,c,d;
        Scanner s=new Scanner(System.in);
        System.out.println("enter rows and columns :");
        a=s.nextInt();
        b=s.nextInt();
        int r[][]=new int[a][b];
        int trans[][]=new int[b][a];
        System.out.println("enter first matrix");
        for(c=0;c<a;c++)
            for(d=0;d<b;d++)
                r[c][d]=s.nextInt();
          for(c=0;c<a;c++){
            for(d=0;d<b;d++)
        trans[d][c]=r[c][d];
          for(c=0;c<b;c++){
              for(d=0;d<a;d++)
              {
                  System.out.println(trans[c][d]);
              }
          }
                  
        }
    
    } 
}
