/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts.lingkaran;

/**
 *
 * @author Revoherlambang
 */
public class UTSLingkaran {
    private static final double PI = 3.141592;

    public double hitungLuas(double jariJari) {
        return PI * jariJari * jariJari;
    }

    public void tampilkanLuas(double jariJari) {
        double luas = hitungLuas(jariJari);

        System.out.println("Jari-jari lingkaran: " + jariJari);
        System.out.println("Luas Lingkaran (Bilangan Pecahan): " + luas);
        System.out.println("Luas Lingkaran (Bilangan Bulat - Type Casting): " + (int) luas);
        System.out.println("Luas Lingkaran (Pembulatan - Rounding): " + Math.round(luas));
    }
}

    
            
