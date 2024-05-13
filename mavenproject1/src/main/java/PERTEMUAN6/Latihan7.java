/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN6;

/**
 *
 * @author endig
 */
public class Latihan7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Tuliskan pesan di sini, saya akan tampilkan berulang.");
        System.out.print("Tuliskan Pesan anda paduka : ");
        String message = keyboard.nextLine();

        Random mesinRandom = new Random();
        int jumlahPengulangan = mesinRandom.nextInt(20) + 1;

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("\nJumlah pengulangan yang didapatkan = " + jumlahPengulangan);

        if (jumlahPengulangan >= 10) {
            System.out.println("\n\tBilangan random yang didapat terlalu besar, pesan akan diulang 5 kali.");
            jumlahPengulangan = 5;
        }

        System.out.println("\nPesan diulang sebanyak : " + jumlahPengulangan + " kali\n");
        System.out.println("-----------------------------------------------------------------------------");

        for (int n = 1; n <= jumlahPengulangan; n++) { // Starting from 1 to match human count
            System.out.println(n + ". " + message);
        }
    }
}
