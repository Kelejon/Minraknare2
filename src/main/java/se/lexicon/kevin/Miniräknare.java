package se.lexicon.kevin;

import java.util.Scanner;

public class Miniräknare {


    private static Scanner scannner = new Scanner(System.in);

    public static void main(String args[]) {

        boolean keepAlive = true;
        while (keepAlive) {
            int alternativ;
            do {
                System.out.println("\n"+"Välkommen till miniräknaren!");
                System.out.print("(1) Addition");
                System.out.print("\n(2) Subtraktion");
                System.out.print("\n(3) Multiplikation");
                System.out.print("\n(4) Division");
                System.out.print("\n(5) Avsluta");
                System.out.print("\nVänligen välj ett alternativ från menyn: ");
                alternativ = scannner.nextInt();


                switch (alternativ) {
                    case 1:
                        System.out.print("Skriv in ett nummer : ");
                        int num1 = scannner.nextInt();
                        System.out.print("Skriv in nästa nummer : ");
                        int num2 = scannner.nextInt();
                        int res1 = num1 + num2;
                        System.out.print("Result = " + res1 + "\n");
                        break;
                    case 2:
                        System.out.print("Skriv in ett nummer : ");
                        int num3 = scannner.nextInt();
                        System.out.print("Skriv in nästa nummer : ");
                        int num4 = scannner.nextInt();
                        int res2 = num3 - num4;
                        System.out.print("Result = " + res2 + "\n");
                        break;
                    case 3:
                        System.out.print("Skriv in ett nummer : ");
                        int num5 = scannner.nextInt();
                        System.out.print("Skriv in nästa nummer : ");
                        int num6 = scannner.nextInt();
                        int res3 = num5 * num6;
                        System.out.print("Result = " + res3 + "\n");
                        break;
                    case 4:
                        System.out.print("Skriv in ett nummer : ");
                        int num7 = scannner.nextInt();
                        System.out.print("Skriv in nästa nummer : ");
                        int num8 = scannner.nextInt();
                        int res4 = num7 / num8;
                        System.out.print("Result = " + res4 + "\n");
                        break;
                    case 5:
                        System.out.print("Programmet avslutas: ");
                        keepAlive = false;
                        break;
                    default:
                        System.out.print("\nDu kan bara välja mellan 1 och 5!\n");
                        break;
                }
            }while(alternativ != 5);
        }
    }
}