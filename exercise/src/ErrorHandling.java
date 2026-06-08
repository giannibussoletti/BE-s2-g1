import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ErrorHandling {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int[] randomNumber = new int[5];

        for (int i = 0; i < randomNumber.length; i++) {
            Random random = new Random();
            randomNumber[i] = random.nextInt(1, 10);
        }
        System.out.println(Arrays.toString(randomNumber));
        int choice = 0;
        while (true) {
            System.out.println("Scegli una posizione nell'array da 1 a 5 (0 per terminare)");
            while (true) {
                if (scanner.hasNextInt()) {
                    choice = Integer.parseInt(scanner.nextLine());
                    if (choice >= 1 && choice <= 5) {
                        choice -= 1;
                        break;
                    } else if (choice == 0) {
                        System.out.println("Programma Terminato");
                        System.exit(0);
                    } else {
                        System.out.println("Il numero scelto non è valido, da 1 a 5");
                    }
                } else {
                    System.out.println("Non è un numero, numeri da 1 a 5");
                    scanner.nextLine();

                }
            }
            int choiceNumber = 0;
            System.out.println("Scegli il numero da inserire nell'array");
            while (true) {
                if (scanner.hasNextInt()) {
                    choiceNumber = Integer.parseInt(scanner.nextLine());
                    break;
                } else {
                    System.out.println("Non è un numero, inserisci un numero");
                    scanner.nextLine();
                }
            }
            randomNumber[choice] = choiceNumber;
            System.out.println("Il tuo nuovo array è: " + Arrays.toString(randomNumber));
        }
    }
}
