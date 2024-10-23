/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BmiApp;

/**
 *
 * @author LEGION
 */
import java.util.Scanner;

public class BmiBeraksi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean hitungUlang;
        System.out.println("***************************");
        System.out.println("      Selamat Datang       ");
        System.out.println("      Aplikasi BMI         ");
        System.out.println("  Hitung Indeks Massa Tubuh ");
        System.out.println("***************************");
        do {
            System.out.println("\nJenis Kelamin: ");
            System.out.println("1. Laki-Laki");
            System.out.println("2. Perempuan");

            System.out.print("\nMasukkan jenis kelamin anda (1/2): ");
            int pilihanKelamin = input.nextInt();

            System.out.print("Masukkan tinggi badan (cm): ");
            float tinggi = input.nextFloat();

            System.out.print("Masukkan berat badan (kg): ");
            float berat = input.nextFloat();

            Bmi bmiApp = new Bmi(berat, tinggi);
            bmiApp.getHasil(pilihanKelamin);

            System.out.print("\nApakah Anda ingin menghitung ulang? (ya/tidak): ");
            String response = input.next().toLowerCase();
            hitungUlang = response.equals("ya");

        } while (hitungUlang);

        input.close();
        System.out.println("\nTerima kasih telah menggunakan aplikasi BMI!");
    }
}
