package Menus;

import java.util.Scanner;

public class SalesMenu {

    public void displaySalesMenu() {

        System.out.println("+-----------------------+");
        System.out.println("| *** Meniu vinzari *** |");
        System.out.println("+-----------------------+");
        System.out.println(" 1. Adauga vinzare");
        System.out.println(" 2. Vizualizare vinzari");
        System.out.println(" 0. Intoarcere la meniu principal");

        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.print("Alege o optiune: ");
            option = sc.nextInt();
            System.out.println();
            switch (option) {
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    // System.exit(0);
            }
            while (option != 0)
        }
    }

}
