package Menus;

import java.util.Scanner;

public class MainMenu {

    public void displayMainMenu() {

        System.out.println("+-------------------------+");
        System.out.println("| *** Meniu principal *** |");
        System.out.println("+-------------------------+");
        System.out.println(" 1. Stocuri");
        System.out.println(" 2. Clienti");
        System.out.println(" 3. Vinzari");
        System.out.println(" 0. Iesire");

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
                case 0:
                    System.exit(0);
            }
            while (option != 0)
        }
    }
}
