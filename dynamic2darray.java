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
public class dynamic2darray {
     public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("id \t name\t designation");
        int i=s.nextInt();
        int j=s.nextInt();
       int d[][]=new int[i][j];
        String dname[][]=new String[i][j];
        String ddesgn[][]=new String[i][j];
        
    for(i=0;i<d.length;i++)
        for(j=0;j<d.length;j++)
    {
         d[i][j]=s.nextInt();
    dname[i][j]=s.next();
    ddesgn[i][j]=s.next();}
       for(j=0;j<d.length;j++)
       {
    d[i][j]=s.nextInt();
    dname[i][j]=s.next();
    ddesgn[i][j]=s.next();
     System.out.println(d[i][j]+"        "+dname[i][j]+"         "+ddesgn[i][j]);
    }
    }
    }
