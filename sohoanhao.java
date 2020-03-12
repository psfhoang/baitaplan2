/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1.pkg1.pkg10.pkg3;

import java.util.Scanner;

/**
 *
 * @author phamv
 */
public class B11103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so n");
        int n = sc.nextInt();
        int b = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                b += i;
            }
        }
        if (n == b) {
            System.out.println("la so hoan hao");
        } else {
            System.out.println("k la so hoan hao");
        }

    }
}
