/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uclncua2so;

import java.util.Scanner;

/**
 *
 * @author phamv
 */
public class UCLNcua2so {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao 2 so");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int r = 0, r1=a, r2=b;
        for (int i = 2; i > 1; i++) {

            

            r = r1 % r2;
             if (r == 0) {
                break;
            }
            r1=r2;
            r2=r;
            

           
        }
        System.out.println("uoc chung lon nhat ra"+r2);
        // TODO code application logic here
    }

}
