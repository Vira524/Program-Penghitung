/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luaspersegipanjang;

import java.util.Scanner;

/**
 *
 * @author Vira Febrianti
 */
public class LuasPersegiPanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double L, p, l;
        
        System.out.println("MENGHITUNG LUAS PERSEGI PANJANG");
        System.out.print("Masukan Panjang = ");
        p = input.nextDouble();
        System.out.print("Masukan Lebar = ");
        l = input.nextDouble();
        
        L = p * l;
        System.out.println("Luas Persegi Panjang = " + L);
        
    }
    
}
