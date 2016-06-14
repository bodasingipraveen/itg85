/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author miracle
 */
public class staticsimpledimarray {
    public static void main(String args[])
    {
        int d[]={1,2,3},i;
        String dname[]={"ravi","srinivas","sravani"};
        String ddesgn[]={"cardilogy","nurelogist","rmp"};
        System.out.println("id \t name \t designation ");
        for(i=0;i<3;i++)
        {  
            System.out.println(d[i]+"        "+dname[i]+"         "+ddesgn[i]);
        }
        
    }    
}
