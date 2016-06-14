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
public class dynamicsingledimnarray {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("id \t name\t designation");
        int i=s.nextInt();
       int d[]=new int[i];
        String dname[]=new String[i];
        String ddesgn[]=new String[i];
        
    for(i=0;i<d.length;i++)
    {
    d[i]=s.nextInt();
    dname[i]=s.next();
    ddesgn[i]=s.next();
     System.out.println(d[i]+"        "+dname[i]+"         "+ddesgn[i]);
    }
    }
    
    
}
