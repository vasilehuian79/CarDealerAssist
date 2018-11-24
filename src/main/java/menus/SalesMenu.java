package menus;

import java.io.IOException;
import java.util.Scanner;

import static menus.MainMenu.displayMainMenu;

public class SalesMenu {

    public static void displaySalesMenu() throws IOException {


        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("+-----------------------+");
            System.out.println("| *** Meniu vinzari *** |");
            System.out.println("+-----------------------+");
            System.out.println("\t1. Adauga vinzare");
            System.out.println("\t2. Vizualizare vinzari");
            System.out.println("\t0. Intoarcere la meniul principal");
            System.out.print("Alege o optiune: ");
            option = sc.nextInt();
            System.out.println();
            switch (option) {
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    displayMainMenu();
                    break;
            }}
            while (option != 0);
    }
}
