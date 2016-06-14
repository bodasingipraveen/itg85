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
public class linearsearch {
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter array length");
        int n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        System.out.println("Enter searching element");
        int s= scan.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==s)
            {
                System.out.println("Identified");
                break;
            }
           
        }
        int i=0;
        if(i==s)
            {
               System.out.println(" Not Identified"); 
            }
        
    }
    
}
