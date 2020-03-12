/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tonggiatricacchuso;

import java.util.Scanner;

/**
 *
 * @author phamv
 */
public class Tonggiatricacchuso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
        System.out.println("nhap vap 1 so");
        long n=sc.nextLong();
        long k=0;
        for(long i=2;i>1;i++)
        {
            k=k+n%10;
            n=n/10;
            if(n==0)
            {
                break;
            }
        }
        System.out.println("tong cac chu so la"+k);
    }
    
}
