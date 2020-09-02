/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luassegitiga;

import java.util.Scanner;

/**
 *
 * @author Vira Febrianti
 */
public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double L, A, T;
        
        System.out.println("MENGHITUNG LUAS SEGITIGA");
        System.out.print("Masukan Alas = ");
        A = input.nextDouble();
        System.out.print("Masukan Tinggi = ");
        T = input.nextDouble();
        
        L = 0.5 * A * T;
        System.out.println("Luas Segitiga = " + L);

    }
    
}
