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
public class bubblesort {
    public static void main(String args[])
    {
        int n ,temp;
        System.out.println("enter the number");
        Scanner scan = new Scanner(System.in); 
        n=scan.nextInt();
        int a[]=new int[n];
        System.out.println("Enter" +n+ "integers");
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
            for(int i=0;i<(n-1);i++){
                for(int j=0;j<n-i-1;j++){
                    if (a[j]>a[j+1]){
                   temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
                   }
                }
              }
            System.out.println("The sorted list is");
                for(int i=0;i<n;i++){
                    System.out.println(a[i]);
                }
        }
    }
        
    
    

