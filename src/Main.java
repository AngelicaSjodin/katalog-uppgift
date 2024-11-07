import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Katalog katalog = new Katalog();
        Scanner scanner = new Scanner (System.in);

    while (true) {
        System.out.println("Meny");
        System.out.println("1 Lägg till produkt");
        System.out.println("2 Visa katalogen");
        System.out.println("3 Stäng");

    int choice = scanner.nextInt();
    scanner.nextLine();

    if (choice == 1) {



    else if (choice == 2) {



    else if (choice == 3) {


   else {
                    System.out.println("Försök igen");
                }

    }
}