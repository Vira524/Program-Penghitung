/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luaslingkaran;

import java.util.Scanner;

/**
 *
 * @author Vira Febrianti
 */
public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r, L;
        final double phi = 3.14;
        
        System.out.println("MENGHITUNG LUAS LINGKARAN");
        System.out.print("Masukan Jari-Jari = ");
        r = input.nextDouble();
        
        L = phi * r * r;
        System.out.println("Luas Lingkaran = " + L );
    }
    
}
