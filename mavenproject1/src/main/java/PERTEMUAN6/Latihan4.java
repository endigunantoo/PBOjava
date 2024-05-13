/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN6;

/**
 *
 * @author endig
 */
public class Latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka (1-7): ");
        if (input.hasNextInt()) {
            int angka = input.nextInt();

            String hari;
            switch (angka) {
                case 1:
                    hari = "Senin";
                    break;
                case 2:
                    hari = "Selasa";
                    break;
                case 3:
                    hari = "Rabu";
                    break;
                case 4:
                    hari = "Kamis";
                    break;
                case 5:
                    hari = "Jumat";
                    break;
                case 6:
                    hari = "Sabtu";
                    break;
                case 7:
                    hari = "Minggu";
                    break;
                default:
                    hari = "Input tidak valid. Silakan masukkan angka antara 1 dan 7.";
            }

            System.out.println("Hari ini adalah: " + hari);
        } else {
            System.out.println("Input tidak valid. Masukkan angka.");
        }

        input.close(); // Tutup scanner setelah menggunakannya
    }
}
