/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN6;

/**
 *
 * @author endig
 */
public class Latihan2 {
    public static void main(String[] args) {
        int people = 30;
        int cars = 40;
        int buses = 15;
        int variable1 = 35; // Assume variable1's value
        int variable2 = 20; // Define variable2
        int variable3 = 50; // Define variable3

        if (cars > people) {
            System.out.println("We should take the cars.");
        } else if (cars < people) {
            System.out.println("We should not take the cars.");
        } else {
            System.out.println("We can't decide.");
        }

        if (buses > cars) {
            System.out.println("That's too many buses.");
        } else if (buses < cars) {
            System.out.println("Maybe we could take the buses.");
        } else {
            System.out.println("We still can't decide.");
        }

        if (people > buses) {
            System.out.println("All right, let's just take the buses.");
        } else {
            System.out.println("Fine, let's stay home then.");
        }

        // Condition to check if variable1 is between variable2 and variable3
        if (variable1 > variable2 && variable1 < variable3) {
            System.out.println("Variabel1 berada di antara nilai variabel2 dan variabel3.");
        }
    }
}
