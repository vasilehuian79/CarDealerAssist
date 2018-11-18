package Menus;

import java.util.Scanner;

public class ClientsMenu {

    public void displayClientsMenu() {

        System.out.println("+-----------------------+");
        System.out.println("| *** Meniu clienti *** |");
        System.out.println("+-----------------------+");
        System.out.println(" 1. Adauga client");
        System.out.println(" 2. Editeaza client");
        System.out.println(" 3. Sterge client");
        System.out.println(" 4. Vizualizeaza clienti");
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
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    // System.exit(0);
            }
            while (option != 0)
        }
    }
}
