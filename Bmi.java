/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BmiApp;

/**
 *
 * @author LEGION
 */
public class Bmi {

    float berat;
    float tinggi;
    String jenisKelamin;

    public Bmi(float berat, float tinggi) {
        this.berat = berat;
        this.tinggi = tinggi / 100;
    }

    public float hitung() {
        return berat / (tinggi * tinggi);
    }

    public String getStatus() {
        float bmi = hitung();
        if (bmi < 18.5) {
            return "Kurus";
        } else if (bmi < 24.9) {
            return "Normal";
        } else if (bmi < 27.5) {
            return "Berat berlebih";
        } else {
            return "Obesitas";
        }
    }

    public void getHasil(int pilihanKelamin) {
        float bmi = hitung();
        System.out.println("\n======== Hasil BMI =========");
        jenisKelamin = switch (pilihanKelamin) {
            case 1 ->
                "Laki-Laki";
            case 2 ->
                "Perempuan";
            default ->
                "Tidak valid";
        };
        System.out.println("Jenis Kelamin                : " + jenisKelamin);
        System.out.printf("Indeks Massa Tubuh (BMI)     : %.1f%n", bmi);
        System.out.println("Status Kesehatan             : " + getStatus());
        System.out.println("============================");
    }
}
