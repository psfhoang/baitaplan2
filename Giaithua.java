/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1.pkg2.pkg10.pkg3;

import java.util.Scanner;

/**
 *
 * @author phamv
 */
public class B12103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao 1 so n");
        int n = sc.nextInt(),b=1;
        for(int i =1 ; i<=n;i++)
        {
            b=b*i;
        }
        System.out.println("giai thua "+n+"!="+b);
        
    }
    
}
