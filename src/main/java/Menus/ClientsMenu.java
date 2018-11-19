package Menus;

import java.io.IOException;
import java.util.Scanner;

import static Menus.MainMenu.displayMainMenu;

public class ClientsMenu {

    public static void displayClientsMenu() throws IOException {

        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("+-----------------------+");
            System.out.println("| *** Meniu clienti *** |");
            System.out.println("+-----------------------+");
            System.out.println("\t1. Adauga client");
            System.out.println("\t2. Editeaza client");
            System.out.println("\t3. Sterge client");
            System.out.println("\t4. Vizualizeaza clienti");
            System.out.println("\t0. Intoarcere la meniul principal");
            System.out.print("Alege o optiune: ");
            option = sc.nextInt();
            System.out.println();
            switch (option) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    displayMainMenu();
                    break;
            }}
            while (option != 0);
    }
}
